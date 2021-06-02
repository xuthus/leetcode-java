package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 695,
        title = "Max Area of Island",
        url = "https://leetcode.com/problems/max-area-of-island/"
)
public class MaxAreaOfIslandSolution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int maxSize = 0;
        for (int r = 0; r < n; r++)
            for (int c = 0; c < m; c++)
                if (grid[r][c] == 1)
                    maxSize = Math.max(maxSize, floodfill(grid, r, c));
        return maxSize;
    }

    int floodfill(int[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != 1)
            return 0;
        grid[r][c] = 2;
        int result = 1;
        result += floodfill(grid, r - 1, c);
        result += floodfill(grid, r + 1, c);
        result += floodfill(grid, r, c - 1);
        result += floodfill(grid, r, c + 1);
        return result;
    }
}
