package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 45,
        title = "Jump Game II",
        url = "https://leetcode.com/problems/jump-game-ii/"
)
public class JumpGameIISolution {
    /*
    You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:

0 <= j <= nums[i] and
i + j < n
Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].

Example 1:

Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.

Example 2:

Input: nums = [2,3,0,1,4]
Output: 2
     */
    public int jump(int[] nums) {
        return minPath(nums, nums.length - 1, new int[nums.length]);
    }

    private int minPath(int[] nums, int lastPos, int[] paths) {
        if (lastPos == 0) {
            return 0;
        }
        if (paths[lastPos] != 0) {
            return paths[lastPos];
        }
        int min = Integer.MAX_VALUE;
        for (int i = lastPos - 1; i >= 0; i--) {
            if (nums[i] + i >= lastPos) {
                min = Math.min(min, minPath(nums, i, paths) + 1);
            }
        }
        paths[lastPos] = min;
        return min;
    }
}
