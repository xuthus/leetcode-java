package ru.elcoder.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by xuthus on 27.04.2017.
 */
public class TwoSumsSolution {
    /*
    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    Example:
    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
    https://leetcode.com/problems/two-sum/
    */
    public int[] twoSum(int[] nums, int target) {
        Integer[] indices = new Integer[nums.length];
        for (int i = 0; i < indices.length; i++)
            indices[i] = i;
        Arrays.sort(indices, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(nums[o1], nums[o2]);
            }
        });

        int upperIndex = nums.length - 1;
        int lowerIndex = 0;
        while (lowerIndex < upperIndex) {
            int sum = nums[indices[lowerIndex]] + nums[indices[upperIndex]];
            if (sum == target) {
                return new int[]{indices[lowerIndex], indices[upperIndex]};
            }
            if (sum > target) {
                upperIndex--;
            } else {
                lowerIndex++;
            }
        }
        return new int[]{};
    }
}