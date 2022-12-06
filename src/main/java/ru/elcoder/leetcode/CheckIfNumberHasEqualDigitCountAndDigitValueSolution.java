package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 2283,
        title = "Check if Number Has Equal Digit Count and Digit Value",
        url = "https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/"
)
public class CheckIfNumberHasEqualDigitCountAndDigitValueSolution {
    public boolean digitCount(String num) {
        int[] counts = new int[num.length()];
        char[] chars = num.toCharArray();
        for (char c : chars) {
            int digit = c - '0';
            if (digit >= num.length()) {
                return false;
            }
            counts[digit]++;
        }
        for (int i = 0; i < num.length(); i++) {
            if (counts[i] != num.charAt(i) - '0') {
                return false;
            }
        }
        return true;
    }
}
