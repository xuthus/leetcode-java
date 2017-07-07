package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

import java.util.Arrays;

/**
 * Created by xuthus on 07.07.2017.
 */
@Difficulty(DifficultyLevel.Easy)
@BeatsPercent(38.66)
public class PowerOfThreeSolution {
    /*
    Given an integer, write a function to determine if it is a power of three.

    Follow up:
        Could you do it without using any loop / recursion?
    https://leetcode.com/problems/power-of-three/
    */

    private static final int MOST_INTEGER_POWER_OF_3 = 1162261467;

    private static final int[] numbers = new int[]{
            1,
            3,
            9,
            27,
            81,
            243,
            729,
            2187,
            6561,
            19683,
            59049,
            177147,
            531441,
            1594323,
            4782969,
            14348907,
            43046721,
            129140163,
            387420489,
            MOST_INTEGER_POWER_OF_3  // <-- most 32bit power of 3
    };

    public boolean isPowerOfThree(int n) {
        return Arrays.binarySearch(numbers, n) >= 0;
    }

    // really cool solution, but not mine =)
    public boolean isPowerOfThreeIdeal(int n) {
        return n >= 0 && MOST_INTEGER_POWER_OF_3 % n == 0;
    }


}
