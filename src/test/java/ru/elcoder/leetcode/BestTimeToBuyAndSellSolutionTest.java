package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sergey Yanzin (xuthus@yandex.ru) on 04.09.2017.
 */
public class BestTimeToBuyAndSellSolutionTest {

    @Test
    public void testMaxProfit() throws Exception {
        BestTimeToBuyAndSellSolution solution = new BestTimeToBuyAndSellSolution();

        assertEquals(0, solution.maxProfit(null));
        assertEquals(0, solution.maxProfit(new int[]{}));
        assertEquals(0, solution.maxProfit(new int[]{1}));
        assertEquals(2, solution.maxProfit(new int[]{1, 3}));
        assertEquals(2, solution.maxProfit(new int[]{1, 3, 1}));
        assertEquals(2, solution.maxProfit(new int[]{1, 3, 1, 2}));
        assertEquals(4, solution.maxProfit(new int[]{1, 3, 1, 2, 5}));
        assertEquals(0, solution.maxProfit(new int[]{3, 1}));
        assertEquals(0, solution.maxProfit(new int[]{3, 1, 1}));
        assertEquals(1, solution.maxProfit(new int[]{3, 1, 1, 2}));
        assertEquals(3, solution.maxProfit(new int[]{-2, 1}));
        assertEquals(1, solution.maxProfit(new int[]{-2, -1}));
        assertEquals(5, solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(0, solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}