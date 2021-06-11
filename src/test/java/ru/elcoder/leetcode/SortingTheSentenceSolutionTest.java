package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTheSentenceSolutionTest {

    @Test
    public void sortSentence() {
        SortingTheSentenceSolution solution = new SortingTheSentenceSolution();
        assertEquals("This is a cat", solution.sortSentence("This1 is2 a3 cat4"));
        assertEquals("This is a cat", solution.sortSentence("a3 is2 This1 cat4"));
    }
}