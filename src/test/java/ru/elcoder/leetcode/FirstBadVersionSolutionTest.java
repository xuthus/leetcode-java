package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstBadVersionSolutionTest extends TestCase {

    public void testFirstBadVersion() {
        FirstBadVersionSolution solution = new FirstBadVersionSolution();

        solution.setBadVersion(1);
        assertThat(solution.firstBadVersion(2)).isEqualTo(1);

        solution.setBadVersion(1702766719);
        assertThat(solution.firstBadVersion(2126753390)).isEqualTo(1702766719);

        for (int i = 1; i < 100; i++) {
            for (int j = i; j < 100; j++) {
                solution.setBadVersion(i);
                assertThat(solution.firstBadVersion(j)).isEqualTo(i);
            }
        }
        solution.setBadVersion(4);
        assertThat(solution.firstBadVersion(6)).isEqualTo(4);

        solution.setBadVersion(4);
        assertThat(solution.firstBadVersion(7)).isEqualTo(4);

        solution.setBadVersion(4);
        assertThat(solution.firstBadVersion(7000)).isEqualTo(4);
    }
}