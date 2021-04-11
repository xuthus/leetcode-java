package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 279,
        title = "Perfect Squares",
        url = "https://leetcode.com/problems/perfect-squares/"
)
public class PerfectSquaresSolution {
    int[] nums;

    Map<Integer, Integer> memo = new HashMap<>();

    public int numSquares(int n) {
        if (n < 2) {
            return n;
        }
        List<Integer> list = new ArrayList<>();
        int p = 0;
        for (int i = 1; p <= n; i++) {
            p = i * i;
            list.add(p);
        }
        nums = list.stream().mapToInt(i -> i).toArray();
        return findMinimum(n);
    }

    private int findMinimum(int n) {
        if (n < 2) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int min = Integer.MAX_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (n >= nums[i]) {
                final int minimum = 1 + findMinimum(n - nums[i]);
                if (min > minimum) {
                    min = minimum;
                }
            }
        }
        memo.put(n, min);
        return min;
    }
}
