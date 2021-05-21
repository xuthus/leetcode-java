package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddBinarySolutionTest {

    @Test
    public void addBinary() {
        AddBinarySolution solution = new AddBinarySolution();
        assertEquals("10", solution.addBinary("1", "1"));
        assertEquals("110", solution.addBinary("100", "10"));
        assertEquals("1", solution.addBinary("1", "0"));
        assertEquals("1110", solution.addBinary("111", "111"));
    }
}