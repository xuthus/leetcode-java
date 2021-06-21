package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1827,
        title = "Minimum Operations to Make the Array Increasing",
        url = "https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/"
)
public class MinimumOperationsToMakeArrayIncreasingSolution {
    public int minOperations(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i])
                continue;
            res = res + nums[i] - nums[i + 1] + 1;
            nums[i + 1] = nums[i] + 1;
        }
        return res;
    }
}
