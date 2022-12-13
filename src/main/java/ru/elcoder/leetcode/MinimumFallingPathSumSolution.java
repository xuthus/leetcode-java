package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 931,
        title = "Minimum Falling Path Sum",
        url = "https://leetcode.com/problems/minimum-falling-path-sum/description/"
)
public class MinimumFallingPathSumSolution {
    /*
Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.

A falling path starts at any element in the first row and chooses the element in the next row that is either directly below or diagonally left/right. Specifically, the next element from position (row, col) will be (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).
     */
    public int minFallingPathSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        int n = matrix[0].length;
        HashMap<Integer, Integer> memo = new HashMap<>();
        for (int i = 0; i < n; i++) {
            min = Math.min(min, minPath(matrix, 0, i, memo, n));
        }
        return min;
    }

    private int minPath(int[][] matrix, int y, int x, Map<Integer, Integer> memo, int n) {
        if (y == n - 1) {
            return matrix[y][x];
        }
        int key = (y << 8) + x;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int min = Integer.MAX_VALUE;
        for (int dx = -1; dx <= 1; dx++) {
            int nextX = x + dx;
            if (nextX >= 0 && nextX < n) {
                min = Math.min(min, minPath(matrix, y+1, nextX, memo, n));
            }
        }
        min += matrix[y][x];
        memo.put(key, min);
        return min;
    }
}
