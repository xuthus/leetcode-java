package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 226,
        title = "Invert Binary Tree",
        url = "https://leetcode.com/problems/invert-binary-tree/"
)
public class InvertBinaryTreeSolution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        TreeNode stash = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = stash;
        return root;
    }
}
