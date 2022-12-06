package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class WordPatternSolutionTest extends TestCase {

    public void testWordPattern_true() {
        WordPatternSolution solution = new WordPatternSolution();

        boolean matches = solution.wordPattern("aaaa", "dog dog dog dog");

        assertThat(matches).isTrue();

        matches = solution.wordPattern("abba", "dog cat cat dog");

        assertThat(matches).isTrue();

        matches = solution.wordPattern("abb", "dog cat cat");

        assertThat(matches).isTrue();

        matches = solution.wordPattern("a", "dog");

        assertThat(matches).isTrue();
    }

    public void testWordPattern_false() {
        WordPatternSolution solution = new WordPatternSolution();

        boolean matches = solution.wordPattern("aaaa", "dog dog dog cat");

        assertThat(matches).isFalse();

        matches = solution.wordPattern("aaaa", "cat dog dog dog");

        assertThat(matches).isFalse();

        matches = solution.wordPattern("aaaa", "dog dog dog");

        assertThat(matches).isFalse();

        matches = solution.wordPattern("aaaa", "dog dog dog dog dog");

        assertThat(matches).isFalse();

        matches = solution.wordPattern("aabb", "dog dog cat dog");

        assertThat(matches).isFalse();

        matches = solution.wordPattern("babb", "dog dog cat dog");

        assertThat(matches).isFalse();
    }

    public void testWordPattern_case1() {
        WordPatternSolution solution = new WordPatternSolution();

        boolean matches = solution.wordPattern("abba", "dog dog dog dog");

        assertThat(matches).isFalse();
    }
}