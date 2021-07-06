package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 36,
        title = "Valid Sudoku",
        url = "https://leetcode.com/problems/valid-sudoku/"
)
public class ValidSudokuSolution {
    public boolean isValidSudoku(char[][] board) {
        for (int r = 0; r < 9; r++) {
            boolean[] flag = new boolean[10];
            for (int x = 0; x < 9; x++) {
                if (board[r][x] == '.') continue;
                int digit = board[r][x] - '0';
                if (flag[digit])
                    return false;
                flag[digit] = true;
            }
        }
        for (int c = 0; c < 9; c++) {
            boolean[] flag = new boolean[10];
            for (int y = 0; y < 9; y++) {
                if (board[y][c] == '.') continue;
                int digit = board[y][c] - '0';
                if (flag[digit])
                    return false;
                flag[digit] = true;
            }
        }
        for (int y = 0; y < 9; y += 3) {
            for (int x = 0; x < 9; x += 3) {
                boolean[] flag = new boolean[10];
                for (int r = y; r < y + 3; r++)
                    for (int c = x; c < x + 3; c++) {
                        if (board[r][c] == '.') continue;
                        int digit = board[r][c] - '0';
                        if (flag[digit])
                            return false;
                        flag[digit] = true;
                    }
            }
        }
        return true;
    }
}
