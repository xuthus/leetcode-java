package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

import java.util.LinkedList;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 366,
        title = "Find Leaves of Binary Tree",
        url = "https://leetcode.com/problems/find-leaves-of-binary-tree/"
)
public class FindLeavesOfBinaryTreeSolution {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        while (true) {
            List<Integer> leaves = new LinkedList<>();
            if (dfs(root, leaves)) {
                root = null;
            }
            if (leaves.isEmpty()) {
                break;
            }
            res.add(leaves);
        }
        return res;
    }

    private boolean dfs(TreeNode node, List<Integer> leaves) {
        if (node == null) {
            return false;
        }
        if (node.left == null && node.right == null) {
            leaves.add(node.val);
            return true;
        }
        if (dfs(node.left, leaves)) {
            node.left = null;
        }
        if (dfs(node.right, leaves)) {
            node.right = null;
        }
        return false;
    }
}
