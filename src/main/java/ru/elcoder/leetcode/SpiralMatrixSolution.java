package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.ArrayList;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 54,
        title = "Spiral Matrix",
        url = "https://leetcode.com/problems/spiral-matrix/"
)
public class SpiralMatrixSolution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>(matrix.length * matrix[0].length);
        int min = Math.min(matrix.length, matrix[0].length);
        for (int i = 0; i < (min + 1) >> 1; i++) {
            for (int x = i; x < matrix[0].length - i; x++)
                result.add(matrix[i][x]);
            for (int y = i + 1; y < matrix.length - i; y++)
                result.add(matrix[y][matrix[0].length - 1 - i]);
            if (i != matrix.length - 1 - i)
                for (int x = i + 1; x < matrix[0].length - i; x++)
                    result.add(matrix[matrix.length - 1 - i][matrix[0].length - 1 - x]);
            if (matrix[0].length - 1 - i != i)
                for (int y = matrix.length - 1 - i - 1; y > i; y--)
                    result.add(matrix[y][i]);
        }
        return result;
    }
}
