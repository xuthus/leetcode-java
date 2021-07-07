package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class ReduceArraySizeToTheHalfSolutionTest {

    @Test
    public void minSetSize() {
        final ReduceArraySizeToTheHalfSolution solution = new ReduceArraySizeToTheHalfSolution();
        assertEquals(1, solution.minSetSize(arrayOf(1)));
        assertEquals(1, solution.minSetSize(arrayOf(1, 2)));
        assertEquals(1, solution.minSetSize(arrayOf(1, 2, 3)));
        assertEquals(1, solution.minSetSize(arrayOf(1, 2, 1)));
    }
}
