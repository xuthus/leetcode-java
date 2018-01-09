package ru.elcoder.leetcode.models;

public class BalancedTree {
    CountableNode root;

    public void add(long x) {
        if (root == null)
            root = new CountableNode(x);
        else {
            root.add(x);
            root = root.balanceTree();
        }
    }

    public void remove(long x) {
        root.remove(x);
    }

    public int countLessThan(long x) {
        return root.countLessThan(x);
    }
}
