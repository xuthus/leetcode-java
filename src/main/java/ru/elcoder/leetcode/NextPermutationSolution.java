package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 31,
        title = "Next Permutation",
        url = "https://leetcode.com/problems/next-permutation/"
)
public class NextPermutationSolution {
    public void nextPermutation(int[] nums) {
        // do nothing
        // from the right to left
        //   find first n[j] < n[j+1]
        // if NIL
        //   sort(n)
        //   return
        // find min(n[for i in j+1 .. -1 if n[i] > n[j]])
        // exchange n[j] with n[i]
        // sort(n[j+1 .. -1])
        if (nums.length == 1)
            return;
        int pivot = -1;
        for (int j = nums.length - 2; j >= 0; j--) {
            if (nums[j] < nums[j + 1]) {
                pivot = j;
                break;
            }
        }
        if (pivot == -1) {
            Arrays.sort(nums);
            return;
        }
        int min = Integer.MAX_VALUE;
        int minPos = -1;
        for (int i = pivot + 1; i < nums.length; i++) {
            if (nums[pivot] < nums[i] && min > nums[i]) {
                minPos = i;
                min = nums[i];
            }
        }
        int tmp = nums[pivot];
        nums[pivot] = nums[minPos];
        nums[minPos] = tmp;
        Arrays.sort(nums, pivot + 1, nums.length);
    }
}
