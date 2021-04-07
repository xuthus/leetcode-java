package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class CanPlaceFlowersSolutionTest {

    @Test
    public void canPlaceFlowers1() {
        final CanPlaceFlowersSolution solution = new CanPlaceFlowersSolution();
        assertTrue(solution.canPlaceFlowers(arrayOf(1, 0, 0, 0, 1), 1));
    }

    @Test
    public void canPlaceFlowers2() {
        final CanPlaceFlowersSolution solution = new CanPlaceFlowersSolution();
        assertFalse(solution.canPlaceFlowers(arrayOf(1, 0, 0, 0, 1), 2));
    }
}
