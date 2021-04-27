package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 48,
        title = "Rotate Matrix",
        url = "https://leetcode.com/problems/rotate-image/"
)
public class RotateMatrixSolution {
    public void rotate(int[][] matrix) {
        rotate(matrix, 0);
    }

    public void rotate(int[][] matrix, int d) {
        if (matrix.length >> 1 <= d)
            return;
        int len = matrix.length - d;
        for (int i = d; i < len - 1; i++) {
            int t = matrix[d][i];
            matrix[d][i] = matrix[matrix.length - 1 - i][d];
            matrix[matrix.length - 1 - i][d] = matrix[len - 1][matrix.length - 1 - i];
            matrix[len - 1][matrix.length - 1 - i] = matrix[i][len - 1];
            matrix[i][len - 1] = t;
        }
        rotate(matrix, d + 1);
    }

}
