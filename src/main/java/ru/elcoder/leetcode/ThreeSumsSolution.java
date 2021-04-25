package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 15,
        title = "3Sum",
        url = "https://leetcode.com/problems/3sum/"
)
public class ThreeSumsSolution {
    // N^2
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3)
            return Collections.emptyList();
        Arrays.sort(nums);
        final List<List<Integer>> triplets = new LinkedList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[j] + nums[k];
                if (nums[i] == -sum) {
                    triplets.add(Arrays.asList(-sum, nums[j], nums[k]));
                    while (nums[k] == nums[k - 1] && j < k) k--;
                    while (nums[j] == nums[j + 1] && j < k) j++;
                    k--;
                    j++;
                } else if (sum > -nums[i]) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return triplets;
    }

    // N^2*Log(N)
    public List<List<Integer>> threeSum2(int[] nums) {
        if (nums.length < 3)
            return Collections.emptyList();
        Arrays.sort(nums);
        final ArrayList<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            if (nums[i] > 0)
                break;
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[j] == nums[j - 1] && j > i + 1)
                    continue;
                final int sum = nums[i] + nums[j];
                if (sum > 0)
                    break;
                int k = Arrays.binarySearch(nums, j + 1, nums.length, -sum);
                if (k > j)
                    triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
            }
        }
        return triplets;
    }
}
