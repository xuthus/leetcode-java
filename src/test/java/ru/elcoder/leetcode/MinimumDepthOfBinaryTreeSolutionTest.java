package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.*;

public class MinimumDepthOfBinaryTreeSolutionTest {

    @Test
    public void minDepth() {
        MinimumDepthOfBinaryTreeSolution solution = new MinimumDepthOfBinaryTreeSolution();
        assertEquals(0, solution.minDepth(null));
        assertEquals(1, solution.minDepth(new TreeNode(5)));
        assertEquals(2, solution.minDepth(new TreeNode(5, null, new TreeNode(7))));
    }
}