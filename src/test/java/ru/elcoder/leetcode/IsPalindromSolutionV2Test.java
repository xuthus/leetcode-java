package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xuthus on 01.05.2017.
 */
public class IsPalindromSolutionV2Test {

    @Test
    public void testIsPalindrome() throws Exception {
        IsPalindromSolutionV2 solution = new IsPalindromSolutionV2();

        assertTrue(solution.isPalindrome(0));
        assertTrue(solution.isPalindrome(1));
        assertFalse(solution.isPalindrome(Integer.MAX_VALUE));
        assertTrue(solution.isPalindrome(2000000002));
        assertTrue(solution.isPalindrome(2147447412));
    }
}