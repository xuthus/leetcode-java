package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

import java.util.Arrays;

/**
 * Created by xuthus on 07.07.2017.
 */
@Difficulty(DifficultyLevel.Easy)
@BeatsPercent(22.41) // of mine
public class PowerOfFourSolution {
    /*
    Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

    Example:
        Given num = 16, return true. Given num = 5, return false.

    Follow up: Could you solve it without loops/recursion?
    https://leetcode.com/problems/power-of-four/
    */

    private static final int[] powers = new int[]{
            1,
            4,
            16,
            64,
            256,
            1024,
            4096,
            16384,
            65536,
            262144,
            1048576,
            4194304,
            16777216,
            67108864,
            268435456,
            1073741824
    };

    // has the same beats percent as isPowerOfFour()... It is a limitation of Leetcode VMs, i think
    public boolean isPowerOfFourSortedArray(int num) {
        return num > 0 && Arrays.binarySearch(powers, num) >= 0;
    }

    public boolean isPowerOfFour(int num) {
        if (num <= 0) return false;
        return (0 == (num & (num - 1))) && (num & 0b01010101010101010101010101010101) != 0;
    }
}
