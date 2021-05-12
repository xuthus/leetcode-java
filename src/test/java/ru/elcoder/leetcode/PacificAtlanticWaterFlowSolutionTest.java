package ru.elcoder.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class PacificAtlanticWaterFlowSolutionTest {

    @Test
    public void pacificAtlantic() {
        final PacificAtlanticWaterFlowSolution solution = new PacificAtlanticWaterFlowSolution();
        final List<List<Integer>> list = solution.pacificAtlantic(new int[][]{
                arrayOf(1)
        });
        assertEquals(1, list.size());
        assertEquals(Integer.valueOf(0), list.get(0).get(0));
        assertEquals(Integer.valueOf(0), list.get(0).get(1));
    }
}