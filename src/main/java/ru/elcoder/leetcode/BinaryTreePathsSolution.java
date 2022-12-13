package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

import java.util.LinkedList;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 257,
        title = "Binary Tree Paths",
        url = "https://leetcode.com/problems/binary-tree-paths/"
)
public class BinaryTreePathsSolution {
    /*
Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.

Example 1:

Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]

Example 2:

Input: root = [1]
Output: ["1"]

Constraints:
The number of nodes in the tree is in the range [1, 100].
-100 <= Node.val <= 100
     */
    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> res = new LinkedList<>();
        dfs(root, res, new StringBuilder());
        return res;
    }

    private void dfs(TreeNode node, List<String> res, StringBuilder path) {
        if (node == null) {
            return;
        }
        if (path.length() > 0) {
            path.append("->");
        }
        path.append(node.val);
        if (node.left == null && node.right == null) {
            res.add(path.toString());
            return;
        }
        int saveLength = path.length();
        if (node.left != null) {
            dfs(node.left, res, path);
            path.setLength(saveLength);
        }
        if (node.right != null) {
            dfs(node.right, res, path);
            path.setLength(saveLength);
        }
    }
}
