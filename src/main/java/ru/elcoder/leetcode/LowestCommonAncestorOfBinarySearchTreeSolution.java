package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 235,
        title = "Lowest Common Ancestor of a Binary Search Tree",
        url = "https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/"
)
public class LowestCommonAncestorOfBinarySearchTreeSolution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (true) {
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            } else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            } else {
                return root;
            }
        }
    }

    /*
    solution for any tree
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return findLCA(root, p, q, new LinkedList<>(), new LinkedList<>());
    }

    private TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q, LinkedList<TreeNode> path, LinkedList<TreeNode> first) {
        if (root == null) {
            return null;
        }
        path.addLast(root);
        if (root == p || root == q) {
            if (first.isEmpty()) {
                first.addAll(path);
            } else {
                TreeNode p1 = path.poll();
                TreeNode p2 = null;
                while (p1 == first.poll()) {
                    p2 = p1;
                    p1 = path.poll();
                }
                return p2;
            }
        }
        final TreeNode result = Optional.ofNullable(findLCA(root.left, p, q, path, first))
                .orElseGet(() -> findLCA(root.right, p, q, path, first));
        if (result == null)
            path.removeLast();
        return result;
    }
*/
}
