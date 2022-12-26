package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 606,
        title = "Construct String from Binary Tree",
        url = "https://leetcode.com/problems/construct-string-from-binary-tree/"
)
public class ConstructStringFromBinaryTreeSolution {
    public String tree2str(TreeNode root) {
        if (root == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);
        return sb.toString();
    }

    private void dfs(TreeNode node, StringBuilder sb) {
        if (node == null) {
            return;
        }
        sb.append(node.val);
        if (node.left != null || node.right != null) {
            sb.append('(');
            dfs(node.left, sb);
            sb.append(')');
        }
        if (node.right != null) {
            sb.append('(');
            dfs(node.right, sb);
            sb.append(')');
        }
    }
}
