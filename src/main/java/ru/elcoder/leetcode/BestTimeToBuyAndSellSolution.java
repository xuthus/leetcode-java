package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

/**
 * Created by Sergey Yanzin (xuthus@yandex.ru) on 04.09.2017.
 */
@Difficulty(DifficultyLevel.Easy)
@BeatsPercent(44.12)
public class BestTimeToBuyAndSellSolution {
    /*
    Say you have an array for which the ith element is the price of a given stock on day i.
    If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
    design an algorithm to find the maximum profit.

    Example 1:
        Input: [7, 1, 5, 3, 6, 4]
        Output: 5
        max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)

    Example 2:
        Input: [7, 6, 4, 3, 1]
        Output: 0
        In this case, no transaction is done, i.e. max profit = 0.
    https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    */

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2)
            return 0;

        int min = prices[0];
        int maxDiff = 0;
        for (int i = 1; i < prices.length; i++) {
            if ((prices[i] - min) > maxDiff) {
                maxDiff = prices[i] - min;
            } else if (prices[i] < min) {
                min = prices[i];
            }
        }

        return maxDiff;
    }
}
