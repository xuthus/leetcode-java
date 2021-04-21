package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 190,
        title = "Reverse Bits",
        url = "https://leetcode.com/problems/reverse-bits/"
)
public class ReverseBitsSolution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int mask = 1;
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = result << 1;
            if ((n & mask) != 0) {
                result++;
            }
            mask = mask << 1;
        }
        return result;
    }
}
