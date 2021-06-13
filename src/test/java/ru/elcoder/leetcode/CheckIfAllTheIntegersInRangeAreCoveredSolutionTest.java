package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class CheckIfAllTheIntegersInRangeAreCoveredSolutionTest {

    @Test
    public void isCovered() {
        CheckIfAllTheIntegersInRangeAreCoveredSolution solution = new CheckIfAllTheIntegersInRangeAreCoveredSolution();
        assertTrue(solution.isCovered(new int[][]{
                arrayOf(2, 8)
        }, 2, 8));
        assertTrue(solution.isCovered(new int[][]{
                arrayOf(2, 8)
        }, 2, 7));
        assertFalse(solution.isCovered(new int[][]{
                arrayOf(2, 8)
        }, 1, 7));
        assertFalse(solution.isCovered(new int[][]{
                arrayOf(2, 8)
        }, 2, 9));
        assertTrue(solution.isCovered(new int[][]{
                arrayOf(2, 3),
                arrayOf(4, 8)
        }, 2, 7));
        assertFalse(solution.isCovered(new int[][]{
                arrayOf(2, 3),
                arrayOf(5, 8)
        }, 2, 7));
    }
}