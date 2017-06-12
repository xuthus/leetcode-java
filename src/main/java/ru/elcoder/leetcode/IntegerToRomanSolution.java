package ru.elcoder.leetcode;

/**
 * Created by xuthus on 01.05.2017.
 */
public class IntegerToRomanSolution {
    /*
    Given an integer, convert it to a roman numeral.
    Input is guaranteed to be within the range from 1 to 3999.
    https://leetcode.com/problems/integer-to-roman/
    */
    private static final char[] ROMAN_DIGITS = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};

    public String intToRoman(int num) {
        char[] chars = new char[4 * 4]; // VIII * 4
        int orderIndex = 0;
        int pos = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) {
            } else if (digit <= 3)
                for (int j = 0; j < digit; j++)
                    chars[pos++] = ROMAN_DIGITS[orderIndex];
            else if (digit == 4) {
                chars[pos++] = ROMAN_DIGITS[orderIndex + 1];
                chars[pos++] = ROMAN_DIGITS[orderIndex];
            } else if (digit >= 5 && digit <= 8) {
                for (int j = 5; j < digit; j++)
                    chars[pos++] = ROMAN_DIGITS[orderIndex];
                chars[pos++] = ROMAN_DIGITS[orderIndex + 1];
            } else {
                chars[pos++] = ROMAN_DIGITS[orderIndex + 2];
                chars[pos++] = ROMAN_DIGITS[orderIndex];
            }
            orderIndex += 2;
            num /= 10;
        }
        for (int i = 0; i < pos / 2; i++) {
            char t = chars[i];
            chars[i] = chars[pos - i - 1];
            chars[pos - i - 1] = t;
        }
        return new String(chars, 0, pos);
    }
}
