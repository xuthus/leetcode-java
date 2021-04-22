package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingStairsSolutionTest {

    @Test
    public void climbStairs0() {
        final ClimbingStairsSolution solution = new ClimbingStairsSolution();
        assertEquals(1, solution.climbStairs(0));
    }

    @Test
    public void climbStairs1() {
        final ClimbingStairsSolution solution = new ClimbingStairsSolution();
        assertEquals(1, solution.climbStairs(1));
    }

    @Test
    public void climbStairs2() {
        final ClimbingStairsSolution solution = new ClimbingStairsSolution();
        assertEquals(2, solution.climbStairs(2));
    }

    @Test
    public void climbStairs3() {
        final ClimbingStairsSolution solution = new ClimbingStairsSolution();
        assertEquals(3, solution.climbStairs(3));
    }

    @Test
    public void climbStairs4() {
        final ClimbingStairsSolution solution = new ClimbingStairsSolution();
        assertEquals(5, solution.climbStairs(4));
    }

    @Test
    public void climbStairs5() {
        final ClimbingStairsSolution solution = new ClimbingStairsSolution();
        assertEquals(8, solution.climbStairs(5));
    }
}
