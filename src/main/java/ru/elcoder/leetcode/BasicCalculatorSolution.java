package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Hard,
        number = 224,
        title = "Basic Calculator",
        url = "https://leetcode.com/problems/basic-calculator/"
)
public class BasicCalculatorSolution {

    // s consists of digits, '+', '-', '(', ')', and ' '
    public int calculate(String s) {
        Expression exp = new Expression(s, 0);
        int result = getNumber(exp);
        char op = getOperation(exp);
        while (op != 0) {
            result = calc(result, op, getNumber(exp));
            op = getOperation(exp);
        }
        return result;
    }

    private int calc(int operand1, char op, int operand2) {
        switch (op) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
        }
        throw new IllegalArgumentException("wrong op");
    }

    public char getOperation(Expression exp) {
        while (exp.pos < exp.s.length()) {
            final char ch = exp.s.charAt(exp.pos++);
            if (ch == ' ')
                continue;
            return ch;
        }
        return (char) 0;
    }

    private int getNumber(Expression exp) {
        StringBuilder sb = new StringBuilder("0");
        while (exp.pos < exp.s.length()) {
            final char ch = exp.s.charAt(exp.pos);
            if (ch == ' ') {
                exp.pos++;
                continue;
            }
            if (ch >= '0' && ch <= '9') {
                sb.append(ch);
                exp.pos++;
                continue;
            }
            if (ch == '(')
                return getSubExpression(exp);
            return Integer.parseInt(sb.toString());
        }
        return Integer.parseInt(sb.toString());
    }

    private int getSubExpression(Expression exp) {
        String sub = extractSubExpression(exp);
        return calculate(sub);
    }

    public String extractSubExpression(Expression exp) {
        int count = 1;
        exp.pos++;
        int pos = exp.pos;
        while (count > 0) {
            char ch = exp.s.charAt(exp.pos++);
            switch (ch) {
                case '(':
                    count++;
                    break;
                case ')':
                    count--;
                    break;
            }
        }
        return exp.s.substring(pos, exp.pos - 1);
    }

    private static class Expression {
        String s;

        int pos;

        public Expression(String s, int pos) {
            this.s = s;
            this.pos = pos;
        }
    }
}
