package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 110,
        title = "Balanced Binary Tree",
        url = "https://leetcode.com/problems/balanced-binary-tree/"
)
public class BalancedBinaryTreeSolution {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return 0 <= height(root, 0);
    }

    private int height(TreeNode node, int height) {
        if (node == null)
            return height;
        int left = height(node.left, height + 1);
        int right = height(node.right, height + 1);
        if (Math.abs(left - right) > 1)
            return -1;
        return Math.max(left, right);
    }
}
