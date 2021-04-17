package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.assertEquals;

public class MaximumDepthOfBinaryTreeSolutionTest {

    @Test
    public void maxDepth1() {
        final MaximumDepthOfBinaryTreeSolution solution = new MaximumDepthOfBinaryTreeSolution();
        assertEquals(0, solution.maxDepth(null));
    }

    @Test
    public void maxDepth2() {
        final MaximumDepthOfBinaryTreeSolution solution = new MaximumDepthOfBinaryTreeSolution();
        assertEquals(1, solution.maxDepth(new TreeNode(10)));
    }

    @Test
    public void maxDepth3() {
        final MaximumDepthOfBinaryTreeSolution solution = new MaximumDepthOfBinaryTreeSolution();
        assertEquals(2, solution.maxDepth(
                new TreeNode(10,
                        new TreeNode(5),
                        null
                )
        ));
    }

    @Test
    public void maxDepth4() {
        final MaximumDepthOfBinaryTreeSolution solution = new MaximumDepthOfBinaryTreeSolution();
        assertEquals(2, solution.maxDepth(
                new TreeNode(10,
                        null,
                        new TreeNode(5)
                )
        ));
    }

    @Test
    public void maxDepth5() {
        final MaximumDepthOfBinaryTreeSolution solution = new MaximumDepthOfBinaryTreeSolution();
        assertEquals(3, solution.maxDepth(
                new TreeNode(10,
                        null,
                        new TreeNode(5,
                                null,
                                new TreeNode(2)
                        )
                )
        ));
    }
}