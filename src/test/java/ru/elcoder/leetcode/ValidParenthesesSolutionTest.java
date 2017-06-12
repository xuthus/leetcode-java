package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by xuthus on 12.06.2017.
 */
public class ValidParenthesesSolutionTest {
    @Test
    public void isValid() throws Exception {
        ValidParenthesesSolution solution = new ValidParenthesesSolution();

        assertTrue(solution.isValid("abs"));
        assertTrue(solution.isValid("(abs)"));
        assertTrue(solution.isValid("([abs])"));
        assertTrue(solution.isValid("([ab{}s])"));
        assertFalse(solution.isValid("([ab{}s]){"));
        assertTrue(solution.isValid("([ab{}s]){}"));
        assertFalse(solution.isValid("("));
        assertFalse(solution.isValid("]"));
        assertTrue(solution.isValid(""));
        assertTrue(solution.isValid(null));
    }

}