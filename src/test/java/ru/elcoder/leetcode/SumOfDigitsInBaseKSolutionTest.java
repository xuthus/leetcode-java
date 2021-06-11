package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfDigitsInBaseKSolutionTest {

    @Test
    public void sumBase() {
        SumOfDigitsInBaseKSolution solution = new SumOfDigitsInBaseKSolution();
        assertEquals(9, solution.sumBase(34, 6));
        assertEquals(10, solution.sumBase(34, 7));
        assertEquals(1, solution.sumBase(10, 10));
    }
}