package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class ConstructBinaryTreeFromPreorderAndInorderTraversalSolutionTest {

    @Test
    public void buildTree1() {
        ConstructBinaryTreeFromPreorderAndInorderTraversalSolution solution = new ConstructBinaryTreeFromPreorderAndInorderTraversalSolution();
        TreeNode node = solution.buildTree(arrayOf(7), arrayOf(7));
        assertEquals(7, node.val);
        assertNull(node.left);
        assertNull(node.right);
    }

    @Test
    public void buildTree2() {
        ConstructBinaryTreeFromPreorderAndInorderTraversalSolution solution = new ConstructBinaryTreeFromPreorderAndInorderTraversalSolution();
        TreeNode node = solution.buildTree(arrayOf(7, 5, 10), arrayOf(5, 7, 10));
        assertEquals(7, node.val);
        assertEquals(5, node.left.val);
        assertEquals(10, node.right.val);
    }

    @Test
    public void buildTree3() {
        ConstructBinaryTreeFromPreorderAndInorderTraversalSolution solution = new ConstructBinaryTreeFromPreorderAndInorderTraversalSolution();
        TreeNode node = solution.buildTree(arrayOf(7, 5, 4, 6, 10, 9, 12), arrayOf(4, 5, 6, 7, 9, 10, 12));
        assertEquals(7, node.val);
        assertEquals(5, node.left.val);
        assertEquals(10, node.right.val);
        assertEquals(12, node.right.right.val);
        assertEquals(9, node.right.left.val);
    }
}