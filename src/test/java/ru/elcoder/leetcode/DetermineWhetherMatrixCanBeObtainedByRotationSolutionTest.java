package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class DetermineWhetherMatrixCanBeObtainedByRotationSolutionTest {

    @Test
    public void findRotation1() {
        final DetermineWhetherMatrixCanBeObtainedByRotationSolution solution = new DetermineWhetherMatrixCanBeObtainedByRotationSolution();
        assertTrue(solution.findRotation(
                new int[][]{
                        arrayOf(0, 1),
                        arrayOf(1, 0)
                },
                new int[][]{
                        arrayOf(1, 0),
                        arrayOf(0, 1)
                }
        ));
    }

    @Test
    public void findRotation2() {
        final DetermineWhetherMatrixCanBeObtainedByRotationSolution solution = new DetermineWhetherMatrixCanBeObtainedByRotationSolution();
        assertFalse(solution.findRotation(
                new int[][]{
                        arrayOf(0, 1),
                        arrayOf(1, 1)
                },
                new int[][]{
                        arrayOf(1, 0),
                        arrayOf(0, 1)
                }
        ));
    }
}
