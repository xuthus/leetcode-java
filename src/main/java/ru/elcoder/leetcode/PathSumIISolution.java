package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 113,
        title = "Path Sum II",
        url = "https://leetcode.com/problems/path-sum-ii/"
)
public class PathSumIISolution {
    private final LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        final ArrayList<List<Integer>> result = new ArrayList<>();
        depthSearch(root, targetSum, result);
        return result;
    }

    private void depthSearch(TreeNode root, int targetSum, ArrayList<List<Integer>> result) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            if (root.val == targetSum) {
                path.addLast(root.val);
                result.add(new ArrayList<>(path));
                path.removeLast();
            }
            return;
        }
        path.addLast(root.val);
        depthSearch(root.left, targetSum - root.val, result);
        depthSearch(root.right, targetSum - root.val, result);
        path.removeLast();
    }
}
