package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1837,
        title = "Sum of Digits in Base K",
        url = "https://leetcode.com/problems/sum-of-digits-in-base-k/"
)
public class SumOfDigitsInBaseKSolution {
    public int sumBase(int n, int k) {
        int sum = 0;
        while (n >= k) {
            sum += (n % k);
            n /= k;
        }
        return sum + n;
    }
}
