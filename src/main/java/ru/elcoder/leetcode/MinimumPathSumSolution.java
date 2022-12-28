package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 64,
        title = "Minimum Path Sum",
        url = "https://leetcode.com/problems/minimum-path-sum/"
)
public class MinimumPathSumSolution {
    public int minPathSum(int[][] grid) {
        Map<Integer, Integer> memo = new HashMap<>();
        return minPath(grid, 0, 0, memo);
    }

    private int minPath(int[][] grid, int x, int y, Map<Integer, Integer> memo) {
        int key = x + y * grid[0].length;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        if (x == (grid[0].length - 1) && y == (grid.length - 1)) {
            memo.put(key, grid[y][x]);
            return grid[y][x];
        }
        int min = Integer.MAX_VALUE;
        if (x < (grid[0].length - 1)) {
            min = Math.min(min, minPath(grid, x + 1, y, memo));
        }
        if (y < (grid.length - 1)) {
            min = Math.min(min, minPath(grid, x, y + 1, memo));
        }
        memo.put(key, grid[y][x] + min);
        return grid[y][x] + min;
    }
}
