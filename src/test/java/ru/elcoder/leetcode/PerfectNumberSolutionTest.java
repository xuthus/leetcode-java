package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class PerfectNumberSolutionTest extends TestCase {

    public void testCheckPerfectNumber() {
        PerfectNumberSolution solution = new PerfectNumberSolution();

        assertThat(solution.checkPerfectNumber(0)).isFalse();
        assertThat(solution.checkPerfectNumber(1)).isFalse();
        assertThat(solution.checkPerfectNumber(2)).isFalse();
        assertThat(solution.checkPerfectNumber(28)).isTrue();
        assertThat(solution.checkPerfectNumber(29)).isFalse();
        assertThat(solution.checkPerfectNumber(6)).isTrue();
        assertThat(solution.checkPerfectNumber(8128)).isTrue();
        assertThat(solution.checkPerfectNumber(10)).isFalse();
        assertThat(solution.checkPerfectNumber(16)).isFalse();
        assertThat(solution.checkPerfectNumber(33550336)).isTrue();
        assertThat(solution.checkPerfectNumber(33550337)).isFalse();
    }
}