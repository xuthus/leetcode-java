package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 34,
        title = "Find First and Last Position of Element in Sorted Array",
        url = "https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/"
)
public class FindFirstAndLastPositionOfElementInSortedArraySolution {
    public int[] searchRange(int[] nums, int target) {
        int pos = Arrays.binarySearch(nums, target);
        if (pos < 0)
            return new int[]{-1, -1};
        // find left border
        int left = 0, right = pos;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (nums[mid] == target)
                right = mid;
            else
                left = mid + 1;
        }
        // find right border
        right = nums.length - 1;
        while (pos < right) {
            int mid = (pos + right + 1) >> 1;
            if (nums[mid] == target)
                pos = mid;
            else
                right = mid - 1;
        }
        return new int[]{left, right};
    }
}
