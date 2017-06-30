package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by xuthus on 30.06.2017.
 */
public class RepeatedSubstringPatternSolutionTest {
    @Test
    public void repeatedPattern() throws Exception {
        RepeatedSubstringPatternSolution solution = new RepeatedSubstringPatternSolution();
        assertTrue(solution.repeatedPattern(2, "abab"));
    }

    @Test
    public void repeatedSubstringPattern() throws Exception {
        RepeatedSubstringPatternSolution solution = new RepeatedSubstringPatternSolution();

        assertFalse(solution.repeatedSubstringPattern(""));
        assertFalse(solution.repeatedSubstringPattern("a"));
        assertTrue(solution.repeatedSubstringPattern("abab"));
        assertTrue(solution.repeatedSubstringPattern("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabc"));
        assertFalse(solution.repeatedSubstringPattern("abcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabcabe"));
        assertTrue(solution.repeatedSubstringPattern("sergeysergeysergeysergeysergeysergeysergeysergeysergeysergeysergey"));
        assertFalse(solution.repeatedSubstringPattern("aba"));
    }

}