package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 938,
        title = "Range Sum of BST",
        url = "https://leetcode.com/problems/range-sum-of-bst/"
)
public class RangeSumOfBSTSolution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int result = 0;
        if (root != null) {
            if (root.val >= low && root.val <= high) {
                result = root.val;
            }
            if (root.val > low)
                result += rangeSumBST(root.left, low, high);
            if (root.val < high)
                result += rangeSumBST(root.right, low, high);
        }
        return result;
    }
}
