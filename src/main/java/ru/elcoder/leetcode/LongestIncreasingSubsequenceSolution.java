package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 300,
        title = "Longest Increasing Subsequence",
        url = "https://leetcode.com/problems/longest-increasing-subsequence/"
)
public class LongestIncreasingSubsequenceSolution {
    public int lengthOfLIS(int[] nums) {
        int max = 1;
        int[] memo = new int[nums.length];
        Arrays.fill(memo, 1);
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i] && memo[j] >= memo[i]) {
                    memo[i] = memo[j] + 1;
                    if (memo[i] > max) {
                        max = memo[i];
                    }
                }
            }
        }
        return max;
    }
}
