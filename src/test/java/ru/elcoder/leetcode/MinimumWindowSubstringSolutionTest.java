package ru.elcoder.leetcode;

import org.junit.Ignore;
import org.junit.Test;
import ru.elcoder.leetcode.utils.Utils;

import static org.junit.Assert.*;

public class MinimumWindowSubstringSolutionTest {

    @Test
    public void minWindow1() {
        final MinimumWindowSubstringSolution solution = new MinimumWindowSubstringSolution();
        assertEquals("a", solution.minWindow("a", "a"));
    }

    @Test
    public void minWindow2() {
        final MinimumWindowSubstringSolution solution = new MinimumWindowSubstringSolution();
        assertEquals("BANC", solution.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Ignore
    @Test
    public void minWindowLong() {
        final MinimumWindowSubstringSolution solution = new MinimumWindowSubstringSolution();
        String[] strings = Utils.readStringFromResources("minimum-window-substring-long.txt").split("\n");
        assertEquals(strings[2], solution.minWindow(strings[0], strings[1]));
    }

    @Test
    public void minWindow3() {
        final MinimumWindowSubstringSolution solution = new MinimumWindowSubstringSolution();
        assertEquals("", solution.minWindow("ZX", "PC"));
    }

    @Test
    public void minWindow4() {
        final MinimumWindowSubstringSolution solution = new MinimumWindowSubstringSolution();
        assertEquals("ZX", solution.minWindow("ZX", "XZ"));
    }

    @Test
    public void minWindow5() {
        final MinimumWindowSubstringSolution solution = new MinimumWindowSubstringSolution();
        assertEquals("ZX", solution.minWindow("ZZZUZZZX", "XZ"));
    }
}
