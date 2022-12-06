package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 507,
        title = "Perfect Number",
        url = "https://leetcode.com/problems/perfect-number/"
)
public class PerfectNumberSolution {
    public boolean checkPerfectNumber(int num) {
        if (num < 2) {
            return false;
        }
        int sqrt = ((int) Math.sqrt(num)) + 1;
        int sum = 1;
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                int i2 = num / i;
                if (i2 > i) {
                    sum += i;
                    sum += i2;
                }
                if (sum > num) {
                    return false;
                }
            }
        }
        return sum == num;
    }
}
