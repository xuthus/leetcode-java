package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class InvertBinaryTreeSolutionTest {

    @Test
    public void invertTree1() {
        final InvertBinaryTreeSolution solution = new InvertBinaryTreeSolution();
        final TreeNode treeNode = solution.invertTree(new TreeNode(5));
        assertEquals(5, treeNode.val);
        assertNull(treeNode.left);
        assertNull(treeNode.right);
    }

    @Test
    public void invertTree2() {
        final InvertBinaryTreeSolution solution = new InvertBinaryTreeSolution();
        final TreeNode treeNode = solution.invertTree(new TreeNode(5,
                new TreeNode(10),
                null
        ));
        assertEquals(5, treeNode.val);
        assertNull(treeNode.left);
        assertEquals(10, treeNode.right.val);
    }

    @Test
    public void invertTree3() {
        final InvertBinaryTreeSolution solution = new InvertBinaryTreeSolution();
        final TreeNode treeNode = solution.invertTree(new TreeNode(5,
                new TreeNode(10),
                new TreeNode(12,
                        null,
                        new TreeNode(42)
                )
        ));
        assertEquals(5, treeNode.val);
        assertEquals(12, treeNode.left.val);
        assertEquals(42, treeNode.left.left.val);
        assertEquals(10, treeNode.right.val);
    }
}