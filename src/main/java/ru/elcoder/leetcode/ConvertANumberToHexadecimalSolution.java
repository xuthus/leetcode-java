package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 405,
        title = "Convert a Number to Hexadecimal",
        url = "https://leetcode.com/problems/convert-a-number-to-hexadecimal/"
)
public class ConvertANumberToHexadecimalSolution {
    private static final char[] HEX_DIGITS = "0123456789abcdef".toCharArray();

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        char[] chars = new char[8];
        int pos = 7;
        while (num != 0) {
            chars[pos--] = HEX_DIGITS[num & 0xF];
            num = num >>> 4;
        }
        return new String(chars, pos + 1, 7 - pos);
    }
}
