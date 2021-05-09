package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 371,
        title = "Sum of Two Integers",
        url = "https://leetcode.com/problems/sum-of-two-integers/"
)
public class SumOfTwoIntegersSolution {
    public int getSum(int a, int b) {
        int mask = 1;
        int result = 0;
        int overflow = 0;
        while (a != 0 || b != 0) {
            int a0 = a & 1;
            int b0 = b & 1;
            if ((a0 ^ b0 ^ overflow) == 1)
                result = result | mask;
            if ((a0 & b0) == 1)
                overflow = 1;
            else if (((a0 | b0) & overflow) == 1)
                overflow = 1;
            else
                overflow = 0;
            a = a >>> 1;
            b = b >>> 1;
            mask = mask << 1;
        }
        if (overflow > 0)
            result = result | mask;
        return result;
    }
}
