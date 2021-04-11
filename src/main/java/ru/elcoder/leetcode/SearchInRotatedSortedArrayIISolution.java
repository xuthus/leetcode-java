package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 81,
        title = "Search in Rotated Sorted Array II",
        url = "https://leetcode.com/problems/search-in-rotated-sorted-array-ii/"
)
public class SearchInRotatedSortedArrayIISolution {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        return search(nums, target, 0, nums.length - 1);
    }

    private boolean search(int[] nums, int target, int i0, int i1) {
        if (Math.abs(i0 - i1) <= 1) {
            return target == nums[i0] || nums[i1] == target;
        }
        int med = (i0 + i1) >> 1;
        boolean c1 = between(nums[i0], nums[med], target);
        boolean c2 = between(nums[med], nums[i1], target);
        if (c1 && !c2) {
            return search(nums, target, i0, med);
        }
        if (c2 && !c1) {
            return search(nums, target, med, i1);
        }
        return search(nums, target, i0, med) || search(nums, target, med, i1);
    }

    private boolean between(int a, int b, int target) {
        return (target >= a && target <= b) || (target >= b && target <= a);
    }
}
