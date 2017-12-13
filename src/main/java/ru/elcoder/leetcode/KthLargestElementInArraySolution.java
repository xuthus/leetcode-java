package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

import java.util.PriorityQueue;

@Difficulty(DifficultyLevel.Medium)
@BeatsPercent(66.86)
public class KthLargestElementInArraySolution {
    /*
    Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

    For example,
    Given [3,2,1,5,6,4] and k = 2, return 5.

    Note:
    You may assume k is always valid, 1 ≤ k ≤ array's length.
    https://leetcode.com/problems/kth-largest-element-in-an-array/
    */
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k);
        for (int num : nums) {
            if (queue.size() < k) {
                queue.offer(num);
            } else {
                if (queue.peek() < num) {
                    queue.remove();
                    queue.offer(num);
                }
            }
        }
        return queue.peek();
    }
}
