package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by xuthus on 02.07.2017.
 */
@Difficulty(DifficultyLevel.Easy)
@BeatsPercent(Double.NaN) // Sorry. We do not have enough accepted submissions to show runtime distribution chart.
public class SumOfSquareNumbersSolution {
    /*
    Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.

    Example 1:
        Input: 5
        Output: True
        Explanation: 1 * 1 + 2 * 2 = 5
    Example 2:
        Input: 3
        Output: False

    https://leetcode.com/contest/leetcode-weekly-contest-39/problems/sum-of-square-numbers/
    */

    public boolean judgeSquareSum(int c) {
        int num1 = (int) Math.sqrt(c);
        if (num1 * num1 == c)
            return true;

        Set<Integer> squares = new HashSet<>(num1);
        for (int i = 1; i <= num1; i++)
            squares.add(i * i);

        int mid = num1 / 2 - 1;
        for (int i = num1; i > mid; i--) {
            int diff = c - i * i;
            if (squares.contains(diff))
                return true;
        }
        return false;
    }

}
