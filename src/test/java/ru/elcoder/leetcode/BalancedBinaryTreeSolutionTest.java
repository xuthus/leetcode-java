package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.*;

public class BalancedBinaryTreeSolutionTest {

    @Test
    public void isBalanced() {
        BalancedBinaryTreeSolution solution = new BalancedBinaryTreeSolution();
        assertTrue(solution.isBalanced(null));
        assertTrue(solution.isBalanced(new TreeNode(5)));
        assertTrue(solution.isBalanced(new TreeNode(5, new TreeNode(3), null)));
        assertTrue(solution.isBalanced(new TreeNode(5, new TreeNode(3), new TreeNode(10))));
        assertTrue(solution.isBalanced(new TreeNode(5, null, new TreeNode(10))));
        assertFalse(solution.isBalanced(new TreeNode(5, null, new TreeNode(10, new TreeNode(15), null))));
    }
}