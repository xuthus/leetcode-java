package ru.elcoder.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;
import static ru.elcoder.leetcode.utils.Utils.toIntArray;

public class CombinationSumIISolutionTest {

    @Test
    public void combinationSum21() {
        final CombinationSumIISolution solution = new CombinationSumIISolution();
        final List<List<Integer>> lists = solution.combinationSum2(arrayOf(1, 2, 3, 4), 6);
        assertEquals(2, lists.size());
        assertArrayEquals(arrayOf(1, 2, 3), toIntArray(lists.get(0)));
        assertArrayEquals(arrayOf(2, 4), toIntArray(lists.get(1)));
    }

    @Test
    public void combinationSum22() {
        final CombinationSumIISolution solution = new CombinationSumIISolution();
        final List<List<Integer>> lists = solution.combinationSum2(arrayOf(1, 1, 1), 2);
        assertEquals(1, lists.size());
        assertArrayEquals(arrayOf(1, 1), toIntArray(lists.get(0)));
    }
}
