package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xuthus on 30.04.2017.
 */
public class IsPalindromSolutionTest {

    @Test
    public void testCalculate() throws Exception {
        IsPalindromSolution solution = new IsPalindromSolution();

        assertTrue(solution.isPalindrome(0));
        assertTrue(solution.isPalindrome(1));
        assertFalse(solution.isPalindrome(Integer.MAX_VALUE));
        assertTrue(solution.isPalindrome(2000000002));
        assertTrue(solution.isPalindrome(2147447412));
    }
}