package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 1833,
        title = "Maximum Ice Cream Bars",
        url = "https://leetcode.com/problems/maximum-ice-cream-bars/"
)
public class MaximumIceCreamBarsCountingSortSolution {
    public int maxIceCream(int[] costs, int coins) {
        int max = 0;
        for (int cost : costs) {
            max = Math.max(max, cost);
        }
        int[] counts = new int[max + 1];
        for (int cost : costs) {
            counts[cost]++;
        }
        int count = 0;
        for (int i = 1; i <= max; i++) {
            if (counts[i] > 0) {
                int maxCount = coins / i;
                if (maxCount == 0) {
                    return count;
                }
                int cnt = Math.min(maxCount, counts[i]);
                count += cnt;
                coins -= i * cnt;
            }
        }
        return count;
    }
}
