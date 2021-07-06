package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidSudokuSolutionTest {

    @Test
    public void isValidSudoku() {
        final ValidSudokuSolution solution = new ValidSudokuSolution();
        assertTrue(solution.isValidSudoku(new char[][]{
                "53..7....".toCharArray(),
                "6..195...".toCharArray(),
                ".98....6.".toCharArray(),
                "8...6...3".toCharArray(),
                "4..8.3..1".toCharArray(),
                "7...2...6".toCharArray(),
                ".6....28.".toCharArray(),
                "...419..5".toCharArray(),
                "....8..79".toCharArray()
        }));
    }
}
