package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class MinimumDistanceToTargetElementSolutionTest {

    @Test
    public void getMinDistance() {
        MinimumDistanceToTargetElementSolution solution = new MinimumDistanceToTargetElementSolution();
        assertEquals(1, solution.getMinDistance(arrayOf(1, 2, 3, 4, 5), 5, 3));
        assertEquals(1, solution.getMinDistance(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 5), 5, 7));
    }
}