package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveDigitFromNumberToMaximizeResultSolutionTest extends TestCase {

    public void testRemoveDigit() {
        RemoveDigitFromNumberToMaximizeResultSolution solution = new RemoveDigitFromNumberToMaximizeResultSolution();

        assertThat(solution.removeDigit("123", '3')).isEqualTo("12");
        assertThat(solution.removeDigit("1231", '1')).isEqualTo("231");
        assertThat(solution.removeDigit("551", '5')).isEqualTo("51");
    }
}