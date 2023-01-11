package ru.elcoder.leetcode;

import junit.framework.TestCase;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class FindNUniqueIntegersSumUpToZeroSolutionTest extends TestCase {

    public void testSumZero() {
        FindNUniqueIntegersSumUpToZeroSolution solution = new FindNUniqueIntegersSumUpToZeroSolution();

        assertThat(Arrays.stream(solution.sumZero(5)).sum()).isEqualTo(0);
        assertThat(Arrays.stream(solution.sumZero(2)).sum()).isEqualTo(0);
        assertThat(Arrays.stream(solution.sumZero(100)).sum()).isEqualTo(0);
    }

}
