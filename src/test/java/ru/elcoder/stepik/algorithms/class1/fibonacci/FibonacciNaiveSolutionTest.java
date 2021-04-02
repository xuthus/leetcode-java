package ru.elcoder.stepik.algorithms.class1.fibonacci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciNaiveSolutionTest {

    @Test
    public void fib() {
        assertEquals(2, FibonacciNaiveSolution.fib(3));
        assertEquals(3, FibonacciNaiveSolution.fib(4));
        assertEquals(5, FibonacciNaiveSolution.fib(5));
        assertEquals(8, FibonacciNaiveSolution.fib(6));
        assertEquals(13, FibonacciNaiveSolution.fib(7));
        assertEquals(102334155, FibonacciNaiveSolution.fib(40));
    }
}
