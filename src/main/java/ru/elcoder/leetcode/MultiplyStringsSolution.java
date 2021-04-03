package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

@Difficulty(DifficultyLevel.Medium)
public class MultiplyStringsSolution {
    public String multiply(String num1, String num2) {
        String result = "0";
        char[] digits = num2.toCharArray();
        for (int i = digits.length - 1; i >= 0; i--) {
            result = add(result, multiplyByDigit(num1, digits[i]));
            if (!"0".equals(num1)) {
                num1 = num1 + "0";
            }
        }
        return result;
    }

    private String add(String num1, String num2) {
        char[] c1 = (num1.length() > num2.length() ? num1 : num2).toCharArray();
        char[] c2 = (num1.length() > num2.length() ? num2 : num1).toCharArray();
        int overflow = 0;
        for (int i = 0; i < c1.length; i++) {
            final int d2 = (i >= c2.length) ? 0 : c2[c2.length - 1 - i] - '0';
            final int sum = c1[c1.length - 1 - i] + d2 - '0' + overflow;
            c1[c1.length - 1 - i] = (char) ((sum % 10) + '0');
            overflow = sum / 10;
        }
        if (overflow > 0) {
            return "1" + new String(c1);
        }
        return new String(c1);
    }

    public String multiplyByDigit(String num, char digit) {
        if (digit == '0') {
            return "0";
        }
        int overflow = 0;
        int multiplier = digit - '0';
        char[] digits = num.toCharArray();
        for (int i = num.length() - 1; i >= 0; i--) {
            int mul = (digits[i] - '0') * multiplier + overflow;
            digits[i] = (char) ('0' + (mul % 10));
            overflow = mul / 10;
        }
        if (overflow > 0) {
            return "" + overflow + new String(digits);
        }
        return new String(digits);
    }
}
