package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 111,
        title = "Minimum Depth of Binary Tree",
        url = "https://leetcode.com/problems/minimum-depth-of-binary-tree/"
)
public class MinimumDepthOfBinaryTreeSolution {
    int min;

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        min = Integer.MAX_VALUE;
        dfs(root, 1);
        return min;
    }

    void dfs(TreeNode root, int level) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            min = Math.min(min, level);
            return;
        }
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
}
