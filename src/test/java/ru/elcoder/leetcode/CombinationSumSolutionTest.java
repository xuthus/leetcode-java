package ru.elcoder.leetcode;

import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class CombinationSumSolutionTest {

    @Test
    public void combinationSum() {
        final CombinationSumSolution solution = new CombinationSumSolution();
        final List<List<Integer>> lists = solution.combinationSum(arrayOf(2, 3, 6, 7), 7);
        assertEquals(2, lists.size());
    }
}
