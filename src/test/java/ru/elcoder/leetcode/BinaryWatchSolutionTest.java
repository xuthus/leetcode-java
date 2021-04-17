package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class BinaryWatchSolutionTest {

    @Test
    public void readBinaryWatch1() {
        final BinaryWatchSolution solution = new BinaryWatchSolution();
        assertArrayEquals(
                arrayOf("0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00", "4:00", "8:00"),
                solution.readBinaryWatch(1).toArray(new String[0])
        );
    }

    @Test
    public void readBinaryWatch2() {
        final BinaryWatchSolution solution = new BinaryWatchSolution();
        assertEquals(
                0,
                solution.readBinaryWatch(9).size()
        );
    }
}