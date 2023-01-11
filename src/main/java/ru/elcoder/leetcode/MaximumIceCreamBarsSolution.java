package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 1833,
        title = "Maximum Ice Cream Bars",
        url = "https://leetcode.com/problems/maximum-ice-cream-bars/"
)
public class MaximumIceCreamBarsSolution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for (int cost : costs) {
            if (cost > coins) {
                return count;
            }
            count++;
            coins -= cost;
        }
        return count;
    }
}
