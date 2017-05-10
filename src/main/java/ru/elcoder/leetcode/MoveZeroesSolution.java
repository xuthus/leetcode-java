package ru.elcoder.leetcode;

/**
 * Created by xuthus on 05.05.2017.
 */
public class MoveZeroesSolution {
    /*
    Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of
    the non-zero elements.

    For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

    Note:
    You must do this in-place without making a copy of the array.
    Minimize the total number of operations.
    https://leetcode.com/problems/move-zeroes
     */
    public void moveZeroes(int[] nums) {
        if (nums == null)
            return;
        int i = 0, j = 0;
        while (i < nums.length && j < nums.length) {
            while (i < nums.length && nums[i] != 0) i++;
            j = i + 1;
            while (j < nums.length && nums[j] == 0) j++;
            if (j < nums.length) {
                nums[i] = nums[j];
                nums[j] = 0;
            }
        }
    }
}
