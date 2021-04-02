package ru.elcoder.stepik.algorithms.class1.fibonacci;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTableSolutionTest {

    @Test
    public void fib() {
        assertEquals(2, FibonacciTableSolution.fib(3));
        assertEquals(3, FibonacciTableSolution.fib(4));
        assertEquals(5, FibonacciTableSolution.fib(5));
        assertEquals(8, FibonacciTableSolution.fib(6));
        assertEquals(13, FibonacciTableSolution.fib(7));
        assertEquals(102334155, FibonacciTableSolution.fib(40));
    }
}
