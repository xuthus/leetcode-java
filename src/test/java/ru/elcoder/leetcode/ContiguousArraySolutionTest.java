package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class ContiguousArraySolutionTest {

    @Test
    public void findMaxLength1() {
        final ContiguousArraySolution solution = new ContiguousArraySolution();
        assertEquals(2, solution.findMaxLength(arrayOf(0, 1)));
    }

    @Test
    public void findMaxLength2() {
        final ContiguousArraySolution solution = new ContiguousArraySolution();
        assertEquals(2, solution.findMaxLength(arrayOf(0, 1, 0)));
    }

    @Test
    public void findMaxLength3() {
        final ContiguousArraySolution solution = new ContiguousArraySolution();
        assertEquals(6, solution.findMaxLength(arrayOf(0, 1, 0, 0, 1, 1)));
    }

    @Test
    public void findMaxLength4() {
        final ContiguousArraySolution solution = new ContiguousArraySolution();
        assertEquals(0, solution.findMaxLength(arrayOf(0)));
    }

    @Test
    public void findMaxLength5() {
        final ContiguousArraySolution solution = new ContiguousArraySolution();
        assertEquals(12, solution.findMaxLength(arrayOf(0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1)));
    }

    @Test
    public void findMaxLength6() {
        final ContiguousArraySolution solution = new ContiguousArraySolution();
        assertEquals(12, solution.findMaxLength(arrayOf(1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1)));
    }

    @Test
    public void findMaxLength7() {
        final ContiguousArraySolution solution = new ContiguousArraySolution();
        assertEquals(12, solution.findMaxLength(arrayOf(1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1)));
    }

    @Test
    public void findMaxLength8() {
        final ContiguousArraySolution solution = new ContiguousArraySolution();
        assertEquals(0, solution.findMaxLength(arrayOf(0, 0, 0)));
    }
}