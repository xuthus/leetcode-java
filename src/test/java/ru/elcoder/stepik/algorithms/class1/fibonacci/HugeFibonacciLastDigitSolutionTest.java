package ru.elcoder.stepik.algorithms.class1.fibonacci;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HugeFibonacciLastDigitSolutionTest {

    @Test
    public void fib() {
        assertEquals(2, HugeFibonacciLastDigitSolution.fib(3));
        assertEquals(3, HugeFibonacciLastDigitSolution.fib(4));
        assertEquals(5, HugeFibonacciLastDigitSolution.fib(5));
        assertEquals(8, HugeFibonacciLastDigitSolution.fib(6));
        assertEquals(3, HugeFibonacciLastDigitSolution.fib(7));
        assertEquals(5, HugeFibonacciLastDigitSolution.fib(40));
    }
}
