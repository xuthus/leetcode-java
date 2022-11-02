package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

import java.util.Arrays;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 662,
        title = "Maximum Width of Binary Tree",
        url = "https://leetcode.com/problems/maximum-width-of-binary-tree/"
)
public class MaximumWidthOfBinaryTreeSolution {

    int maxLevel = 1;

    public int widthOfBinaryTree(TreeNode root) {
        long[] mins = new long[3001];
        Arrays.fill(mins, Long.MAX_VALUE);
        long[] maxs = new long[3001];
        Arrays.fill(maxs, Long.MIN_VALUE);
        dfs(1, root, 0, mins, maxs);
        int res = 1;
        for (int i = 1; i <= maxLevel; i++) {
            long width = maxs[i] - mins[i] + 1;
            if (width > res) {
                res = (int) width;
            }
        }
        return res;
    }

    private void dfs(int level, TreeNode root, long pos, long[] mins, long[] maxs) {
        if (mins[level] > pos) {
            mins[level] = pos;
        }
        if (maxs[level] < pos) {
            maxs[level] = pos;
        }
        maxLevel = Math.max(maxLevel, level);
        if (root.left != null)
            dfs(level + 1, root.left, pos * 2, mins, maxs);
        if (root.right != null)
            dfs(level + 1, root.right, (pos * 2) + 1, mins, maxs);
    }
}
