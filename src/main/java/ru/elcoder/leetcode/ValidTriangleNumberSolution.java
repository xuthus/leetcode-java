package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 611,
        title = "Valid Triangle Number",
        url = "https://leetcode.com/problems/valid-triangle-number/"
)
public class ValidTriangleNumberSolution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 0)
                continue;
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[j] == 0)
                    continue;
                int sum2 = nums[i] + nums[j];
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[k] == 0)
                        continue;
                    if (nums[k] < sum2)
                        res++;
                    else
                        break;
                }
            }
        }
        return res;
    }
}
