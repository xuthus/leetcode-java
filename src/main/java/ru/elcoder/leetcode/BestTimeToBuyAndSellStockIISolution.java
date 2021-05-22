package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 122,
        title = "Best Time to Buy and Sell Stock II",
        url = "https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/"
)
public class BestTimeToBuyAndSellStockIISolution {
    public int maxProfit(int[] prices) {
        return maxProfit(prices, 0);
    }

    public int maxProfit(int[] prices, int pos) {
        if (prices == null || pos > (prices.length - 2))
            return 0;
        // find increasing sequence
        int sum = 0;
        int min = prices[pos];
        pos++;
        while (pos < prices.length) {
            int diff = prices[pos] - min;
            if (diff <= sum && sum > 0) {
                break;
            }
            min = Math.min(prices[pos], min);
            sum = Math.max(diff, sum);
            pos++;
        }
        // return sum + maxProfit(next)
        return sum + maxProfit(prices, pos);
    }
}
