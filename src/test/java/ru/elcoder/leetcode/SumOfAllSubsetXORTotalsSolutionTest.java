package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class SumOfAllSubsetXORTotalsSolutionTest {

    @Test
    public void subsetXORSum() {
        final SumOfAllSubsetXORTotalsSolution solution = new SumOfAllSubsetXORTotalsSolution();
        assertEquals(2, solution.subsetXORSum(arrayOf(1, 1)));
        assertEquals(6, solution.subsetXORSum(arrayOf(1, 3)));
        assertEquals(28, solution.subsetXORSum(arrayOf(5, 1, 6)));
        assertEquals(480, solution.subsetXORSum(arrayOf(3, 4, 5, 6, 7, 8)));
    }
}
