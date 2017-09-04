package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

/**
 * Created by Sergey Yanzin (xuthus@yandex.ru) on 04.09.2017.
 */
@Difficulty(DifficultyLevel.Easy)
@BeatsPercent(23.55)
public class MaximumSubarraySolution {
    /*
    Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
    For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
    the contiguous subarray [4,-1,2,1] has the largest sum = 6.

    More practice:
    If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach,
    which is more subtle.
    https://leetcode.com/problems/maximum-subarray/
    */

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int prevMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > prevMax && prevMax < 0)
                prevMax = nums[i];
            else
                prevMax += nums[i];
            if (prevMax > max)
                max = prevMax;
        }
        return max;
    }

    // naive approach - very slow
    public int maxSubArrayNaive(int[] nums) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int iMax = calcMaxBeforeNaive(i, nums);
            if (iMax > max)
                max = iMax;
        }
        return max;
    }

    private int calcMaxBeforeNaive(int i, int[] nums) {
        int max = nums[i];
        int iMax = nums[i];
        for (int j = i - 1; j >= 0; j--) {
            if (j >= 0) {
                iMax += nums[j];
            }
            if (iMax > max)
                max = iMax;
        }
        return max;
    }

}
