package ru.elcoder.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PascalsTriangleSolutionTest {

    @Test
    public void generate1() {
        PascalsTriangleSolution solution = new PascalsTriangleSolution();
        List<List<Integer>> list = solution.generate(1);
        assertEquals(1, list.size());
        assertEquals(1, (int) list.get(0).get(0));
    }

    @Test
    public void generate3() {
        PascalsTriangleSolution solution = new PascalsTriangleSolution();
        List<List<Integer>> list = solution.generate(3);
        assertEquals(3, list.size());
        assertEquals(3, (int) list.get(2).size());
        assertEquals(1, (int) list.get(2).get(0));
        assertEquals(2, (int) list.get(2).get(1));
        assertEquals(1, (int) list.get(2).get(2));
    }
}