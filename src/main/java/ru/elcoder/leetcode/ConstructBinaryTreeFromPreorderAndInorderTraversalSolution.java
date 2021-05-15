package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 105,
        title = "Construct Binary Tree from Preorder and Inorder Traversal",
        url = "https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/"
)
public class ConstructBinaryTreeFromPreorderAndInorderTraversalSolution {
    int pos = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0)
            return null;
        Map<Integer, Integer> positions = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            positions.put(inorder[i], i);
        }
        return buildSubtree(preorder, 0, preorder.length - 1, positions);
    }

    private TreeNode buildSubtree(int[] preorder, int from, int to, Map<Integer, Integer> positions) {
        if (from > to)
            return null;
        final TreeNode root = new TreeNode(preorder[pos++]);
        root.left = buildSubtree(preorder, from, positions.get(root.val) - 1, positions);
        root.right = buildSubtree(preorder, positions.get(root.val) + 1, to, positions);
        return root;
    }
}
