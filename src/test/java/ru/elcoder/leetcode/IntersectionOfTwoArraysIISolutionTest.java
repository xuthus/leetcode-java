package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class IntersectionOfTwoArraysIISolutionTest {

    @Test
    public void intersect() {
        final IntersectionOfTwoArraysIISolution solution = new IntersectionOfTwoArraysIISolution();
        assertArrayEquals(arrayOf(0, 1), solution.intersect(
                arrayOf(0, 1, 2),
                arrayOf(0, 1, 3)));
        assertArrayEquals(arrayOf(0, 1), solution.intersect(
                arrayOf(2, 0, 1, 2),
                arrayOf(5, 0, 1, 3)));
        assertArrayEquals(arrayOf(0), solution.intersect(
                arrayOf(2, 0, 7, 2),
                arrayOf(5, 0, 1, 3)));
        assertArrayEquals(new int[0], solution.intersect(
                arrayOf(2, 0, 7, 2),
                arrayOf(5, 9, 1, 3)));
        assertArrayEquals(arrayOf(0, 0, 1), solution.intersect(
                arrayOf(0, 0, 1, 2),
                arrayOf(5, 0, 1, 0)));
    }
}