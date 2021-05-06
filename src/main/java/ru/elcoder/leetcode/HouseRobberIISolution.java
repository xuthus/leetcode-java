package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 213,
        title = "House Robber II",
        url = "https://leetcode.com/problems/house-robber-ii/"
)
public class HouseRobberIISolution {
    public int rob(int[] nums) {
        Map<Integer, Integer> memo = new HashMap<>();
        return Math.max(
                nums[0] + rob(nums, 2, -1, memo),
                rob(nums, 1, 0, memo)
        );
    }

    private int rob(int[] nums, int from, int skipLast, Map<Integer, Integer> memo) {
        int key = skipLast == 0 ? from : -from;
        if (memo.containsKey(key))
            return memo.get(key);
        int to = nums.length + skipLast - 1;
        if (from > to) {
            memo.put(key, 0);
            return 0;
        }
        int max = Math.max(
                nums[from] + rob(nums, from + 2, skipLast, memo),
                rob(nums, from + 1, skipLast, memo)
        );
        memo.put(key, max);
        return max;
    }
}
