package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class AssignCookiesSolutionTest {

    @Test
    public void findContentChildren1() {
        final AssignCookiesSolution solution = new AssignCookiesSolution();
        assertEquals(1, solution.findContentChildren(arrayOf(1, 2, 3), arrayOf(1, 1)));
    }

    @Test
    public void findContentChildren2() {
        final AssignCookiesSolution solution = new AssignCookiesSolution();
        assertEquals(2, solution.findContentChildren(arrayOf(1, 2), arrayOf(1, 2, 3)));
    }

    @Test
    public void findContentChildrenBorderCases() {
        final AssignCookiesSolution solution = new AssignCookiesSolution();
        assertEquals(0, solution.findContentChildren(new int[0], arrayOf(1, 2, 3)));
        assertEquals(0, solution.findContentChildren(arrayOf(1, 2, 3), new int[0]));
    }
}
