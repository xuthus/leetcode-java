package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.*;

public class BinaryTreeMaximumPathSumSolutionTest {

    @Test
    public void maxPathSum() {
        BinaryTreeMaximumPathSumSolution solution = new BinaryTreeMaximumPathSumSolution();
        assertEquals(3, solution.maxPathSum(new TreeNode(3)));
        assertEquals(11, solution.maxPathSum(new TreeNode(3, new TreeNode(8), null)));
        assertEquals(3, solution.maxPathSum(new TreeNode(3, new TreeNode(-8), null)));
        assertEquals(8, solution.maxPathSum(new TreeNode(-3, new TreeNode(8), null)));
        assertEquals(15, solution.maxPathSum(new TreeNode(-3, new TreeNode(8), new TreeNode(10))));
        assertEquals(10, solution.maxPathSum(new TreeNode(-30, new TreeNode(8), new TreeNode(10))));
        assertEquals(13, solution.maxPathSum(
                new TreeNode(-30,
                        new TreeNode(8),
                        new TreeNode(10, new TreeNode(3), new TreeNode(-5))
                )
        ));
        assertEquals(18, solution.maxPathSum(
                new TreeNode(-30,
                        new TreeNode(8),
                        new TreeNode(10, new TreeNode(3), new TreeNode(5))
                )
        ));
    }
}