package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class ContainerWithMostWaterSolutionTest {

    @Test
    public void maxArea() {
        final ContainerWithMostWaterSolution solution = new ContainerWithMostWaterSolution();
        assertEquals(20, solution.maxArea(arrayOf(10, 3, 10)));
        assertEquals(49, solution.maxArea(arrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)));
    }
}
