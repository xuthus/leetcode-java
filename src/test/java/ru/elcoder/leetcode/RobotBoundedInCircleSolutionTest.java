package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class RobotBoundedInCircleSolutionTest {

    @Test
    public void isRobotBounded() {
        final RobotBoundedInCircleSolution solution = new RobotBoundedInCircleSolution();
        assertTrue(solution.isRobotBounded("GGLLGG"));
        assertTrue(solution.isRobotBounded("GL"));
        assertFalse(solution.isRobotBounded("GG"));
    }
}
