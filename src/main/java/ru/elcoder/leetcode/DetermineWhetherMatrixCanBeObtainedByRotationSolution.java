package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1886,
        title = "Determine Whether Matrix Can Be Obtained By Rotation",
        url = "https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/"
)
public class DetermineWhetherMatrixCanBeObtainedByRotationSolution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            mat = rotate(mat);
            if (matrixesEqual(mat, target))
                return true;
        }
        return matrixesEqual(mat, target);
    }

    private boolean matrixesEqual(int[][] m1, int[][] m2) {
        if (m1.length != m2.length || m1[0].length != m2[0].length)
            return false;
        for (int i = 0; i < m1.length; i++)
            for (int j = 0; j < m1[0].length; j++)
                if (m1[i][j] != m2[i][j])
                    return false;
        return true;
    }

    private int[][] rotate(int[][] m) {
        int h = m.length;
        int w = m[0].length;
        int[][] res = new int[w][h];
        for (int i = 0; i < w; i++)
            for (int j = 0; j < h; j++)
                res[i][j] = m[j][w - i - 1];
        return res;
    }
}
