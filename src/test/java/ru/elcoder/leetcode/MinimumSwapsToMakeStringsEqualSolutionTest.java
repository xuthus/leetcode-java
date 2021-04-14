package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumSwapsToMakeStringsEqualSolutionTest {

    @Test
    public void minimumSwap1() {
        final MinimumSwapsToMakeStringsEqualSolution solution = new MinimumSwapsToMakeStringsEqualSolution();
        assertEquals(1, solution.minimumSwap("xx", "yy"));
    }

    @Test
    public void minimumSwap2() {
        final MinimumSwapsToMakeStringsEqualSolution solution = new MinimumSwapsToMakeStringsEqualSolution();
        assertEquals(2, solution.minimumSwap("xy", "yx"));
    }

    @Test
    public void minimumSwap3() {
        final MinimumSwapsToMakeStringsEqualSolution solution = new MinimumSwapsToMakeStringsEqualSolution();
        assertEquals(-1, solution.minimumSwap("xx", "yx"));
    }

    @Test
    public void minimumSwap4() {
        final MinimumSwapsToMakeStringsEqualSolution solution = new MinimumSwapsToMakeStringsEqualSolution();
        assertEquals(4, solution.minimumSwap("xxyyxyxyxx", "xyyxyxxxyx"));
    }

    @Test
    public void minimumSwap5() {
        final MinimumSwapsToMakeStringsEqualSolution solution = new MinimumSwapsToMakeStringsEqualSolution();
        assertEquals(0, solution.minimumSwap("", ""));
    }

    @Test
    public void minimumSwap6() {
        final MinimumSwapsToMakeStringsEqualSolution solution = new MinimumSwapsToMakeStringsEqualSolution();
        assertEquals(0, solution.minimumSwap("x", "x"));
    }

    @Test
    public void minimumSwap7() {
        final MinimumSwapsToMakeStringsEqualSolution solution = new MinimumSwapsToMakeStringsEqualSolution();
        assertEquals(-1, solution.minimumSwap("y", "x"));
    }
}