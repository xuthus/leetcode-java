package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

/**
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the
 * same color are adjacent, with the colors in the order red, white, and blue.
 * <p>
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 */
@Leetcode(
        number = 75,
        title = "Sort Colors",
        difficulty = DifficultyLevel.Medium,
        url = "https://leetcode.com/problems/sort-colors/"
)
public class SortColorsSolution {
    public void sortColors(int[] nums) {
        // just count the each color
        int i0 = 0;
        int i1 = 0;
        for (int num : nums) {
            if (num == 0) {
                i0++;
            } else if (num == 1) {
                i1++;
            }
        }
        i1 += i0; // because we use counter as offset
        // now fill the array
        for (int i = 0; i < nums.length; i++) {
            if (i < i0) {
                nums[i] = 0;
            } else if (i < i1) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }
}
