package ru.elcoder.leetcode.models;

/**
 * Created by xuthus on 13.05.2017.
 */
public class BinarySearchTree {
    private TreeNode1 root;

    public void insert(int value) {
        if (root == null)
            root = new TreeNode1(value);
        else
            root.insertIterative(value);
    }

    public int countLessThan(int x) {
        if (root == null)
            return 0;
        return root.countSmallerThan(x);
    }
}
