package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 198,
        title = "House Robber",
        url = "https://leetcode.com/problems/house-robber/"
)
public class HouseRobberSolution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        return robFrom(nums, 0, new HashMap<>());
    }

    public int robFrom(int[] nums, int from, Map<Integer, Integer> memo) {
        if (from >= nums.length) {
            return 0;
        }
        if (memo.containsKey(from)) {
            return memo.get(from);
        }
        int max = nums[from];
        for (int i = from; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            for (int j = i + 2; j < nums.length; j++) {
                max = Math.max(max, nums[i] + robFrom(nums, j, memo));
            }
        }
        memo.put(from, max);
        return max;
    }
}
