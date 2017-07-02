package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

/**
 * Created by xuthus on 02.07.2017.
 */
@Difficulty(DifficultyLevel.Easy)
@BeatsPercent(73.31)
public class SqrtByDiffSolution {
    /*
    Implement int sqrt(int x).
    Compute and return the square root of x.

    https://leetcode.com/problems/sqrtx/
    */
    public int mySqrt(int x) {
        if (x < 2) return x; // special cases
        int bitCount = 0;
        int n = x;
        while (n > 0) {
            n = n >> 1;
            bitCount++;
        }
        n = x >> ((bitCount - 1) >> 1); // first approximation
        int n2 = x / n;
        while (n2 < n) {
            n = (n2 + n) >> 1; // hmm, [n = ((n2 - n) >> 1) + n;] beats only 19.45%
            n2 = x / n;
        }
        return n;
    }
}
