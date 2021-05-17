package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class NumberOfConnectedComponentsInUndirectedGraphSolutionTest {

    @Test
    public void countComponents() {
        final NumberOfConnectedComponentsInUndirectedGraphSolution solution = new NumberOfConnectedComponentsInUndirectedGraphSolution();
        assertEquals(2, solution.countComponents(5, new int[][]{
                arrayOf(0, 1),
                arrayOf(1, 2),
                arrayOf(3, 4)
        }));
    }
}
