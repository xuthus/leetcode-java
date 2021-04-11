package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 525,
        title = "Contiguous Array",
        url = "https://leetcode.com/problems/contiguous-array/"
)
public class ContiguousArraySolution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] sums = new int[nums.length << 1 + 1]; // HashMap works slower
        Arrays.fill(sums, -1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 1 ? 1 : -1;
            sums[sum + nums.length] = i;  // sums contains most right sum position
        }
        sum = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sums[sum + nums.length] != -1) {
                int len = sums[sum + nums.length] - i + 1;
                if (len > max) {
                    max = len;
                }
            }
            sum += nums[i] == 1 ? 1 : -1;
        }
        return max;
    }
}
