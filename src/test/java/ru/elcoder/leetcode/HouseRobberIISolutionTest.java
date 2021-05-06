package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class HouseRobberIISolutionTest {

    @Test
    public void rob() {
        final HouseRobberIISolution solution = new HouseRobberIISolution();
        assertEquals(4, solution.rob(arrayOf(2, 3, 4)));
        assertEquals(3, solution.rob(arrayOf(2, 3, 2)));
        assertEquals(7, solution.rob(arrayOf(7)));
    }
}
