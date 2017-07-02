package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

/**
 * Created by xuthus on 02.07.2017.
 */
@Difficulty(DifficultyLevel.Medium)
@BeatsPercent(41.49)
public class PowSolution {
    /*
    Implement pow(x, n).
    https://leetcode.com/problems/powx-n/
    */
    public double myPow(double x, int n) {
        // will use binary representation of n
        boolean neg = n < 0;
        if (neg) n = -n;
        double result = 1.0;
        while (true) {
            if ((n & 1) == 1)
                result *= x;
            n >>>= 1;
            if (n == 0)
                return neg ? 1 / result : result;
            x *= x;
        }
    }

    public double myPowLongs(double x, int n) {
        // will use binary representation of n
        boolean neg = n < 0;
        long l = neg ? -((long) n) : n;
        double result = 1.0;
        while (true) {
            if ((l & 1) == 1)
                result *= x;
            l >>= 1;
            if (l == 0)
                return neg ? 1 / result : result;
            x *= x;
        }
    }
}
