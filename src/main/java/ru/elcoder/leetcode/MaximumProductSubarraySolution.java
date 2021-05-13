package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 152,
        title = "Maximum Product Subarray",
        url = "https://leetcode.com/problems/maximum-product-subarray/"
)
public class MaximumProductSubarraySolution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;

        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            max = Math.max(max, product);
            if (product == 0)
                product = 1;
        }

        // and we need backward loop for the cases when we have odd quantity of negative numbers
        // foe instance, [100,-1,200] give max=100 in forward direction, but 200 in backward one
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            product *= nums[i];
            max = Math.max(max, product);
            if (product == 0)
                product = 1;
        }

        return max;
    }
}
