package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

import java.util.function.Consumer;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 1038,
        title = "Binary Search Tree to Greater Sum Tree",
        url = "https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/"
)
public class BinarySearchTreeToGreaterSumTreeSolution {

    public TreeNode bstToGst(TreeNode root) {
        traverse(root, new Consumer<TreeNode>() {
            int prevSum;

            @Override
            public void accept(TreeNode n) {
                int tmp = n.val;
                n.val += prevSum;
                prevSum += tmp;
            }
        });
        return root;
    }

    void traverse(TreeNode node, Consumer<TreeNode> nodeConsumer) {
        if (node == null) {
            return;
        }
        traverse(node.right, nodeConsumer);
        nodeConsumer.accept(node);
        traverse(node.left, nodeConsumer);
    }
}
