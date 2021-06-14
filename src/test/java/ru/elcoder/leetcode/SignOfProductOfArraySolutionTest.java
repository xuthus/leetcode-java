package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class SignOfProductOfArraySolutionTest {

    @Test
    public void arraySign() {
        SignOfProductOfArraySolution solution = new SignOfProductOfArraySolution();
        assertEquals(0, solution.arraySign(arrayOf(1, -2, 3, 0, 5, 6, -2)));
        assertEquals(1, solution.arraySign(arrayOf(1, -2, 3, 5, 6, -2)));
        assertEquals(-1, solution.arraySign(arrayOf(1, -2, -3, 5, 6, -2)));
    }
}