package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class BestTimeToBuyAndSellStockIISolutionTest {

    @Test
    public void maxProfit() {
        BestTimeToBuyAndSellStockIISolution solution = new BestTimeToBuyAndSellStockIISolution();
        assertEquals(3, solution.maxProfit(arrayOf(1, 2, 4)));
    }

    @Test
    public void maxProfit2() {
        BestTimeToBuyAndSellStockIISolution solution = new BestTimeToBuyAndSellStockIISolution();
        assertEquals(7, solution.maxProfit(arrayOf(7, 1, 5, 3, 6, 4)));
        assertEquals(0, solution.maxProfit(arrayOf(7, 5, 3, 2, 1)));
        assertEquals(1, solution.maxProfit(arrayOf(1, 2)));
        assertEquals(1, solution.maxProfit(arrayOf(1, 2, 2)));
        assertEquals(1, solution.maxProfit(arrayOf(1, 2, 2, 1)));
    }
}