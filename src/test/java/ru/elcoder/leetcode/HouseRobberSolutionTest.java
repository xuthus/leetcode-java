package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class HouseRobberSolutionTest {

    @Test
    public void rob1() {
        final HouseRobberSolution solution = new HouseRobberSolution();
        assertEquals(4, solution.rob(arrayOf(1, 2, 3, 1)));
    }

    @Test
    public void rob2() {
        final HouseRobberSolution solution = new HouseRobberSolution();
        assertEquals(12, solution.rob(arrayOf(2, 7, 9, 3, 1)));
    }

    @Test
    public void rob3() {
        final HouseRobberSolution solution = new HouseRobberSolution();
        assertEquals(12, solution.rob(arrayOf(12)));
    }

    @Test
    public void rob4() {
        final HouseRobberSolution solution = new HouseRobberSolution();
        assertEquals(12, solution.rob(arrayOf(12, 10)));
    }

    @Test
    public void rob5() {
        final HouseRobberSolution solution = new HouseRobberSolution();
        assertEquals(12, solution.rob(arrayOf(10, 12)));
    }

    @Test
    public void rob6() {
        final HouseRobberSolution solution = new HouseRobberSolution();
        assertEquals(0, solution.rob(new int[0]));
        assertEquals(0, solution.rob(null));
    }
}
