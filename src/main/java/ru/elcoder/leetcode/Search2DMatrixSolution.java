package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 74,
        title = "Search a 2D Matrix",
        url = "https://leetcode.com/problems/search-a-2d-matrix/"
)
public class Search2DMatrixSolution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // just binary search on array from whole matrix
        int h = matrix.length;
        int w = matrix[0].length;
        if (h * w == 1)
            return matrix[0][0] == target;
        int left = 0, right = h * w - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            int y = mid / w;
            int x = mid % w;
            if (matrix[y][x] == target)
                return true;
            else if (matrix[y][x] > target)
                right = mid - 1;
            else {
                left = mid + 1;
            }
        }
        return false;
    }
}
