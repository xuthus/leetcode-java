package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

/**
 * Created by xuthus on 07.07.2017.
 */
@Difficulty(DifficultyLevel.Easy)
@BeatsPercent(22.41) // of mine
public class PowerOfTwoSolution {
    /*
    Given an integer, write a function to determine if it is a power of two.
    https://leetcode.com/problems/power-of-two/
    */

    // cool but not mine =)
    public boolean isPowerOfTwoIdeal(int n) {
        if (n <= 0) return false;
        return 0 == (n & (n - 1)); // just only one bit contains 1
    }

    // mine but not cool =)
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        // most significant bit containing 1
        int v = n - 1;
        v |= v >> 1;
        v |= v >> 2;
        v |= v >> 4;
        v |= v >> 8;
        v |= v >> 16;
        return ++v == n;
    }
}
