package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 98,
        title = "Validate Binary Search Tree",
        url = "https://leetcode.com/problems/validate-binary-search-tree/"
)
public class ValidateBinarySearchTreeSolution {
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        return isValidBSTLimits(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidBSTLimits(TreeNode root, long min, long max) {
        if (root.val > max || root.val < min)
            return false;
        if (root.left != null) {
            if (!isValidBSTLimits(root.left, min, ((long) root.val) - 1))
                return false;
        }
        if (root.right != null) {
            if (!isValidBSTLimits(root.right, ((long) root.val) + 1, max))
                return false;
        }
        return true;
    }
}
