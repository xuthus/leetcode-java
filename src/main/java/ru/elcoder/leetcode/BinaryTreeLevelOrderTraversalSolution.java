package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 102,
        title = "Binary Tree Level Order Traversal",
        url = "https://leetcode.com/problems/binary-tree-level-order-traversal/"
)
public class BinaryTreeLevelOrderTraversalSolution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        List<TreeNode> nodes = new LinkedList<>();
        if (root != null)
            nodes.add(root);
        while (!nodes.isEmpty()) {
            result.add(nodes.stream().map(n -> n.val).collect(Collectors.toList()));
            nodes = getChildNodes(nodes);
        }
        return result;
    }

    private List<TreeNode> getChildNodes(List<TreeNode> nodes) {
        List<TreeNode> result = new LinkedList<>();
        for (TreeNode node : nodes) {
            if (node.left != null)
                result.add(node.left);
            if (node.right != null)
                result.add(node.right);
        }
        return result;
    }
}
