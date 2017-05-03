package ru.elcoder.leetcode;

/**
 * Created by xuthus on 03.05.2017.
 */
public class SingleNumberSolution {
    /*
    Given an array of integers, every element appears twice except for one. Find that single one.
    Note:
    Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
    https://leetcode.com/problems/single-number
    */
    public int singleNumber(int[] nums) {
        int single = 0;
        int i = -1;
        int len = nums.length;
        while (++i < len) {     // for (int num : nums)
            single ^= nums[i];  // XOR operation - N xor N = 0, 0 xor M = M
        }
        return single;
    }
}
