package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class MaximumPopulationYearSolutionTest {

    @Test
    public void maximumPopulation() {
        final MaximumPopulationYearSolution solution = new MaximumPopulationYearSolution();
        assertEquals(1993, solution.maximumPopulation(new int[][]{
                arrayOf(1993, 1999),
                arrayOf(2000, 2010)
        }));
        assertEquals(1960, solution.maximumPopulation(new int[][]{
                arrayOf(1950, 1961),
                arrayOf(1960, 1971),
                arrayOf(1970, 1981)
        }));
    }
}
