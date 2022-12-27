package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class NextGreaterElementISolutionTest extends TestCase {

    public void testNextGreaterElement() {
        NextGreaterElementISolution solution = new NextGreaterElementISolution();

        assertThat(solution.nextGreaterElement(arrayOf(1, 2), arrayOf(1, 2)))
                .isEqualTo(arrayOf(2, -1));
        assertThat(solution.nextGreaterElement(arrayOf(4, 1, 2), arrayOf(1, 3, 4, 2)))
                .isEqualTo(arrayOf(-1, 3, -1));
        assertThat(solution.nextGreaterElement(arrayOf(2, 4), arrayOf(1, 2, 3, 4)))
                .isEqualTo(arrayOf(3, -1));
        assertThat(solution.nextGreaterElement(arrayOf(4), arrayOf(1, 3, 4, 2)))
                .isEqualTo(arrayOf(-1));
        assertThat(solution.nextGreaterElement(arrayOf(4, 1, 2, 5, 6), arrayOf(6, 5, 1, 3, 4, 2)))
                .isEqualTo(arrayOf(-1, 3, -1, -1, -1));
    }
}