package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;
import java.util.HashMap;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 322,
        title = "Coin Change",
        url = "https://leetcode.com/problems/coin-change/"
)
public class CoinChangeSolution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0)
            return 0;
        Arrays.sort(coins);
        final int result = shortestCoinChange(coins, amount, new HashMap<>());
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private int shortestCoinChange(int[] coins, int amount, HashMap<Integer, Integer> memo) {
        if (amount < coins[0])
            return Integer.MAX_VALUE;
        if (memo.containsKey(amount))
            return memo.get(amount);
        int min = Integer.MAX_VALUE;

        int from = coins.length - 1;
        if (coins[from] < amount) {
            from = Math.abs(Arrays.binarySearch(coins, amount)) - 2;
        }
        for (int i = from; i >= 0; i--) {
            int coin = coins[i];
            if (coin <= amount) {
                if (coin == amount) {
                    min = 1;
                    break;
                }
                int len = 1 + shortestCoinChange(coins, amount - coin, memo);
                if (len > 1 && len < min)
                    min = len;
            }
        }
        memo.put(amount, min);
        return min;
    }
}
