package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * not a leetcode problem, just implementation of BFS
 */
public class BreadthFirstSearchSolution {
    public int sumTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int sum = 0;
        while (!queue.isEmpty()) {
            final TreeNode node = queue.poll();
            if (node != null) {
                sum += node.val;
                System.out.println(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return sum;
    }
}
