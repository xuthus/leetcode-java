package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 443,
        title = "String Compression",
        url = "https://leetcode.com/problems/string-compression/"
)
public class StringCompressionSolution {
    public int compress(char[] chars) {
        if (chars.length < 2)
            return chars.length;
        int i = 1, j = 0;
        int len = 1;
        while (i < chars.length) {
            if (chars[i] != chars[i-1]) {
                chars[j++] = chars[i-1];
                if (len > 1) {
                    char[] num = ("" + len).toCharArray();
                    for (char c: num)
                        chars[j++] = c;
                }
                len = 0;
            }
            i++;
            len++;
        }
        chars[j++] = chars[i-1];
        if (len > 1) {
            char[] num = ("" + len).toCharArray();
            for (char c: num)
                chars[j++] = c;
        }
        return j;
    }
}
