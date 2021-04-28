package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicCalculatorSolutionTest {

    @Test
    public void calculate1() {
        final BasicCalculatorSolution solution = new BasicCalculatorSolution();
        assertEquals(-7, solution.calculate("-7"));
        assertEquals(-4, solution.calculate("-7+3"));
        assertEquals(7, solution.calculate("7"));
        assertEquals(7, solution.calculate("1+6"));
        assertEquals(111, solution.calculate(" 199 - 88 "));
    }

    @Test
    public void calculate2() {
        final BasicCalculatorSolution solution = new BasicCalculatorSolution();
        assertEquals(5, solution.calculate("(6+2-3)"));
        assertEquals(6, solution.calculate("(6)"));
        assertEquals(-3, solution.calculate("1 + (-7+3)"));
    }

    @Test
    public void calculate3() {
        final BasicCalculatorSolution solution = new BasicCalculatorSolution();
        assertEquals(63 + (6 + 2 - 3) - (3 + 17), solution.calculate("63 + (6+2-3) - (3+17)"));
    }

    @Test
    public void getOperation() {
    }
}
