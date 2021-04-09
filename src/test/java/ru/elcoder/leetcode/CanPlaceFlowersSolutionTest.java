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

    @Test
    public void canPlaceFlowers3() {
        final CanPlaceFlowersSolution solution = new CanPlaceFlowersSolution();
        assertTrue(solution.canPlaceFlowers(arrayOf(0, 0, 0, 0, 0), 3));
    }

    @Test
    public void canPlaceFlowers4() {
        final CanPlaceFlowersSolution solution = new CanPlaceFlowersSolution();
        assertTrue(solution.canPlaceFlowers(arrayOf(0, 0, 0, 1), 1));
        assertFalse(solution.canPlaceFlowers(arrayOf(0, 0, 0, 1), 2));
    }

    @Test
    public void canPlaceFlowers5() {
        final CanPlaceFlowersSolution solution = new CanPlaceFlowersSolution();
        assertTrue(solution.canPlaceFlowers(arrayOf(0, 0, 1), 1));
        assertFalse(solution.canPlaceFlowers(arrayOf(0, 0, 1), 2));
        assertFalse(solution.canPlaceFlowers(arrayOf(0, 1), 1));
        assertTrue(solution.canPlaceFlowers(arrayOf(0, 0, 0), 2));
    }
}
