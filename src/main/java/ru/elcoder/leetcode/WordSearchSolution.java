package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 79,
        title = "Word Search",
        url = "https://leetcode.com/problems/word-search/"
)
public class WordSearchSolution {
    public boolean exist(char[][] board, String word) {
        int boardSize = board.length * board[0].length;
        if (word.length() == 0)
            return true;
        if (boardSize < word.length())
            return false;
        boolean[][] marks = new boolean[board.length][board[0].length];
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == word.charAt(0)) {
                    if (checkWord(board, r, c, word, 0, marks))
                        return true;
                }
            }
        }
        return false;
    }

    private boolean checkWord(char[][] board, int r, int c, String word, int pos, boolean[][] marks) {
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || marks[r][c] || board[r][c] != word.charAt(pos))
            return false;
        if (pos == word.length() - 1) {
            return true;
        }
        marks[r][c] = true;
        try {
            return
                    checkWord(board, r - 1, c, word, pos + 1, marks)
                            || checkWord(board, r, c + 1, word, pos + 1, marks)
                            || checkWord(board, r + 1, c, word, pos + 1, marks)
                            || checkWord(board, r, c - 1, word, pos + 1, marks);
        } finally {
            marks[r][c] = false;
        }
    }
}
