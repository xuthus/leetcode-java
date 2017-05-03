package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by xuthus on 03.05.2017.
 */
public class ValidAnagramSolutionTest {

    @Test
    public void testIsAnagram() throws Exception {
        ValidAnagramSolution solution = new ValidAnagramSolution();

        assertTrue(solution.isAnagram("123", "213"));
        assertTrue(solution.isAnagram("hello world", "world hello"));
        assertTrue(solution.isAnagram("добрый день!", "день добрый!"));
        assertFalse(solution.isAnagram("123", "234"));
    }
}