package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;
import ru.elcoder.leetcode.utils.Utils;

import java.util.List;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class BinaryTreeLevelOrderTraversalSolutionTest {

    @Test
    public void levelOrder() {
        final BinaryTreeLevelOrderTraversalSolution solution = new BinaryTreeLevelOrderTraversalSolution();
        List<List<Integer>> lists = solution.levelOrder(new TreeNode(1));
        assertEquals(1, lists.size());
        assertArrayEquals(arrayOf(1), Utils.toIntArray(lists.get(0)));

        lists = solution.levelOrder(new TreeNode(1, null, new TreeNode(7)));
        assertEquals(2, lists.size());
        assertArrayEquals(arrayOf(1), Utils.toIntArray(lists.get(0)));
        assertArrayEquals(arrayOf(7), Utils.toIntArray(lists.get(1)));

        lists = solution.levelOrder(new TreeNode(1, new TreeNode(3, new TreeNode(12), null), new TreeNode(7, new TreeNode(42), new TreeNode(67))));
        assertEquals(3, lists.size());
        assertArrayEquals(arrayOf(1), Utils.toIntArray(lists.get(0)));
        assertArrayEquals(arrayOf(3, 7), Utils.toIntArray(lists.get(1)));
        assertArrayEquals(arrayOf(12, 42, 67), Utils.toIntArray(lists.get(2)));
    }
}