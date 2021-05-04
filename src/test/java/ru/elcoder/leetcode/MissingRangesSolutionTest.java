package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class MissingRangesSolutionTest {

    @Test
    public void findMissingRanges() {
        final MissingRangesSolution solution = new MissingRangesSolution();
        assertEquals("1", String.join(",", solution.findMissingRanges(arrayOf(0), 0, 1)));
        assertEquals("1->10", String.join(",",
                solution.findMissingRanges(arrayOf(0), 0, 10)));
        assertEquals("1->9", String.join(",",
                solution.findMissingRanges(arrayOf(0, 10), 0, 10)));
        assertEquals("1->8,10", String.join(",",
                solution.findMissingRanges(arrayOf(0, 9), 0, 10)));
        assertEquals("1", String.join(",",
                solution.findMissingRanges(arrayOf(0, 2), 0, 2)));
        assertEquals("1->4", String.join(",",
                solution.findMissingRanges(arrayOf(0, 5), 0, 5)));
    }
}
