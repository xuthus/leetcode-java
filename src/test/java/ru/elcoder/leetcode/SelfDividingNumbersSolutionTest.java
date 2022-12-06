package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class SelfDividingNumbersSolutionTest extends TestCase {

    public void testSelfDividingNumbers() {
        SelfDividingNumbersSolution solution = new SelfDividingNumbersSolution();

        assertThat(solution.selfDividingNumbers(1, 9)).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThat(solution.selfDividingNumbers(10, 11)).containsExactly(11);
        assertThat(solution.selfDividingNumbers(100, 111)).containsExactly(111);
        assertThat(solution.selfDividingNumbers(1, 22)).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22);
        assertThat(solution.selfDividingNumbers(47, 85)).containsExactly(48, 55, 66, 77);
    }
}