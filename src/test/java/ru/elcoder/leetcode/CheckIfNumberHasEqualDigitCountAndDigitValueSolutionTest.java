package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckIfNumberHasEqualDigitCountAndDigitValueSolutionTest extends TestCase {

    public void testDigitCount() {
        CheckIfNumberHasEqualDigitCountAndDigitValueSolution solution = new CheckIfNumberHasEqualDigitCountAndDigitValueSolution();

        assertThat(solution.digitCount("1234")).isFalse();
        assertThat(solution.digitCount("1210")).isTrue();
        assertThat(solution.digitCount("030")).isFalse();
        assertThat(solution.digitCount("1238")).isFalse();
    }
}