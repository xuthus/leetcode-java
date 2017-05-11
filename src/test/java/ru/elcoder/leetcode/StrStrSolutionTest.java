package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by xuthus on 05.05.2017.
 */
public class StrStrSolutionTest {

    @Test
    public void testStrStr() throws Exception {
        StrStrSolution solution = new StrStrSolution();

        assertEquals(-1, solution.strStr("h", "hello"));
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