package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimplifyPathSolutionTest {
    @Test
    public void simplifyPath() throws Exception {
        SimplifyPathSolution solution = new SimplifyPathSolution();

        assertEquals("/", solution.simplifyPath("/"));
        assertEquals("/home", solution.simplifyPath("/home"));
        assertEquals("/home", solution.simplifyPath("/home/"));
        assertEquals("/home", solution.simplifyPath("/home//"));
        assertEquals("/home", solution.simplifyPath("//home//"));
        assertEquals("/", solution.simplifyPath("/home/../"));
        assertEquals("/", solution.simplifyPath("/home/../../"));
        assertEquals("/sergey", solution.simplifyPath("/home/../../sergey//"));
        assertEquals("/home", solution.simplifyPath("/home/../home"));
        assertEquals("/home/1", solution.simplifyPath("/home/../home/1"));
        assertEquals("/home/sergey", solution.simplifyPath("/home/../home/alex/../sergey//"));
        assertEquals("/c", solution.simplifyPath("/a/./b/../../c/"));
        assertEquals("/", solution.simplifyPath("/../"));
        assertEquals("/", solution.simplifyPath("/../..//"));
        assertEquals("/home/foo", solution.simplifyPath("/home//foo/"));
    }

}