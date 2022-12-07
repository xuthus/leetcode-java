package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 988,
        title = "Smallest String Starting From Leaf",
        url = "https://leetcode.com/problems/smallest-string-starting-from-leaf/"
)
public class SmallestStringStartingFromLeafSolution {
    public String smallestFromLeaf(TreeNode root) {
        StringBuilder smallest = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        dfs(root, sb, smallest);
        return smallest.toString();
    }

    private void dfs(TreeNode node, StringBuilder word, StringBuilder smallest) {
        word.insert(0, (char)(node.val + 'a'));
        if (node.left == null && node.right == null) {
            if (smallest.length() == 0 || word.toString().compareTo(smallest.toString()) < 0) {
                smallest.setLength(0);
                smallest.append(word);
            }
        }
        if (node.left != null) {
            dfs(node.left, word, smallest);
            word.delete(0, 1);
        }
        if (node.right != null) {
            dfs(node.right, word, smallest);
            word.delete(0, 1);
        }
    }
}
