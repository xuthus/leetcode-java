package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 415,
        title = "Add Strings",
        url = "https://leetcode.com/problems/add-strings/"
)
public class AddStringsSolution {
    public String addStrings(String num1, String num2) {
        int i = 0;
        int overflow = 0;
        int len1 = num1.length();
        int len2 = num2.length();
        StringBuilder sb = new StringBuilder(Math.max(len1, len2) + 1);
        while (i < len1 && i < len2) {
            int d1 = num1.charAt(len1 - i - 1) - '0';
            int d2 = num2.charAt(len2 - i - 1) - '0';
            i++;
            int sum = d1 + d2 + overflow;
            overflow = sum / 10;
            sb.append((char) (sum % 10 + '0'));
        }
        if (len2 > len1) {
            num1 = num2;
            len1 = len2;
        }
        while (i < len1) {
            int d1 = num1.charAt(len1 - i - 1) - '0';
            i++;
            int sum = d1 + overflow;
            overflow = sum / 10;
            sb.append((char) (sum % 10 + '0'));
        }
        if (overflow > 0)
            sb.append((char) (overflow + '0'));
        return sb.reverse().toString();
    }
}
