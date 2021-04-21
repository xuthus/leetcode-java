package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 572,
        title = "Subtree of Another Tree",
        url = "https://leetcode.com/problems/subtree-of-another-tree/"
)
public class SubtreeOfAnotherTreeSolution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return isIdentical(s, t)
                || s != null && isSubtree(s.left, t)
                || s != null && isSubtree(s.right, t);
    }

    public boolean isIdentical(TreeNode s, TreeNode t) {
        if (t == s) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        return s.val == t.val && isIdentical(s.left, t.left) && isIdentical(s.right, t.right);
    }
}
