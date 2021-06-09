package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1869,
        title = "Longer Contiguous Segments of Ones than Zeros",
        url = "https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/"
)
public class LongerContiguousSegmentsOfOnesThanZerosSolution {
    public boolean checkZeroOnes(String s) {
        int len1 = 0, len0 = 0, max1 = 0, max0 = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '0') {
                if (len0 == 0) {
                    max1 = Math.max(max1, len1);
                    len1 = 0;
                }
                len0++;
            } else {
                if (len1 == 0) {
                    max0 = Math.max(max0, len0);
                    len0 = 0;
                }
                len1++;
            }
        max0 = Math.max(max0, len0);
        max1 = Math.max(max1, len1);
        return max1 > max0;
    }
}
