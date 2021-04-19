package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class CoinChangeSolutionTest {

    @Test
    public void coinChange0() {
        final CoinChangeSolution solution = new CoinChangeSolution();
        assertEquals(0, solution.coinChange(arrayOf(1, 2, 3), 0));
        assertEquals(11, solution.coinChange(arrayOf(1), 11));
    }

    @Test
    public void coinChange1() {
        final CoinChangeSolution solution = new CoinChangeSolution();
        assertEquals(3334, solution.coinChange(arrayOf(1, 2, 3), 10000));
        assertEquals(4, solution.coinChange(arrayOf(1, 2, 3), 11));
    }

    @Test
    public void coinChange3() {
        final CoinChangeSolution solution = new CoinChangeSolution();
        assertEquals(1, solution.coinChange(arrayOf(1, 2, 3), 1));
        assertEquals(1, solution.coinChange(arrayOf(1, 2, 3), 3));
    }

    @Test
    public void coinChange2() {
        final CoinChangeSolution solution = new CoinChangeSolution();
        assertEquals(2, solution.coinChange(arrayOf(1, 2, 3), 4));
        assertEquals(2, solution.coinChange(arrayOf(1, 2, 3), 5));
        assertEquals(2, solution.coinChange(arrayOf(1, 2, 3), 6));
        assertEquals(3, solution.coinChange(arrayOf(1, 2, 3), 7));
    }

    @Test
    public void coinChangeEdges() {
        final CoinChangeSolution solution = new CoinChangeSolution();
        assertEquals(0, solution.coinChange(arrayOf(1, 2, 3), 0));
        assertEquals(-1, solution.coinChange(arrayOf(2, 3), 1));
        assertEquals(-1, solution.coinChange(arrayOf(2, 5), 3));
    }
}
