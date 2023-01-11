package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1304,
        title = "Find N Unique Integers Sum up to Zero",
        url = "https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/"
)
public class FindNUniqueIntegersSumUpToZeroSolution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int sum = 0;
        for (int i = 1; i < n; i++) {
            res[i] = i;
            sum += i;
        }
        res[0] = -sum;
        return res;
    }
}
