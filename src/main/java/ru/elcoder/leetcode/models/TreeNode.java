package ru.elcoder.leetcode.models;

/**
 * Created by xuthus on 13.05.2017.
 */
public class TreeNode {
    private TreeNode lt;     // contains nodes with values smaller than this node value
    private TreeNode gt;     // contains nodes with values greater than or equal to this node value
    private int value;       // node value. This BST realization can contain duplicates
    private int childCount;  // incremented each time when child node inserted

    public TreeNode(int value) {
        this.value = value;
    }

    // replaced with insertIterative, but without time improvements
    public void insert(int value) {
        this.childCount++;
        if (value < this.value) {
            if (lt == null)
                lt = new TreeNode(value);
            else
                lt.insert(value);
        } else {
            if (gt == null)
                gt = new TreeNode(value);
            else
                gt.insert(value);
        }
    }

    // no difference with recursive variant
    public void insertIterative(int value) {
        TreeNode parent = this;
        while (true) {
            parent.childCount++;
            if (value < parent.value) {
                if (parent.lt == null) {
                    parent.lt = new TreeNode(value);
                    return;
                } else
                    parent = parent.lt;
            } else {
                if (parent.gt == null) {
                    parent.gt = new TreeNode(value);
                    return;
                } else
                    parent = parent.gt;
            }
        }
    }

    public int countSmallerThan(int x) {
        int count = 0;
        if (x > value) {
            // all left nodes are smaller
            count = lt == null ? 0 : lt.childCount + 1;
            // right nodes can be either smaller or greater
            count += gt == null ? 0 : gt.countSmallerThan(x);
            count++;
        } else {
            // left nodes can be either smaller or greater
            count += lt == null ? 0 : lt.countSmallerThan(x);
            // all right nodes are greater
        }
        return count;
    }
}
