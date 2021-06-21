package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1822,
        title = "Sign of the Product of an Array",
        url = "https://leetcode.com/problems/sign-of-the-product-of-an-array/"
)
public class SignOfProductOfArraySolution {
    public int arraySign(int[] nums) {
        int sign = 1;
        for (int num : nums) {
            if (num == 0)
                return 0;
            if (num < 0)
                sign = -sign;
        }
        return sign;
    }
}
