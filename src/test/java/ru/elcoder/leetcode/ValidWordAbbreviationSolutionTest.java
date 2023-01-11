package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidWordAbbreviationSolutionTest extends TestCase {

    public void testValidWordAbbreviation() {
        ValidWordAbbreviationSolution solution = new ValidWordAbbreviationSolution();

        assertThat(solution.validWordAbbreviation("hello", "h4")).isTrue();
        assertThat(solution.validWordAbbreviation("hello", "4o")).isTrue();
        assertThat(solution.validWordAbbreviation("hello", "5")).isTrue();
        assertThat(solution.validWordAbbreviation("hello", "2l2")).isTrue();
        assertThat(solution.validWordAbbreviation("hello", "2l3")).isFalse();
        assertThat(solution.validWordAbbreviation("hello", "2ll2")).isFalse();
        assertThat(solution.validWordAbbreviation("hello", "6")).isFalse();
    }
}