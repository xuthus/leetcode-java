package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfTwoIntegersSolutionTest {

    @Test
    public void getSum() {
        final SumOfTwoIntegersSolution solution = new SumOfTwoIntegersSolution();
        assertEquals(3, solution.getSum(0, 3));
        assertEquals(3, solution.getSum(1, 2));
        assertEquals(3, solution.getSum(-101, 104));
    }
}