package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class FruitIntoBasketsSolutionTest {

    @Test
    public void totalFruit() {
        final FruitIntoBasketsSolution solution = new FruitIntoBasketsSolution();
        assertEquals(3, solution.totalFruit(arrayOf(1, 2, 1)));
        assertEquals(3, solution.totalFruit(arrayOf(0, 1, 2, 2)));
        assertEquals(4, solution.totalFruit(arrayOf(1, 2, 3, 2, 2)));
        assertEquals(5, solution.totalFruit(arrayOf(3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4)));
        assertEquals(3, solution.totalFruit(arrayOf(0, 1, 0, 2)));
    }
}