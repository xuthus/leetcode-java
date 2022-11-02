package ru.elcoder.leetcode.utils;

import junit.framework.TestCase;
import ru.elcoder.leetcode.models.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class UtilsTest extends TestCase {

    public void testArrayToTreeNode_1() {
        TreeNode treeNode = Utils.arrayToTreeNode(0);

        assertThat(treeNode.val).isEqualTo(0);
        assertThat(treeNode.left).isNull();
        assertThat(treeNode.right).isNull();
    }

    public void testArrayToTreeNode_2() {
        TreeNode treeNode = Utils.arrayToTreeNode(0, 1, 2);

        assertThat(treeNode.val).isEqualTo(0);
        assertThat(treeNode.left).isNotNull();
        assertThat(treeNode.right).isNotNull();
        assertThat(treeNode.left.val).isEqualTo(1);
        assertThat(treeNode.right.val).isEqualTo(2);
        assertThat(treeNode.left.left).isNull();
        assertThat(treeNode.right.left).isNull();
        assertThat(treeNode.left.right).isNull();
        assertThat(treeNode.right.right).isNull();
    }

    public void testArrayToTreeNode_3() {
        TreeNode treeNode = Utils.arrayToTreeNode(0, null, 2, null, 4);

        assertThat(treeNode.val).isEqualTo(0);
        assertThat(treeNode.left).isNull();
        assertThat(treeNode.right).isNotNull();
        assertThat(treeNode.right.val).isEqualTo(2);
        assertThat(treeNode.right.left).isNull();
        assertThat(treeNode.right.right).isNotNull();
        assertThat(treeNode.right.right.val).isEqualTo(4);
    }

    public void testArrayToTreeNode_4() {
        TreeNode treeNode = Utils.arrayToTreeNode(0, 1, null, null, 2);

        assertThat(treeNode.val).isEqualTo(0);
        assertThat(treeNode.left).isNotNull();
        assertThat(treeNode.right).isNull();
        assertThat(treeNode.left.val).isEqualTo(1);
        assertThat(treeNode.left.left).isNull();
        assertThat(treeNode.left.right).isNotNull();
        assertThat(treeNode.left.right.val).isEqualTo(2);
    }

    public void testArrayToTreeNode_5() {
        TreeNode treeNode = Utils.arrayToTreeNode(0, 1, null, null, 2, null, 3, null, 4, 5);

        assertThat(treeNode.left.right.right.right.left.val).isEqualTo(5);
    }
}