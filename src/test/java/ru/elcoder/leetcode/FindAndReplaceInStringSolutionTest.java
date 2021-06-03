package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class FindAndReplaceInStringSolutionTest {

    @Test
    public void findReplaceString1() {
        final FindAndReplaceInStringSolution solution = new FindAndReplaceInStringSolution();
        assertEquals("xyzcd", solution.findReplaceString("abcd", arrayOf(0), arrayOf("ab"), arrayOf("xyz")));
    }

    @Test
    public void findReplaceString2() {
        final FindAndReplaceInStringSolution solution = new FindAndReplaceInStringSolution();
        assertEquals("zzzyyy", solution.findReplaceString("abcd", arrayOf(0, 2), arrayOf("ab", "cd"), arrayOf("zzz", "yyy")));
    }
}
