package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomSortStringSolutionTest {

    @Test
    public void customSortString() {
        final CustomSortStringSolution solution = new CustomSortStringSolution();
        assertEquals("dcba", solution.customSortString("cba", "abcd"));
        assertEquals("dcba", solution.customSortString("cba", "dabc"));
    }
}
