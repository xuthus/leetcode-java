package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xuthus on 01.05.2017.
 */
public class ValidPalindromeSolutionTest {

    @Test
    public void testIsPalindrome() throws Exception {
        ValidPalindromeSolution solution = new ValidPalindromeSolution();

        assertTrue(solution.isPalindrome(null));
        assertTrue(solution.isPalindrome("12321"));
        assertTrue(solution.isPalindrome(""));
        assertTrue(solution.isPalindrome("123-321"));
        assertTrue(solution.isPalindrome(" abc -c ba"));
        assertTrue(solution.isPalindrome(" abc -c BA"));
        assertTrue(solution.isPalindrome("ABC*cba"));
        assertTrue(solution.isPalindrome("ABC8cba"));
        assertFalse(solution.isPalindrome("21"));
    }
}