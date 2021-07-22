package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class PartitionArrayIntoDisjointIntervalsSolutionTest {

    @Test
    public void partitionDisjoint() {
        final PartitionArrayIntoDisjointIntervalsSolution solution = new PartitionArrayIntoDisjointIntervalsSolution();
        assertEquals(3, solution.partitionDisjoint(arrayOf(5, 0, 3, 8, 6)));
        assertEquals(4, solution.partitionDisjoint(arrayOf(1, 1, 1, 0, 6, 12)));
    }
}
