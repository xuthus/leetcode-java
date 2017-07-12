package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

/**
 * Created by xuthus on 12.07.2017.
 */
@Difficulty(DifficultyLevel.Easy)
@BeatsPercent(88.84)
public class MaximumProductOfThreeNumbersSolution {
    /*
    Given an integer array, find three numbers whose product is maximum and output the maximum product.
    Example 1:
        Input: [1,2,3]
        Output: 6
    Example 2:
        Input: [1,2,3,4]
        Output: 24
    Note:
        The length of the given array will be in range [3,104] and all elements are in the range [-1000, 1000].
        Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
    https://leetcode.com/problems/maximum-product-of-three-numbers/
    */

    public int maximumProduct(int[] nums) {
        int[] max = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        int[] min = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};

        for (int num : nums) {
            if (num > max[0]) {
                max[0] = num;
                sort(max);
            }
            if (num < 0 && num < min[0]) {
                min[0] = num;
                if (min[0] < min[1]) {
                    min[0] = min[1];
                    min[1] = num;
                }
            }
        }


        int max1 = min[0] < 0 && min[1] < 0 ? min[0] * min[1] * max[2] : Integer.MIN_VALUE;
        int max2 = max[0] * max[1] * max[2];
        return max2 > max1 ? max2 : max1;
    }

    private void sort(int[] max) {
        int t;
        if (max[0] > max[1]) {
            t = max[1];
            max[1] = max[0];
            max[0] = t;

            if (max[1] > max[2]) {
                t = max[2];
                max[2] = max[1];
                max[1] = t;
            }
        }
    }
}
