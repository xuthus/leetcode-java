package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 501,
        title = "Find Mode in Binary Search Tree",
        url = "https://leetcode.com/problems/find-mode-in-binary-search-tree/"
)
public class FindModeInBinarySearchTreeSolution {
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        AtomicInteger max = new AtomicInteger(0);
        HashSet<Integer> modes = new HashSet<>();

        dfs(root, counts, max, modes);

        return modes.stream().mapToInt(v -> v).toArray();
    }

    private void dfs(TreeNode root, Map<Integer, Integer> counts, AtomicInteger max, Set<Integer> modes) {
        if (root == null) {
            return;
        }
        int count = counts.computeIfAbsent(root.val, i -> 0) + 1;
        counts.put(root.val, count);
        if (max.get() < count) {
            max.set(count);
            modes.clear();
        }
        if (max.get() == count) {
            modes.add(root.val);
        }
        dfs(root.left, counts, max, modes);
        dfs(root.right, counts, max, modes);
    }
}
