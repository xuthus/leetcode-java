package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 268,
        title = "Missing Number",
        url = "https://leetcode.com/problems/missing-number/"
)
public class MissingNumberSolution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int num : nums)
            sum += num;
        return (nums.length + 1) * nums.length / 2 - sum;
    }
}
