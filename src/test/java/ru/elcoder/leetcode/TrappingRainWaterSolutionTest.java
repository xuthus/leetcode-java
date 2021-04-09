package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class TrappingRainWaterSolutionTest {

    @Test
    public void trapCustom() {
        final TrappingRainWaterSolution solution = new TrappingRainWaterSolution();
        assertEquals(0, solution.trap(arrayOf(0, 1, 2, 0)));
    }

    @Test
    public void trapCustom2() {
        final TrappingRainWaterSolution solution = new TrappingRainWaterSolution();
        assertEquals(2, solution.trap(arrayOf(0, 1, 2, 0, 2, 0)));
    }

    @Test
    public void trap1() {
        final TrappingRainWaterSolution solution = new TrappingRainWaterSolution();
        assertEquals(6, solution.trap(arrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)));
    }

    @Test
    public void trap2() {
        final TrappingRainWaterSolution solution = new TrappingRainWaterSolution();
        assertEquals(9, solution.trap(arrayOf(4, 2, 0, 3, 2, 5)));
    }
}
