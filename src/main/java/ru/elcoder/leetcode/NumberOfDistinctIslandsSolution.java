package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.ArrayList;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 694,
        title = "Number of Distinct Islands",
        url = "https://leetcode.com/problems/number-of-distinct-islands/"
)
public class NumberOfDistinctIslandsSolution {
    public int numDistinctIslands(int[][] grid) {
        // find all islands
        // normalize them by first point
        // sort array by coordinates of first point
        // count distinct islands

        // find all islands
        List<List<int[]>> islands = new ArrayList<>();
        for (int y = 0; y < grid.length; y++)
            for (int x = 0; x < grid[0].length; x++)
                if (grid[y][x] == 1) {
                    List<int[]> island = new ArrayList<>();
                    floodfill(grid, y, x, island);
                    // normalize island by first point
                    int dx = island.get(0)[0];
                    int dy = island.get(0)[1];
                    for (int i = 0; i < island.size(); i++) {
                        int[] point = island.get(i);
                        point[0] -= dx;
                        point[1] -= dy;
                    }
                    islands.add(island);
                }
        // sort array by coordinates of first point
        islands.sort(this::compareIslands);
        // count distinct islands
        int res = islands.isEmpty() ? 0 : 1;
        for (int i = 0; i < islands.size() - 1; i++) {
            if (compareIslands(islands.get(i), islands.get(i + 1)) != 0)
                res++;
        }
        return res;
    }

    int compareIslands(List<int[]> i1, List<int[]> i2) {
        if (i1.size() != i2.size())
            return i1.size() - i2.size();
        for (int i = 0; i < i1.size(); i++) {
            int d = i1.get(i)[0] - i2.get(i)[0];
            if (d == 0)
                d = i1.get(i)[1] - i2.get(i)[1];
            if (d != 0)
                return d;
        }
        return 0;
    }

    void floodfill(int[][] grid, int y, int x, List<int[]> island) {
        if (x < 0 || x >= grid[0].length || y < 0 || y >= grid.length || grid[y][x] != 1)
            return;
        grid[y][x] = 2;
        island.add(new int[]{x, y});
        floodfill(grid, y + 1, x, island);
        floodfill(grid, y - 1, x, island);
        floodfill(grid, y, x + 1, island);
        floodfill(grid, y, x - 1, island);
    }
}
