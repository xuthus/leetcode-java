package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.assertEquals;

public class LowestCommonAncestorOfBinarySearchTreeSolutionTest {

    @Test
    public void lowestCommonAncestor1() {
        final LowestCommonAncestorOfBinarySearchTreeSolution solution = new LowestCommonAncestorOfBinarySearchTreeSolution();
        final TreeNode node5 = new TreeNode(5);
        final TreeNode node8 = new TreeNode(8);
        final TreeNode root = new TreeNode(7,
                node5,
                node8
        );
        assertEquals(root, solution.lowestCommonAncestor(
                root,
                node5,
                node8
        ));
    }

    @Test
    public void lowestCommonAncestor2() {
        final LowestCommonAncestorOfBinarySearchTreeSolution solution = new LowestCommonAncestorOfBinarySearchTreeSolution();
        final TreeNode node5 = new TreeNode(5);
        final TreeNode node8 = new TreeNode(8);
        final TreeNode root = new TreeNode(7,
                node5,
                node8
        );
        assertEquals(root, solution.lowestCommonAncestor(
                root,
                root,
                node8
        ));
    }

    @Test
    public void lowestCommonAncestor3() {
        final LowestCommonAncestorOfBinarySearchTreeSolution solution = new LowestCommonAncestorOfBinarySearchTreeSolution();
        final TreeNode node6 = new TreeNode(6);
        final TreeNode node5 = new TreeNode(5, null, node6);
        final TreeNode node8 = new TreeNode(8);
        final TreeNode root = new TreeNode(7,
                node5,
                node8
        );
        assertEquals(root, solution.lowestCommonAncestor(
                root,
                node6,
                node8
        ));
    }
}