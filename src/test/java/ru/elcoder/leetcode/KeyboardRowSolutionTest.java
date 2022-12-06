package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class KeyboardRowSolutionTest extends TestCase {

    public void testFindWords() {
        KeyboardRowSolution solution = new KeyboardRowSolution();

        String[] actual = solution.findWords(arrayOf("Hello", "Alaska", "Dad", "Peace"));

        assertThat(actual).containsExactlyInAnyOrder("Alaska", "Dad");

        actual = solution.findWords(arrayOf("omk"));

        assertThat(actual).isEmpty();

        actual = solution.findWords(arrayOf("adsdf", "sfd"));

        assertThat(actual).containsExactlyInAnyOrder("adsdf", "sfd");
    }
}