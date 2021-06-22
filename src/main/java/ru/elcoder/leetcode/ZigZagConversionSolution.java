package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 6,
        title = "ZigZag Conversion",
        url = "https://leetcode.com/problems/zigzag-conversion/"
)
public class ZigZagConversionSolution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int slen = s.length();
        int cnt = 0;
        char[] sb = new char[slen];
        for (int r = 0; r < numRows; r++) {
            int i = r;
            while (i < slen) {
                sb[cnt++] = s.charAt(i);
                int next = i + (numRows - 1) * 2;
                int i2 = next - r * 2;
                if (next != i2 && i != i2 && i2 < slen)
                    sb[cnt++] = s.charAt(i2);
                if (i == next)
                    break;
                i = next;
            }
        }
        return new String(sb);
    }
}
