package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1848,
        title = "Minimum Distance to the Target Element",
        url = "https://leetcode.com/problems/minimum-distance-to-the-target-element/"
)
public class MinimumDistanceToTargetElementSolution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == target)
                min = Math.min(min, Math.abs(start - i));
        return min;
    }
}
