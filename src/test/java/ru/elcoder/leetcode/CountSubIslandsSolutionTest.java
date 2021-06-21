package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class CountSubIslandsSolutionTest {

    @Test
    public void countSubIslands1() {
        final CountSubIslandsSolution solution = new CountSubIslandsSolution();
        assertEquals(3, solution.countSubIslands(
                new int[][]{
                        arrayOf(1, 1, 1, 0, 0),
                        arrayOf(0, 1, 1, 1, 1),
                        arrayOf(0, 0, 0, 0, 0),
                        arrayOf(1, 0, 0, 0, 0),
                        arrayOf(1, 1, 0, 1, 1)
                },
                new int[][]{
                        arrayOf(1, 1, 1, 0, 0),
                        arrayOf(0, 0, 1, 1, 1),
                        arrayOf(0, 1, 0, 0, 0),
                        arrayOf(1, 0, 1, 1, 0),
                        arrayOf(0, 1, 0, 1, 0)
                }
        ));
    }

    @Test
    public void countSubIslands2() {
        final CountSubIslandsSolution solution = new CountSubIslandsSolution();
        assertEquals(2, solution.countSubIslands(
                new int[][]{
                        arrayOf(1, 0, 1, 0, 1),
                        arrayOf(1, 1, 1, 1, 1),
                        arrayOf(0, 0, 0, 0, 0),
                        arrayOf(1, 1, 1, 1, 1),
                        arrayOf(1, 0, 1, 0, 1)
                },
                new int[][]{
                        arrayOf(0, 0, 0, 0, 0),
                        arrayOf(1, 1, 1, 1, 1),
                        arrayOf(0, 1, 0, 1, 0),
                        arrayOf(0, 1, 0, 1, 0),
                        arrayOf(1, 0, 0, 0, 1)
                }
        ));
    }
}
