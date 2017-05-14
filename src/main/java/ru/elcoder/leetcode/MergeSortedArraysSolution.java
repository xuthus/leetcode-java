package ru.elcoder.leetcode;

/**
 * Created by xuthus on 14.05.2017.
 */
public class MergeSortedArraysSolution {
    /*
    Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

    Note:
    You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements
    from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
    https://leetcode.com/problems/merge-sorted-array/
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2 == null || nums2.length == 0) return;
        int i = m + n - 1;
        while (i >= 0 && m > 0 && n > 0)
            nums1[i--] = nums1[m - 1] > nums2[n - 1] ? nums1[--m] : nums2[--n];
        while (n > 0)
            nums1[i--] = nums2[--n];
    }
}
