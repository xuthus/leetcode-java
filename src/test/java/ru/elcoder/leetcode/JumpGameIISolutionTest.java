package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class JumpGameIISolutionTest extends TestCase {

    public void testJump() {
        JumpGameIISolution solution = new JumpGameIISolution();

        assertThat(solution.jump(arrayOf(2, 3, 1, 1, 4))).isEqualTo(2);
        assertThat(solution.jump(arrayOf(2, 3, 0, 1, 4))).isEqualTo(2);
        assertThat(solution.jump(arrayOf(1, 1, 1, 1))).isEqualTo(3);
        assertThat(solution.jump(arrayOf(10, 1, 1, 0, 0, 0, 1))).isEqualTo(1);
        assertThat(solution.jump(arrayOf(1, 10, 1, 1, 0, 0, 0, 1))).isEqualTo(2);
        assertThat(solution.jump(arrayOf(3, 1, 1, 4, 2, 1, 1, 0))).isEqualTo(2);
        assertThat(solution.jump(arrayOf(2, 3, 1, 1, 4, 7, 1, 1, 0, 0, 4, 2, 1, 1, 1, 2, 0, 1, 1))).isEqualTo(8);
    }
}