package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class ThreeEqualPartsSolutionTest {

    @Test
    public void threeEqualParts1() {
        final ThreeEqualPartsSolution solution = new ThreeEqualPartsSolution();
        assertArrayEquals(arrayOf(-1, -1), solution.threeEqualParts(arrayOf(0, 1, 1, 0, 0)));
    }

    @Test
    public void threeEqualParts2() {
        final ThreeEqualPartsSolution solution = new ThreeEqualPartsSolution();
        assertArrayEquals(arrayOf(-1, -1), solution.threeEqualParts(arrayOf(0, 1, 1, 0, 0, 1, 1)));
    }

    @Test
    public void threeEqualParts3() {
        final ThreeEqualPartsSolution solution = new ThreeEqualPartsSolution();
        assertArrayEquals(arrayOf(-1, -1), solution.threeEqualParts(arrayOf(1, 1, 1, 0, 0)));
    }

    @Test
    public void threeEqualParts4() {
        final ThreeEqualPartsSolution solution = new ThreeEqualPartsSolution();
        assertArrayEquals(arrayOf(0, 2), solution.threeEqualParts(arrayOf(1, 1, 1)));
    }

    @Test
    public void threeEqualParts5() {
        final ThreeEqualPartsSolution solution = new ThreeEqualPartsSolution();
        assertArrayEquals(arrayOf(1, 4), solution.threeEqualParts(arrayOf(0, 1, 0, 1, 0, 1)));
    }

    @Test
    public void threeEqualParts6() {
        final ThreeEqualPartsSolution solution = new ThreeEqualPartsSolution();
        assertArrayEquals(arrayOf(1, 4), solution.threeEqualParts(arrayOf(0, 1, 0, 1, 1)));
    }

    @Test
    public void threeEqualParts7() {
        final ThreeEqualPartsSolution solution = new ThreeEqualPartsSolution();
        assertArrayEquals(arrayOf(1, 6), solution.threeEqualParts(arrayOf(0, 1, 0, 0, 0, 1, 1)));
    }

    @Test
    public void threeEqualParts8() {
        final ThreeEqualPartsSolution solution = new ThreeEqualPartsSolution();
        assertArrayEquals(arrayOf(-1, -1), solution.threeEqualParts(arrayOf(0, 1, 0, 0, 0, 1, 1, 0)));
    }

    @Test
    public void threeEqualParts9() {
        final ThreeEqualPartsSolution solution = new ThreeEqualPartsSolution();
        assertArrayEquals(arrayOf(2, 7), solution.threeEqualParts(arrayOf(0, 1, 0, 0, 0, 1, 0, 1, 0)));
    }

    @Test
    public void threeEqualParts10() {
        final ThreeEqualPartsSolution solution = new ThreeEqualPartsSolution();
        assertArrayEquals(arrayOf(0, 4), solution.threeEqualParts(arrayOf(0, 0, 0, 0, 0)));
    }

    @Test
    public void threeEqualParts11() {
        final ThreeEqualPartsSolution solution = new ThreeEqualPartsSolution();
        assertArrayEquals(arrayOf(-1, -1), solution.threeEqualParts(arrayOf(1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1)));
    }
}
