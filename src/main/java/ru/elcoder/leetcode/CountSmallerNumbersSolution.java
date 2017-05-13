package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BinarySearchTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by xuthus on 05.05.2017.
 */
public class CountSmallerNumbersSolution {
    /*
    You are given an integer array nums and you have to return a new counts array. The counts array has the property
    where counts[i] is the number of smaller elements to the right of nums[i].

    Example:

    Given nums = [5, 2, 6, 1]

    To the right of 5 there are 2 smaller elements (2 and 1).
    To the right of 2 there is only 1 smaller element (1).
    To the right of 6 there is 1 smaller element (1).
    To the right of 1 there is 0 smaller element.
    Return the array [2, 1, 1, 0].
    https://leetcode.com/problems/count-of-smaller-numbers-after-self
     */

    // too easy, too slow
    // very slow O(N2)
    public List<Integer> countSmallerEasyAndSlow(int[] nums) {
        // using scan
        List<Integer> counts = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] > nums[j])
                    count++;
            counts.add(count);
        }
        return counts;
    }

    // solution with unbalanced binary search tree
    // works more faster - O(NlogN)
    public List<Integer> countSmallerWithBST(int[] nums) {
        Integer[] counts = new Integer[nums.length];
        BinarySearchTree tree = new BinarySearchTree();
        for (int i = nums.length - 1; i >= 0; i--) {
            counts[i] = tree.countLessThan(nums[i]);
            tree.insert(nums[i]);
        }
        return Arrays.asList(counts);
    }
}
