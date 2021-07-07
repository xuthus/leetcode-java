package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 168,
        title = "Excel Sheet Column Title",
        url = "https://leetcode.com/problems/excel-sheet-column-title/"
)
public class ExcelSheetColumnTitleSolution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            char digit = (char) ('A' + (columnNumber - 1) % 26);
            sb.append(digit);
            columnNumber = (columnNumber - 1) / 26;
        }
        return sb.reverse().toString();
    }
}
