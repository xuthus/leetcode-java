package ru.elcoder.leetcode.models;

/**
 * for the problems:
 * - 100. Same Tree
 */
public class TreeNode {
    public int val;

    public TreeNode left;

    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TreeNode)) {
            return false;
        }
        return equalNodes(this, (TreeNode) obj);
    }

    public static boolean equalNodes(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null || p.val != q.val)
            return false;
        return equalNodes(p.left, q.left) && equalNodes(p.right, q.right);
    }
}