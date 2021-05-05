package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfIslandsSolutionTest {

    @Test
    public void numIslands() {
        final NumberOfIslandsSolution solution = new NumberOfIslandsSolution();
        assertEquals(1, solution.numIslands(new char[][]{
                new char[] {'1', '1', '1'},
                new char[] {'0', '1', '0'},
                new char[] {'1', '1', '1'}
        }));
    }
}
