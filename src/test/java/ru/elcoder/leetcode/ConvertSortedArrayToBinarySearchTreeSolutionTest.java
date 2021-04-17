package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.models.TreeNode;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class ConvertSortedArrayToBinarySearchTreeSolutionTest {

    @Test
    public void sortedArrayToBST1() {
        final ConvertSortedArrayToBinarySearchTreeSolution solution = new ConvertSortedArrayToBinarySearchTreeSolution();
        final TreeNode treeNode = solution.sortedArrayToBST(arrayOf(-10, -3, 0, 5, 9));
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
    public void sortedArrayToBST2() {
        final ConvertSortedArrayToBinarySearchTreeSolution solution = new ConvertSortedArrayToBinarySearchTreeSolution();
        final TreeNode treeNode = solution.sortedArrayToBST(arrayOf(1, 3));
        assertEquals(treeNode, new TreeNode(3,
                new TreeNode(1),
                null
        ));
    }
}