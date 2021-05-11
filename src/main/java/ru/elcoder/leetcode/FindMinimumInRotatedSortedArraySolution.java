package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 153,
        title = "Find Minimum in Rotated Sorted Array",
        url = "https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/"
)
public class FindMinimumInRotatedSortedArraySolution {
    public int findMin(int[] nums) {
        int min = 0, max = nums.length - 1;
        while (min < max) {
            int mid = (min + max) >> 1;
            if (nums[min] < nums[mid] && nums[max] < nums[mid])
                min = mid;
            else if (nums[min] > nums[mid] && nums[max] > nums[mid])
                max = mid;
            else
                return Math.min(nums[min], nums[max]);
        }
        return Math.min(nums[min], nums[max]);
    }
}
