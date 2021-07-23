package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 814,
        title = "Binary Tree Pruning",
        url = "https://leetcode.com/problems/binary-tree-pruning/"
)
public class BinaryTreePruningSolution {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null)
            return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if (root.left != null || root.right != null || root.val == 1)
            return root;
        return null;
    }
}
