package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class ValidTriangleNumberSolutionTest {

    @Test
    public void triangleNumber() {
        final ValidTriangleNumberSolution solution = new ValidTriangleNumberSolution();
        assertEquals(0, solution.triangleNumber(arrayOf(1, 2, 4)));
        assertEquals(0, solution.triangleNumber(arrayOf(1, 2, 4, 10)));
        assertEquals(0, solution.triangleNumber(arrayOf(1, 2, 4, 6)));
        assertEquals(1, solution.triangleNumber(arrayOf(1, 2, 4, 5)));
        assertEquals(1, solution.triangleNumber(arrayOf(1, 2, 4, 5, 0, 0)));
        assertEquals(3, solution.triangleNumber(arrayOf(2, 2, 3, 4)));
        assertEquals(4, solution.triangleNumber(arrayOf(4, 2, 3, 4)));
    }
}
