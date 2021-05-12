package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 417,
        title = "Pacific Atlantic Water Flow",
        url = "https://leetcode.com/problems/pacific-atlantic-water-flow/"
)
public class PacificAtlanticWaterFlowSolution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        for (int i = 0; i < n; i++) {
            dfs(heights, pacific, 0, i, 0);
            dfs(heights, atlantic, m - 1, i, 0);
        }
        for (int i = 1; i < m; i++) {
            dfs(heights, pacific, i, 0, 0);
            dfs(heights, atlantic, i - 1, n - 1, 0);
        }
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j])
                    result.add(Arrays.asList(i, j));
            }
        }
        return result;
    }

    private void dfs(int[][] heights, boolean[][] marks, int r, int c, int height) {
        if (r < 0 || r >= heights.length
                || c < 0 || c >= heights[0].length
                || marks[r][c]
                || heights[r][c] < height)
            return;
        marks[r][c] = true;
        int curr = heights[r][c];
        dfs(heights, marks, r - 1, c, curr);
        dfs(heights, marks, r + 1, c, curr);
        dfs(heights, marks, r, c - 1, curr);
        dfs(heights, marks, r, c + 1, curr);
    }
}
