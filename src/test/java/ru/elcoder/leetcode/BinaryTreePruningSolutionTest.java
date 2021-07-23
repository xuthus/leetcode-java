package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class BinaryTreePruningSolutionTest {

    @Test
    public void pruneTree() {
        final BinaryTreePruningSolution solution = new BinaryTreePruningSolution();
        assertNull(solution.pruneTree(new TreeNode(0)));

        TreeNode tree = solution.pruneTree(new TreeNode(1));
        assertNotNull(tree);
        assertEquals(1, tree.val);
        assertNull(tree.left);
        assertNull(tree.right);

        tree = solution.pruneTree(new TreeNode(1, new TreeNode(0), null));
        assertNotNull(tree);
        assertEquals(1, tree.val);
        assertNull(tree.left);
        assertNull(tree.right);

        tree = solution.pruneTree(new TreeNode(0, new TreeNode(1), null));
        assertNotNull(tree);
        assertEquals(0, tree.val);
        assertNotNull(tree.left);
        assertNull(tree.right);
        assertEquals(1, tree.left.val);
    }
}
