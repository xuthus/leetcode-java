package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

@Difficulty(DifficultyLevel.Hard)
public class ReversePairsSolution {

    /*
    Given an array nums, we call (i, j) an important reverse pair if i < j and nums[i] > 2*nums[j].

    You need to return the number of important reverse pairs in the given array.

    Example1:
        Input: [1,3,2,3,1]
        Output: 2
    Example2:
        Input: [2,4,3,5,1]
        Output: 3
    Note:
        The length of the given array will not exceed 50,000.
        All the numbers in the input array are in the range of 32-bit integer.
    https://leetcode.com/problems/reverse-pairs/
    */
    public int reversePairs(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > (((long) nums[j]) << 1)) {
                    res++;
                }
            }
        }
        return res;
    }

    public int reversePairsOptimized(int[] nums) {
        int res = 0;
        // 1. create tree with value and count by all the array O(NlnN)
        // 2. scan the array, find count of total numbers, greater than current item 2x
        // 3. add to counter, remove from tree
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > (((long) nums[j]) << 1)) {
                    res++;
                }
            }
        }
        return res;
    }

    class CountableNode {
        int value;
        int count;
        CountableNode left;
        CountableNode right;

        void addChild(CountableNode child) {
            if (child.value < value) {
                child.addChild(left);
            } else if (child.value > value) {

            }
        }
    }

}
