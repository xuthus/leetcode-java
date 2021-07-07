package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExcelSheetColumnTitleSolutionTest {

    @Test
    public void convertToTitle() {
        ExcelSheetColumnTitleSolution solution = new ExcelSheetColumnTitleSolution();
        assertEquals("A", solution.convertToTitle(1));
        assertEquals("Z", solution.convertToTitle(26));
        assertEquals("AA", solution.convertToTitle(27));
        assertEquals("FXSHRXW", solution.convertToTitle(2147483647));
    }
}