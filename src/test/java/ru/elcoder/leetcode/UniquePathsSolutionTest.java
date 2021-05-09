package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniquePathsSolutionTest {

    @Test
    public void uniquePaths() {
        final UniquePathsSolution solution = new UniquePathsSolution();
        assertEquals(2, solution.uniquePaths(2, 2));
        assertEquals(1, solution.uniquePaths(2, 1));
        assertEquals(3, solution.uniquePaths(3, 2));
        assertEquals(10, solution.uniquePaths(3, 4));
        assertEquals(20, solution.uniquePaths(4, 4));
    }
}