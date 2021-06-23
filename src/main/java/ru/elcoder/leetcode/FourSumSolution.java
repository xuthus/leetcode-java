package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 18,
        title = "4Sum",
        url = "https://leetcode.com/problems/4sum/"
)
public class FourSumSolution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // sort all numbers
        // first number: loop for all numbers, skipping equal to previous one
        // second number: loop for all numbers to the right of first one, skipping equal to previous one
        // third and fourth numbers: find all pairs for target - num1 - num2
        // time complexity: O (N * N * N), space complexity O(N) for HashSet

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i != 0 && nums[i - 1] == nums[i])
                continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j != i + 1 && nums[j - 1] == nums[j])
                    continue;
                for (List<Integer> pair : twoSum(nums, target - nums[i] - nums[j], j + 1)) {
                    res.add(Arrays.asList(nums[i], nums[j], pair.get(0), pair.get(1)));
                }
            }
        }
        return res;
        // maybe better
        // create Map<Int, List<Pair[Int, Int]>>
        //   where key is all possible sums for any 2 numbers, O(N*N)
        // first number: loop for all numbers, skipping equal to previous one
        // second number: loop for all numbers to the right of first one, skipping equal to previous one
        // third and fourth numbers: find all pairs for target - num1 - num2 in precalculated HashMap
        // time complexity: O (N*N) + O(N*N*1) = O(N*N), space complexity O(N*N) for HashMap
    }

    List<List<Integer>> twoSum(int[] nums, int target, int from) {
        List<List<Integer>> res = new ArrayList<>();
        int start = from;
        int to = nums.length - 1;
        while (from < to) {
            if (from > start && nums[from] == nums[from - 1] && to < nums.length - 1 && nums[to] == nums[to + 1]) {
                from++;
                continue;
            }
            int diff = target - nums[from] - nums[to];
            if (diff == 0) {
                res.add(Arrays.asList(nums[from], nums[to]));
                from++;
                to--;
            } else if (diff < 0) {
                to--;
            } else
                from++;
        }
        return res;
    }
}
