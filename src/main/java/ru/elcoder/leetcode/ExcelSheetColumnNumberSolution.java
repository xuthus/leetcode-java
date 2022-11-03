package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 171,
        title = "Excel Sheet Column Number",
        url = "https://leetcode.com/problems/excel-sheet-column-number/"
)
public class ExcelSheetColumnNumberSolution {
    public int titleToNumber(String columnTitle) {
        int length = columnTitle.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            char c = columnTitle.charAt(i);
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }
}
