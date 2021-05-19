package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashSet;
import java.util.Set;

@Leetcode(
        difficulty = DifficultyLevel.Hard,
        number = 128,
        title = "Longest Consecutive Sequence",
        url = "https://leetcode.com/problems/longest-consecutive-sequence/"
)
public class LongestConsecutiveSequenceSolution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++)
            numbers.add(nums[i]);
        int max = 0;
        for (int i = 0; i < nums.length; i++)
            if (!numbers.contains(nums[i] - 1)) {
                int j = nums[i] + 1;
                while (numbers.contains(j))
                    j++;
                max = Math.max(max, j - nums[i]);
            }
        return max;
    }
}
