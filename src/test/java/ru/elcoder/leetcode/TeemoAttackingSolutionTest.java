package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class TeemoAttackingSolutionTest extends TestCase {

    public void testFindPoisonedDuration() {
        TeemoAttackingSolution solution = new TeemoAttackingSolution();

        assertThat(solution.findPoisonedDuration(arrayOf(0), 4)).isEqualTo(4);
        assertThat(solution.findPoisonedDuration(arrayOf(0, 10), 4)).isEqualTo(8);
        assertThat(solution.findPoisonedDuration(arrayOf(0, 10, 20), 4)).isEqualTo(12);
        assertThat(solution.findPoisonedDuration(arrayOf(0, 0, 0, 0, 10, 10, 10, 10, 20, 20), 4)).isEqualTo(12);
    }
}