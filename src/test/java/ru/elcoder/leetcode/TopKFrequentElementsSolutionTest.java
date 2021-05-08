package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class TopKFrequentElementsSolutionTest {

    @Test
    public void topKFrequent() {
        final TopKFrequentElementsSolution solution = new TopKFrequentElementsSolution();
        assertArrayEquals(arrayOf(2, 1), solution.topKFrequent(arrayOf(1, 1, 1, 2, 2, 3), 2));
        assertArrayEquals(arrayOf(1), solution.topKFrequent(arrayOf(1, 1, 1, 2, 2, 3), 1));
        assertArrayEquals(arrayOf(3, 2, 1), solution.topKFrequent(arrayOf(1, 1, 1, 2, 2, 3), 3));
    }
}