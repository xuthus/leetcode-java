package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by xuthus on 03.05.2017.
 */
public class PalindromeNumberSolutionTest {

    @Test
    public void testIsPalindrome() throws Exception {
        PalindromeNumberSolution solution = new PalindromeNumberSolution();

        assertTrue(solution.isPalindrome(0));
        assertTrue(solution.isPalindrome(1));
        assertTrue(solution.isPalindrome(101));
        assertTrue(solution.isPalindrome(19455491));
        assertFalse(solution.isPalindrome(-19455491));
        assertFalse(solution.isPalindrome(234));
    }
}