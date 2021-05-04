package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.utils.Utils;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class PartitionLabelsSolutionTest {

    @Test
    public void partitionLabels() {
        final PartitionLabelsSolution solution = new PartitionLabelsSolution();
        assertArrayEquals(arrayOf(1), Utils.toIntArray(solution.partitionLabels("a")));
        assertArrayEquals(arrayOf(1, 1), Utils.toIntArray(solution.partitionLabels("ab")));
        assertArrayEquals(arrayOf(3), Utils.toIntArray(solution.partitionLabels("aba")));
        assertArrayEquals(arrayOf(3, 3), Utils.toIntArray(solution.partitionLabels("abacec")));
    }
}
