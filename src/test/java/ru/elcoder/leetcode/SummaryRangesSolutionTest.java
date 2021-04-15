package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class SummaryRangesSolutionTest {

    @Test
    public void summaryRanges10() {
        final SummaryRangesSolution solution = new SummaryRangesSolution();
        assertArrayEquals(
                new String[]{"0->2", "4->5", "7"},
                solution.summaryRanges(arrayOf(0, 1, 2, 4, 5, 7)).toArray(new String[0])
        );
    }

    @Test
    public void summaryRanges11() {
        final SummaryRangesSolution solution = new SummaryRangesSolution();
        assertArrayEquals(
                new String[]{"0", "2->4", "6", "8->9"},
                solution.summaryRanges(arrayOf(0, 2, 3, 4, 6, 8, 9)).toArray(new String[0])
        );
    }

    @Test
    public void summaryRanges12() {
        final SummaryRangesSolution solution = new SummaryRangesSolution();
        assertArrayEquals(
                new String[]{"-1"},
                solution.summaryRanges(arrayOf(-1)).toArray(new String[0])
        );
    }

    @Test
    public void summaryRanges1() {
        final SummaryRangesSolution solution = new SummaryRangesSolution();
        assertArrayEquals(
                new String[]{"1", "3->5", "8"},
                solution.summaryRanges(arrayOf(1, 3, 4, 5, 8)).toArray(new String[0])
        );
    }

    @Test
    public void summaryRanges2() {
        final SummaryRangesSolution solution = new SummaryRangesSolution();
        assertArrayEquals(
                new String[]{"1", "8"},
                solution.summaryRanges(arrayOf(1, 8)).toArray(new String[0])
        );
    }

    @Test
    public void summaryRanges3() {
        final SummaryRangesSolution solution = new SummaryRangesSolution();
        assertArrayEquals(
                new String[]{"1"},
                solution.summaryRanges(arrayOf(1)).toArray(new String[0])
        );
    }

    @Test
    public void summaryRanges4() {
        final SummaryRangesSolution solution = new SummaryRangesSolution();
        assertArrayEquals(
                new String[]{"1->3"},
                solution.summaryRanges(arrayOf(1, 2, 3)).toArray(new String[0])
        );
    }

    @Test
    public void summaryRanges5() {
        final SummaryRangesSolution solution = new SummaryRangesSolution();
        assertArrayEquals(
                new String[]{},
                solution.summaryRanges(new int[0]).toArray(new String[0])
        );
    }
}
