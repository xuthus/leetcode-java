package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordSearchSolutionTest {

    @Test
    public void exist() {
        final WordSearchSolution solution = new WordSearchSolution();
        assertTrue(solution.exist(new char[][]{
                "ABCE".toCharArray()
        }, "ABC"));
        assertTrue(solution.exist(new char[][]{
                "ECBA".toCharArray()
        }, "ABC"));
        assertTrue(solution.exist(new char[][]{
                "A".toCharArray()
        }, "A"));
        assertTrue(solution.exist(new char[][]{
                "ABCE".toCharArray(),
                "SFCS".toCharArray(),
                "ADEE".toCharArray()
        }, "ABCCED"));
        assertTrue(solution.exist(new char[][]{
                "ABCE".toCharArray(),
                "SFCS".toCharArray(),
                "ADEE".toCharArray()
        }, "SEE"));
        assertFalse(solution.exist(new char[][]{
                "ABCE".toCharArray(),
                "SFCS".toCharArray(),
                "ADEE".toCharArray()
        }, "ABCB"));
        assertFalse(solution.exist(new char[][]{
                "ABCE".toCharArray(),
                "SFCS".toCharArray(),
                "ADEE".toCharArray()
        }, "ABFCCB"));
    }
}