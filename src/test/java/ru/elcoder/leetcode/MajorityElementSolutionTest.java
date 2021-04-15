package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class MajorityElementSolutionTest {

    @Test
    public void majorityElement1() {
        final MajorityElementSolution solution = new MajorityElementSolution();
        assertEquals(3, solution.majorityElement(arrayOf(3, 2, 3)));
    }

    @Test
    public void majorityElement2() {
        final MajorityElementSolution solution = new MajorityElementSolution();
        assertEquals(3, solution.majorityElement(arrayOf(3, 3, 2)));
    }

    @Test
    public void majorityElement3() {
        final MajorityElementSolution solution = new MajorityElementSolution();
        assertEquals(3, solution.majorityElement(arrayOf(3, 2, 3, 1, 3)));
    }

    @Test
    public void majorityElement4() {
        final MajorityElementSolution solution = new MajorityElementSolution();
        assertEquals(3, solution.majorityElement(arrayOf(1, 2, 3, 2, 3, 3, 3)));
    }

    @Test
    public void majorityElement5() {
        final MajorityElementSolution solution = new MajorityElementSolution();
        assertEquals(2, solution.majorityElement(arrayOf(2, 2, 1, 1, 1, 2, 2)));
    }

    @Test
    public void majorityElement6() {
        final MajorityElementSolution solution = new MajorityElementSolution();
        assertEquals(Integer.MAX_VALUE, solution.majorityElement(arrayOf(Integer.MAX_VALUE, Integer.MAX_VALUE,
                1, 1, 1, Integer.MAX_VALUE, Integer.MAX_VALUE)));
    }

    @Test
    public void majorityElement7() {
        final MajorityElementSolution solution = new MajorityElementSolution();
        assertEquals(Integer.MAX_VALUE, solution.majorityElement(arrayOf(Integer.MAX_VALUE, Integer.MAX_VALUE,
                Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE)));
    }

    @Test
    public void majorityElement8() {
        final MajorityElementSolution solution = new MajorityElementSolution();
        assertEquals(1, solution.majorityElement(arrayOf(1)));
    }
}
