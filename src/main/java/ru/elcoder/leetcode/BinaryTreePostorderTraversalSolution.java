package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

import java.util.*;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 145,
        title = "Binary Tree Postorder Traversal",
        url = "https://leetcode.com/problems/binary-tree-postorder-traversal/"
)
public class BinaryTreePostorderTraversalSolution {
    public List<Integer> postorderTraversal_Recursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        visit(root, result);
        return result;
    }

    public List<Integer> postorderTraversal_Iterative(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root != null)
            stack.push(root);
        while (!stack.empty()) {
            TreeNode node = stack.pop();
            result.push(node.val);
            if (node.left != null)
                stack.push(node.left);
            if (node.right != null)
                stack.push(node.right);
        }
        return result;
    }

    private void visit(TreeNode node, List<Integer> ints) {
        if (node == null) {
            return;
        }
        visit(node.left, ints);
        visit(node.right, ints);
        ints.add(node.val);
    }
}
