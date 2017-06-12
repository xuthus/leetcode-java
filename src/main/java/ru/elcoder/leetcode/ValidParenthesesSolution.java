package ru.elcoder.leetcode;

/**
 * Created by xuthus on 12.06.2017.
 */
public class ValidParenthesesSolution {
    /*
    Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
    https://leetcode.com/problems/valid-parentheses/
    */

    public boolean isValid(String s) {
        if (s == null || s.length() == 0)
            return true;
        char[] braces = new char[s.length()];
        int pos = 0;
        char pair;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            switch (c) {
                case '(':
                case '{':
                case '[':
                    braces[pos++] = c;
                    break;
                case ')':
                case ']':
                case '}':
                    if (pos == 0)
                        return false;
                    pair = c == ')' ? '(' : c == ']' ? '[' : '{';
                    if (braces[--pos] != pair)
                        return false;
                    break;
            }
        }
        return pos == 0;
    }
}
