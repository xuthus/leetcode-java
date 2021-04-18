package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class PathSumSolutionTest {

    @Test
    public void hasPathSum0() {
        final PathSumSolution solution = new PathSumSolution();
        assertFalse(solution.hasPathSum(
                null,
                0
        ));
    }

    @Test
    public void hasPathSum10() {
        final PathSumSolution solution = new PathSumSolution();
        assertFalse(solution.hasPathSum(
                new TreeNode(10,
                        null,
                        new TreeNode(15)),
                10
        ));
    }

    @Test
    public void hasPathSum1() {
        final PathSumSolution solution = new PathSumSolution();
        assertTrue(solution.hasPathSum(
                new TreeNode(10),
                10
        ));
    }

    @Test
    public void hasPathSum2() {
        final PathSumSolution solution = new PathSumSolution();
        assertTrue(solution.hasPathSum(
                new TreeNode(10,
                        null,
                        new TreeNode(15)),
                25
        ));
    }

    @Test
    public void hasPathSum3() {
        final PathSumSolution solution = new PathSumSolution();
        assertTrue(solution.hasPathSum(
                new TreeNode(10,
                        new TreeNode(12),
                        new TreeNode(15)),
                22
        ));
    }
}