package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIfSentenceIsPangramSolutionTest {

    @Test
    public void checkIfPangram() {
        final CheckIfSentenceIsPangramSolution solution = new CheckIfSentenceIsPangramSolution();
        assertTrue(solution.checkIfPangram2("thequickbrownfoxjumpsoverthelazydog"));
        assertTrue(solution.checkIfPangram2("thequickbrownfoxjumpsoverthelazydogaaa"));
        assertTrue(solution.checkIfPangram2("aaathequickbrownfoxjumpsoverthelazydogaaa"));
        assertFalse(solution.checkIfPangram2("thequickbrownfoxjumpsoverthelazydo"));
    }
}
