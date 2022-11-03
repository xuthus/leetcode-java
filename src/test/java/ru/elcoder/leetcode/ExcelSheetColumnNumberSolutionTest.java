package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class ExcelSheetColumnNumberSolutionTest extends TestCase {

    public void testTitleToNumber_Ex1() {
        ExcelSheetColumnNumberSolution solution = new ExcelSheetColumnNumberSolution();

        int column = solution.titleToNumber("A");

        assertThat(column).isEqualTo(1);
    }

    public void testTitleToNumber_Ex2() {
        ExcelSheetColumnNumberSolution solution = new ExcelSheetColumnNumberSolution();

        int column = solution.titleToNumber("AB");

        assertThat(column).isEqualTo(28);
    }

    public void testTitleToNumber_Ex3() {
        ExcelSheetColumnNumberSolution solution = new ExcelSheetColumnNumberSolution();

        int column = solution.titleToNumber("ZY");

        assertThat(column).isEqualTo(701);
    }

    public void testTitleToNumber_My1() {
        ExcelSheetColumnNumberSolution solution = new ExcelSheetColumnNumberSolution();

        int column = solution.titleToNumber("ABCD");

        assertThat(column).isEqualTo(19010);
    }

    public void testTitleToNumber_My2() {
        ExcelSheetColumnNumberSolution solution = new ExcelSheetColumnNumberSolution();

        int column = solution.titleToNumber("FXSHRXW");

        assertThat(column).isEqualTo(2147483647);
    }
}