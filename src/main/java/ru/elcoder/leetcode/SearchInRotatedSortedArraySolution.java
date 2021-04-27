package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 33,
        title = "Search in Rotated Sorted Array",
        url = "https://leetcode.com/problems/search-in-rotated-sorted-array/"
)
public class SearchInRotatedSortedArraySolution {
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) >> 1;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] >= nums[lo]) {
                if (nums[lo] <= target && target <= nums[mid])
                    hi = mid - 1;
                else
                    lo = mid + 1;
            } else {
                if (nums[mid] <= target && target <= nums[hi])
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }
        }
        return -1;
    }
}
