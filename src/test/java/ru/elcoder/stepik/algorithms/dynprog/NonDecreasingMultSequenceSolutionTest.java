package ru.elcoder.stepik.algorithms.dynprog;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;
import static ru.elcoder.stepik.algorithms.dynprog.NonDecreasingMultSequenceSolution.findMaxSequenceLength;

public class NonDecreasingMultSequenceSolutionTest {

    @Test
    public void testFindMaxSequenceLength() {
        assertEquals(3, findMaxSequenceLength(arrayOf(3, 6, 7, 12)));
        assertEquals(3, findMaxSequenceLength(arrayOf(3, 6, 8, 7, 12)));
        assertEquals(3, findMaxSequenceLength(arrayOf(3, 6, 8, 7, 12, 6)));
        assertEquals(3, findMaxSequenceLength(arrayOf(3, 9, 6, 8, 7, 12, 6)));
    }
}