package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddStringsSolutionTest {

    @Test
    public void addStrings() {
        AddStringsSolution solution = new AddStringsSolution();
        assertEquals("1010", solution.addStrings("11", "999"));
    }
}