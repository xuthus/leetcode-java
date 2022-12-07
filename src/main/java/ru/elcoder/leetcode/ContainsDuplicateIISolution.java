package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashSet;
import java.util.Set;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 219,
        title = "Contains Duplicate II",
        url = "https://leetcode.com/problems/contains-duplicate-ii/"
)
public class ContainsDuplicateIISolution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> numbers = new HashSet<>();
        int max = Math.min(k, nums.length - 1);
        for (int i = 0; i <= max; i++) {
            if (numbers.contains(nums[i])) {
                return true;
            }
            numbers.add(nums[i]);
        }
        for (int i = k + 1; i < nums.length; i++) {
            numbers.remove(nums[i - k - 1]);
            if (numbers.contains(nums[i])) {
                return true;
            }
            numbers.add(nums[i]);
        }
        return false;
    }
}
