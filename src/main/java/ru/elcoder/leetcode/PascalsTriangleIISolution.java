package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 119,
        title = "Pascal's Triangle II",
        url = "https://leetcode.com/problems/pascals-triangle-ii/"
)
public class PascalsTriangleIISolution {
    public List<Integer> getRow(int rowIndex) {
        int[] memo = new int[34 * 34];
        Integer[] res = new Integer[rowIndex + 1];
        res[0] = 1;
        res[rowIndex] = 1;
        for (int i = 1; i < rowIndex; i++)
            res[i] = pascal(rowIndex, i, memo);
        return Arrays.asList(res);
    }

    int pascal(int r, int c, int[] memo) {
        if (c == 0 || c == r || r < 2)
            return 1;
        int key = r * 33 + c;
        if (memo[key] == 0)
            memo[key] = pascal(r - 1, c - 1, memo) + pascal(r - 1, c, memo);
        return memo[key];
    }

}
