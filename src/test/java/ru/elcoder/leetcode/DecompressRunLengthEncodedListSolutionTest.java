package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class DecompressRunLengthEncodedListSolutionTest {

    @Test
    public void decompressRLElist() {
        DecompressRunLengthEncodedListSolution solution = new DecompressRunLengthEncodedListSolution();
        assertArrayEquals(arrayOf(1), solution.decompressRLElist(arrayOf(1, 1)));
        assertArrayEquals(arrayOf(1, 1, 1), solution.decompressRLElist(arrayOf(3, 1)));
        assertArrayEquals(arrayOf(1, 1, 1, 2, 3, 3), solution.decompressRLElist(arrayOf(3, 1, 1, 2, 2, 3)));
    }
}