package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

/**
 * Created by xuthus on 02.07.2017.
 */
@Difficulty(DifficultyLevel.Easy)
@BeatsPercent(41.14)
public class ValidPerfectSquareSolution {
    /*
    Given a positive integer num, write a function which returns True if num is a perfect square else False.
    Note: Do not use any built-in library function such as sqrt.

    Example 1:
        Input: 16
        Returns: True
    Example 2:
        Input: 14
        Returns: False
    https://leetcode.com/problems/valid-perfect-square/
    */

    public boolean isPerfectSquare(int num) {
        if (num < 2) return true; // special cases
        int max = 46341; // magic number :) maximum integer that square less than Integer.MAX_VALUE
        int min = 0;
        while (true) {
            int step = (max - min) >> 1;
            if (step == 0)
                return false;
            int n = step + min;
            int mul = n * n;
            if (mul == num)
                return true;
            if (mul > num)
                max = n;
            else
                min = n;
        }
    }
}
