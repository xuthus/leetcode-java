package ru.elcoder.stepik.algorithms.class1.fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class FibonacciModuleSolutionTest {

    @Test
    public void sequence2x() {
        assertFalse(FibonacciModuleSolution.sequence2x(arrayOf(1, 2, 3), 3));
        assertFalse(FibonacciModuleSolution.sequence2x(arrayOf(1, 2, 3, 4), 3));
        assertFalse(FibonacciModuleSolution.sequence2x(arrayOf(1, 2, 3, 4), 4));
        assertFalse(FibonacciModuleSolution.sequence2x(arrayOf(1, 2, 1, 3), 4));
        assertTrue(FibonacciModuleSolution.sequence2x(arrayOf(1, 2, 1, 2), 4));
        assertTrue(FibonacciModuleSolution.sequence2x(arrayOf(1, 2, 7, 1, 1, 2, 7, 1), 8));
        assertTrue(FibonacciModuleSolution.sequence2x(arrayOf(1, 1), 2));
    }

    @Test
    public void findPizanoSequence() {
        assertEquals(6, FibonacciModuleSolution.findPizanoSequence(12 * 4, 4));
        assertEquals(20, FibonacciModuleSolution.findPizanoSequence(12 * 5, 5));
        assertEquals(24, FibonacciModuleSolution.findPizanoSequence(12 * 6, 6));
        assertEquals(10, FibonacciModuleSolution.findPizanoSequence(12 * 11, 11));
        assertEquals(40, FibonacciModuleSolution.findPizanoSequence(12 * 15, 15));
        assertEquals(136, FibonacciModuleSolution.findPizanoSequence(12 * 67, 67));
        assertEquals(150000, FibonacciModuleSolution.findPizanoSequence(12 * 100_000, 100_000));
    }

    @Test
    public void calcMod() {
        int fib = FibonacciTableSolution.fib(10);
        assertEquals(fib % 2, FibonacciModuleSolution.calcMod(10, 2));

        fib = FibonacciTableSolution.fib(15);
        assertEquals(fib % 4, FibonacciModuleSolution.calcMod(15, 4));

        fib = FibonacciTableSolution.fib(19);
        assertEquals(fib % 7, FibonacciModuleSolution.calcMod(19, 7));

        fib = FibonacciTableSolution.fib(19);
        assertEquals(fib % 2, FibonacciModuleSolution.calcMod(19, 2));

        fib = FibonacciTableSolution.fib(2);
        assertEquals(fib % 2, FibonacciModuleSolution.calcMod(2, 2));
    }
}