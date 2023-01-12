package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class RansomNoteSolutionTest extends TestCase {

    public void testCanConstruct() {
        RansomNoteSolution solution = new RansomNoteSolution();

        assertThat(solution.canConstruct("hell", "hello")).isTrue();
        assertThat(solution.canConstruct("hell", "shell")).isTrue();
        assertThat(solution.canConstruct("cell", "shell")).isFalse();
    }

}
