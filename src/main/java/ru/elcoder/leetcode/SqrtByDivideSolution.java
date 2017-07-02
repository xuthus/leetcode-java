package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

/**
 * Created by xuthus on 02.07.2017.
 */
@Difficulty(DifficultyLevel.Easy)
public class SqrtByDivideSolution {
    /*
    Implement int sqrt(int x).
    Compute and return the square root of x.

    https://leetcode.com/problems/sqrtx/
    */
    public int mySqrt(int x) {
        if (x < 2) return x; // special cases
        int max = 46341 > x ? x : 46341; // magic number :) maximum integer that square less than Integer.MAX_VALUE
        int min = 0;
        while (true) {
            int step = (max - min) >> 1;
            if (step == 0)
                return min;
            int n = step + min;
            int mul = n * n;
            if (mul == x)
                return n;
            if (mul > x)
                max = n;
            else
                min = n;
        }
    }
}
