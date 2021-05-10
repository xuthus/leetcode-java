package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

import java.util.LinkedList;
import java.util.ListIterator;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 236,
        title = "Lowest Common Ancestor of a Binary Tree",
        url = "https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/"
)
public class LowestCommonAncestorOfBinaryTreeSolution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        LinkedList<TreeNode> path = new LinkedList<>();
        LinkedList<TreeNode> other = new LinkedList<>();
        return dfs(root, p, q, path, other);
    }

    private TreeNode dfs(TreeNode node, TreeNode p, TreeNode q, LinkedList<TreeNode> path, LinkedList<TreeNode> other) {
        path.add(node);
        if (node == p || node == q)
            if (other.isEmpty())
                other.addAll(path);
            else
                return lca(path, other);
        if (node.left != null) {
            TreeNode lca = dfs(node.left, p, q, path, other);
            if (lca != null)
                return lca;
        }
        if (node.right != null) {
            TreeNode lca = dfs(node.right, p, q, path, other);
            if (lca != null)
                return lca;
        }
        path.removeLast();
        return null;
    }

    private TreeNode lca(LinkedList<TreeNode> p1, LinkedList<TreeNode> p2) {
        ListIterator<TreeNode> i1 = p1.listIterator();
        ListIterator<TreeNode> i2 = p2.listIterator();
        TreeNode result = null;
        while (i1.hasNext() && i2.hasNext()) {
            if (i1.next() != i2.next())
                break;
            result = i1.previous();
            i1.next();
        }
        return result;
    }
}
