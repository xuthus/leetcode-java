package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumIIISolutionTest {

    @Test
    public void test1() {
        TwoSumIIISolution solution = new TwoSumIIISolution();
        assertFalse(solution.find(10));
        solution.add(5);
        solution.add(3);
        assertTrue(solution.find(8));
        assertFalse(solution.find(9));
        solution.add(4);
        assertTrue(solution.find(9));
        assertFalse(solution.find(10));
        solution.add(5);
        assertTrue(solution.find(10));
    }

}