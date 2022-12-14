package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 199,
        title = "Binary Tree Right Side View",
        url = "https://leetcode.com/problems/binary-tree-right-side-view/"
)
public class BinaryTreeRightSideViewSolution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> levels = new HashSet<>();
        dfs(root, 0, levels, res);
        return res;
    }

    private void dfs(TreeNode node, int level, Set<Integer> levels, List<Integer> res) {
        if (node == null) {
            return;
        }
        if (!levels.contains(level)) {
            levels.add(level);
            res.add(node.val);
        }
        dfs(node.right, level + 1, levels, res);
        dfs(node.left, level + 1, levels, res);
    }
}
