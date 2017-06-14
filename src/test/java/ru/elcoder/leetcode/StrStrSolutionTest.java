package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuthus on 05.05.2017.
 */
public class StrStrSolutionTest {

    @Test
    public void testStrStrNaive() throws Exception {
        StrStrSolution solution = new StrStrSolution();
        commonTestCases(solution);
    }

    @Test
    public void testStrStrHorspool() throws Exception {
        StrStrSolution solution = new StrStrSolution();
        solution.algorithm = StrStrSolution.StringSearchAlgorithm.HORSPOOL;
        commonTestCases(solution);
    }

    private void commonTestCases(StrStrSolution solution) {
        assertEquals(-1, solution.strStr("h", "hello"));
        assertEquals(3, solution.strStr("abcdef", "def"));
        assertEquals(5, solution.strStr("abcdedef", "def"));
        assertEquals(7, solution.strStr("abcdededef", "def"));
        assertEquals(7, solution.strStr("abcdeeedef", "def"));
        assertEquals(-1, solution.strStr("abcdeeedef", "defa"));
        assertEquals(0, solution.strStr("hello", "hello"));
        assertEquals(0, solution.strStr("hello2", "hello"));
        assertEquals(5, solution.strStr("hello2", "2"));
        assertEquals(-1, solution.strStr("hello2", "23"));
        assertEquals(5, solution.strStr("hello23", "23"));
        assertEquals(6, solution.strStr("hello223", "23"));
        assertEquals(1, solution.strStr("1hello2", "hello"));
        assertEquals(-1, solution.strStr("1hello2", "hello3"));
        assertEquals(0, solution.strStr("1hello2", ""));
        assertEquals(-1, solution.strStr("1hello2", null));
        assertEquals(-1, solution.strStr("1hello2", " "));
        assertEquals(0, solution.strStr("  ", " "));
    }
}