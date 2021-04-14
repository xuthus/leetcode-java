package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerReplacementSolutionTest {

    @Test
    public void integerReplacement1() {
        final IntegerReplacementSolution solution = new IntegerReplacementSolution();
        assertEquals(3, solution.integerReplacement(8));
    }

    @Test
    public void integerReplacement2() {
        final IntegerReplacementSolution solution = new IntegerReplacementSolution();
        assertEquals(4, solution.integerReplacement(7));
    }

    @Test
    public void integerReplacement3() {
        final IntegerReplacementSolution solution = new IntegerReplacementSolution();
        assertEquals(2, solution.integerReplacement(4));
    }

    @Test
    public void integerReplacement4() {
        final IntegerReplacementSolution solution = new IntegerReplacementSolution();
        assertEquals(0, solution.integerReplacement(1));
    }

    @Test
    public void integerReplacement5() {
        final IntegerReplacementSolution solution = new IntegerReplacementSolution();
        assertEquals(41, solution.integerReplacement(1234567890));
    }

    @Test
    public void integerReplacement6() {
        final IntegerReplacementSolution solution = new IntegerReplacementSolution();
        assertEquals(5, solution.integerReplacement(16 - 1));
    }

    @Test
    public void integerReplacement7() {
        final IntegerReplacementSolution solution = new IntegerReplacementSolution();
        assertEquals(32, solution.integerReplacement(2147483647));
    }
}