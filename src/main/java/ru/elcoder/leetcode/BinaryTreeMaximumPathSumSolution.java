package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 124,
        title = "Binary Tree Maximum Path Sum",
        url = "https://leetcode.com/problems/binary-tree-maximum-path-sum/"
)
public class BinaryTreeMaximumPathSumSolution {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        max = -2000;
        maxPathSumInternal(root);
        return max;
    }

    public int maxPathSumInternal(TreeNode root) {
        if (root == null)
            return -2000;
        int leftMax = maxPathSumInternal(root.left);
        int rightMax = maxPathSumInternal(root.right);
        int curr = max(
                leftMax,
                rightMax,
                leftMax + root.val,
                rightMax + root.val,
                rightMax + root.val + leftMax,
                root.val
        );
        if (curr > max)
            max = curr;
        return max(
                leftMax + root.val,
                rightMax + root.val,
                root.val
        );
    }

    private int max(int... numbers) {
        int res = -2000;
        for (int number : numbers)
            if (number > res)
                res = number;
        return res;
    }

}
