package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 230,
        title = "Kth Smallest Element in a BST",
        url = "https://leetcode.com/problems/kth-smallest-element-in-a-bst/"
)
public class KthSmallestElementInBSTSolution {
    public int kthSmallest(TreeNode root, int k) {
        return inorder(root, new int[]{k});
    }

    private int inorder(TreeNode node, int[] k) {
        if (node.left != null) {
            int kth = inorder(node.left, k);
            if (k[0] == 0)
                return kth;
        }
        k[0]--;
        if (k[0] == 0) {
            return node.val;
        }
        if (node.right != null) {
            return inorder(node.right, k);
        }
        return 0;
    }
}
