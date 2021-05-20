package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 118,
        title = "Pascal's Triangle",
        url = "https://leetcode.com/problems/pascals-triangle/"
)
public class PascalsTriangleSolution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            Integer[] row = new Integer[i+1];
            row[0] = 1;
            row[i] = 1;
            if (i > 1) {
                List<Integer> prev = res.get(i - 1);
                for (int j = 1; j < i; j++)
                    row[j] = prev.get(j) + prev.get(j - 1);
            }
            res.add(Arrays.asList(row));
        }
        return res;
    }
}
