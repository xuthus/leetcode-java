package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class TruncateSentenceSolutionTest {

    @Test
    public void truncateSentence() {
        TruncateSentenceSolution solution = new TruncateSentenceSolution();
        assertEquals("Hello", solution.truncateSentence("Hello World", 1));
        assertEquals("Hello World", solution.truncateSentence("Hello World", 2));
    }
}