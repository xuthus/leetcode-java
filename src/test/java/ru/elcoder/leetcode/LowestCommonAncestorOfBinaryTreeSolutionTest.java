package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.*;

public class LowestCommonAncestorOfBinaryTreeSolutionTest {

    @Test
    public void lowestCommonAncestor1() {
        final LowestCommonAncestorOfBinaryTreeSolution solution = new LowestCommonAncestorOfBinaryTreeSolution();

        final TreeNode node5 = new TreeNode(5);
        final TreeNode node1 = new TreeNode(1);
        assertEquals(3, solution.lowestCommonAncestor(
                new TreeNode(3, node5, node1),
                node5, node1
        ).val);
    }

    @Test
    public void lowestCommonAncestor2() {
        final LowestCommonAncestorOfBinaryTreeSolution solution = new LowestCommonAncestorOfBinaryTreeSolution();

        final TreeNode node7 = new TreeNode(7);
        final TreeNode node5 = new TreeNode(5, null, node7);
        final TreeNode node1 = new TreeNode(1);
        assertEquals(5, solution.lowestCommonAncestor(
                new TreeNode(3, node5, node1),
                node5, node7
        ).val);
    }
}