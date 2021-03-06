package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

/**
 * <pre>
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not,
 * return the index where it would be if it were inserted in order.
 *
 * Example 1:
 *  Input: nums = [1,3,5,6], target = 5
 *  Output: 2
 *
 * Example 2:
 *  Input: nums = [1,3,5,6], target = 2
 *  Output: 1
 *
 * Example 3:
 *  Input: nums = [1,3,5,6], target = 7
 *  Output: 4
 *
 * Example 4:
 *  Input: nums = [1,3,5,6], target = 0
 *  Output: 0
 *
 * Example 5:
 *  Input: nums = [1], target = 0
 *  Output: 0
 *
 * Constraints:
 *  1 <= nums.length <= 10e4
 *  -10e4 <= nums[i] <= 10e4
 *  nums contains distinct values sorted in ascending order.
 *  -10e4 <= target <= 10e4
 *
 *  https://leetcode.com/problems/search-insert-position/
 * </pre>
 */
@Difficulty(DifficultyLevel.Easy)
public class SearchInsertPositionSolution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int lo = 0;
        int hi = nums.length - 1;
        while (true) {
            if (target <= nums[lo]) {
                return lo;
            }
            if (target > nums[hi]) {
                return hi + 1;
            }
            int mid = (lo + hi) >> 1;
            if (mid == lo || target < nums[mid]) {
                hi = mid;
            } else {
                lo = mid;
            }
        }
    }
}
