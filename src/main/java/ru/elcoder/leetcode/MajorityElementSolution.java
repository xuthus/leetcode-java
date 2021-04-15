package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 169,
        title = "Majority Element",
        url = "https://leetcode.com/problems/majority-element/"
)
public class MajorityElementSolution {
    public int majorityElement(int[] nums) {
        // count most used bits!
        int result = 0; // bit accumulator
        int mask = 1;  // bit mask - each step we shift it to the left side
        final int halfLength = nums.length >> 1;
        for (int i = 0; i < 32; i++) {
            int cnt = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & mask) != 0) {
                    cnt++;
                    if (cnt > halfLength || (j - cnt) > halfLength) { // optimization
                        break;
                    }
                }
            }
            if (cnt > halfLength) {
                result = result | mask;
            }
            mask = mask << 1;
        }
        return result;
    }
}
