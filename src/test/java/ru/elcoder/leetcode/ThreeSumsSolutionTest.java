package ru.elcoder.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;
import static ru.elcoder.leetcode.utils.Utils.toIntArray;

public class ThreeSumsSolutionTest {

    @Test
    public void threeSum1() {
        final ThreeSumsSolution solution = new ThreeSumsSolution();
        final List<List<Integer>> triplets = solution.threeSum(arrayOf(-1, 0, 1, 2, -1, -4));
        assertEquals(2, triplets.size());
        assertArrayEquals(arrayOf(-1, -1, 2), toIntArray(triplets.get(0)));
        assertArrayEquals(arrayOf(-1, 0, 1), toIntArray(triplets.get(1)));
    }

    @Test
    public void threeSum0() {
        final ThreeSumsSolution solution = new ThreeSumsSolution();
        final List<List<Integer>> triplets = solution.threeSum(arrayOf(-1, -1, -1, -1, -1, 0, 0, 0, 0, 2, 2, 2, 2, 2));
        assertEquals(2, triplets.size());
        assertArrayEquals(arrayOf(-1, -1, 2), toIntArray(triplets.get(0)));
        assertArrayEquals(arrayOf(0, 0, 0), toIntArray(triplets.get(1)));
    }

    @Test
    public void threeSum3() {
        final ThreeSumsSolution solution = new ThreeSumsSolution();
        final List<List<Integer>> triplets = solution.threeSum(arrayOf(-1, 0, 1, 10, 10, 10, 20, 25, 30, 30));
        assertEquals(1, triplets.size());
        assertArrayEquals(arrayOf(-1, 0, 1), toIntArray(triplets.get(0)));
    }

    @Test
    public void threeSum2() {
        final ThreeSumsSolution solution = new ThreeSumsSolution();
        List<List<Integer>> triplets = solution.threeSum(new int[0]);
        assertEquals(0, triplets.size());
        triplets = solution.threeSum(arrayOf(0));
        assertEquals(0, triplets.size());
    }

    @Test
    public void threeSum4() {
        final ThreeSumsSolution solution = new ThreeSumsSolution();
        List<List<Integer>> triplets = solution.threeSum(arrayOf(1, -1, -1, 0));
        assertEquals(1, triplets.size());
    }
}