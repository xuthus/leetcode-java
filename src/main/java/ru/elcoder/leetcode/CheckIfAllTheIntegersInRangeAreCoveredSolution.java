package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1893,
        title = "Check if All the Integers in a Range Are Covered",
        url = "https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered/"
)
public class CheckIfAllTheIntegersInRangeAreCoveredSolution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int count = right - left + 1;
        boolean[] mark = new boolean[count];
        for (int[] range : ranges) {
            int i0 = Math.max(range[0], left);
            int i1 = Math.min(right, range[1]);
            for (int i = i0; i <= i1; i++)
                if (!mark[i - left]) {
                    mark[i - left] = true;
                    count--;
                }
        }
        return count == 0;
    }
}
