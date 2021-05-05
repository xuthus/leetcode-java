package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 200,
        title = "Number of Islands",
        url = "https://leetcode.com/problems/number-of-islands/"
)
public class NumberOfIslandsSolution {
    public int numIslands(char[][] grid) {
        int result = 0;
        if (grid.length > 0 && grid[0].length > 0)
            for (int r = 0; r < grid.length; r++)
                for (int c = 0; c < grid[0].length; c++)
                    if (grid[r][c] == '1') {
                        result++;
                        grid[r][c] = '2';
                        dfs(grid, r - 1, c);
                        dfs(grid, r + 1, c);
                        dfs(grid, r, c + 1);
                        dfs(grid, r, c - 1);
                    }
        return result;
    }

    private void dfs(char[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] != '1')
            return;
        grid[r][c] = '2';
        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }
}
