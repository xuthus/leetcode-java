package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 112,
        title = "Path Sum",
        url = "https://leetcode.com/problems/path-sum/"
)
public class PathSumSolution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return root != null && hasPathSumSubNode(root, targetSum);
    }

    public boolean hasPathSumSubNode(TreeNode root, int targetSum) {
        if (root == null)
            return targetSum == 0;
        return hasPathSumSubNode(root.left, targetSum - root.val) || hasPathSumSubNode(root.right, targetSum - root.val);
    }
}
