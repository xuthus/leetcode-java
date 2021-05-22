package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 653,
        title = "Two Sum IV - Input is a BST",
        url = "https://leetcode.com/problems/two-sum-iv-input-is-a-bst/"
)
public class TwoSumIVInputIsBSTSolution {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null)
            return false;
        Set<Integer> nums = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (nums.contains(k - node.val))
                return true;
            nums.add(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        return false;
    }
}
