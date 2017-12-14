package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

import java.util.Arrays;

import static ru.elcoder.leetcode.utils.Utils.arrayOf;

@Difficulty(DifficultyLevel.Medium)
@BeatsPercent(43.15)
public class Closest3SumSolution {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int closestSum = Integer.MAX_VALUE;
        for (int n1 = 0; n1 < nums.length - 2; n1++) {
            int num1 = nums[n1];
            for (int n2 = n1 + 1; n2 < nums.length - 1; n2++) {
                int num2 = nums[n2];
                int num3 = findClosest(nums, n2 + 1, nums.length - 1, target - num1 - num2);
                System.out.println(Arrays.toString(arrayOf(num1, num2, num3)));
                int sum = num1 + num2 + num3;
                if (Math.abs(target - sum) < diff) {
                    diff = Math.abs(target - sum);
                    closestSum = sum;
                    if (diff == 0)
                        return target;
                }
            }
        }
        return closestSum;
    }

    int findClosest(int[] nums, int from, int to, int number) {
        if (number <= nums[from]) {
            return nums[from];
        }
        if (number >= nums[to]) {
            return nums[to];
        }
        if (to - from < 2) {
            if (Math.abs(nums[to] - number) > Math.abs(nums[from] - number))
                return nums[from];
            else
                return nums[to];
        }
        int mid = from + ((to - from + 1) >> 1);
        if (nums[mid] > number) {
            return findClosest(nums, from, mid, number);
        } else {
            return findClosest(nums, mid, to, number);
        }
    }

}
