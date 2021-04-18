package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 73,
        title = "Set Matrix Zeroes",
        url = "https://leetcode.com/problems/set-matrix-zeroes/"
)
public class SetMatrixZeroesSolution {
    // Space(NM)
    public void setZeroesSpaceNM(int[][] matrix) {
        int[] rows = new int[matrix.length];
        int[] cols = new int[matrix[0].length];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == 0) {
                    rows[r] = -1;
                    cols[c] = -1;
                }
            }
        }
        for (int r = 0; r < rows.length; r++) {
            if (rows[r] == -1)
                Arrays.fill(matrix[r], 0);
        }
        for (int c = 0; c < cols.length; c++) {
            if (cols[c] == -1)
                for (int r = 0; r < matrix.length; r++)
                    matrix[r][c] = 0;
        }
    }

    // Space(1)
    public void setZeroesSpace1(int[][] matrix) {
        // the idea: store flags in first row and first column
        // and store flags for 1st row and 1st column in 2 integers (constant space)
        // calculate flags for 1st row and 1st column
        int row0 = -1, col0 = -1;
        for (int num : matrix[0])
            if (num == 0) {
                row0 = 0;
                break;
            }
        for (int[] row : matrix)
            if (row[0] == 0) {
                col0 = 0;
                break;
            }
        // calculate flags for other rows and columns
        for (int r = 1; r < matrix.length; r++)
            for (int c = 1; c < matrix[r].length; c++)
                if (matrix[r][c] == 0) {
                    matrix[r][0] = 0;  // store in 1st column
                    matrix[0][c] = 0;  // store in 1st row
                }
        // set zeroes for rows
        for (int r = 1; r < matrix.length; r++)
            if (matrix[r][0] == 0)
                Arrays.fill(matrix[r], 0);
        // set zeroes for columns
        for (int c = 1; c < matrix[0].length; c++) {
            if (matrix[0][c] == 0)
                for (int r = 0; r < matrix.length; r++)
                    matrix[r][c] = 0;
        }
        // set zeroes for 1st row
        if (row0 == 0)
            Arrays.fill(matrix[0], 0);
        // set zeroes for 1st column
        if (col0 == 0)
            for (int r = 0; r < matrix.length; r++)
                matrix[r][0] = 0;
    }
}
