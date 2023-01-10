package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class FindKthBitInNthBinaryStringSolutionTest extends TestCase {

    public void testFindKthBit() {
        FindKthBitInNthBinaryStringSolution solution = new FindKthBitInNthBinaryStringSolution();

        assertThat(solution.findKthBit(3, 1)).isEqualTo('0');
        assertThat(solution.findKthBit(4, 11)).isEqualTo('1');
    }
}