package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 1905,
        title = "Count Sub Islands",
        url = "https://leetcode.com/problems/count-sub-islands/"
)
public class CountSubIslandsSolution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        mark(grid1);
        mark(grid2);
        Map<Integer, Set<Integer>> colors = new HashMap<>();
        for (int r = 0; r < grid2.length; r++)
            for (int c = 0; c < grid2[0].length; c++) {
                int color = grid2[r][c];
                if (color > 1) { // island!
                    colors.computeIfAbsent(color, clr -> new HashSet<>()).add(grid1[r][c]);
                }
            }
        int res = 0;
        for (Set<Integer> c : colors.values()) {
            if (c.size() == 1 && c.iterator().next() > 1)
                res++;
        }
        return res;
    }

    void mark(int[][] grid) {
        int color = 1;
        for (int r = 0; r < grid.length; r++)
            for (int c = 0; c < grid[0].length; c++)
                if (grid[r][c] == 1) {
                    color++;
                    mark(grid, c, r, color);
                }
    }

    void mark(int[][] grid, int x, int y, int color) {
        if (x < 0 || x >= grid[0].length || y < 0 || y >= grid.length || grid[y][x] != 1)
            return;
        grid[y][x] = color;
        mark(grid, x - 1, y, color);
        mark(grid, x + 1, y, color);
        mark(grid, x, y - 1, color);
        mark(grid, x, y + 1, color);
    }
}
