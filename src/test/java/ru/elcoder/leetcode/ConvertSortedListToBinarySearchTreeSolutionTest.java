package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.ListNode;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ConvertSortedListToBinarySearchTreeSolutionTest {

    @Test
    public void sortedListToBST1() {
        final ConvertSortedListToBinarySearchTreeSolution solution = new ConvertSortedListToBinarySearchTreeSolution();
        final TreeNode treeNode = solution.sortedListToBST(ListNode.fromArray(-10, -3, 0, 5, 9));
        assertEquals(treeNode, new TreeNode(0,
                new TreeNode(-3,
                        new TreeNode(-10),
                        null
                ),
                new TreeNode(9,
                        new TreeNode(5),
                        null
                )
        ));
    }

    @Test
    public void sortedListToBST2() {
        final ConvertSortedListToBinarySearchTreeSolution solution = new ConvertSortedListToBinarySearchTreeSolution();
        final TreeNode treeNode = solution.sortedListToBST(ListNode.fromArray(1, 3));
        assertEquals(treeNode, new TreeNode(3,
                new TreeNode(1),
                null
        ));
    }

    @Test
    public void sortedListToBST3() {
        final ConvertSortedListToBinarySearchTreeSolution solution = new ConvertSortedListToBinarySearchTreeSolution();
        final TreeNode treeNode = solution.sortedListToBST(ListNode.fromArray(1));
        assertEquals(treeNode, new TreeNode(1));
    }

    @Test
    public void sortedListToBST4() {
        final ConvertSortedListToBinarySearchTreeSolution solution = new ConvertSortedListToBinarySearchTreeSolution();
        final TreeNode treeNode = solution.sortedListToBST(null);
        assertNull(treeNode);
    }
}