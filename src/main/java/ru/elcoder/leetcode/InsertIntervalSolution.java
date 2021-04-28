package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.ArrayList;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 57,
        title = "Insert Interval",
        url = "https://leetcode.com/problems/insert-interval/"
)
public class InsertIntervalSolution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>(intervals.length + 1);
        int pos = 0;
        while (pos < intervals.length && intervals[pos][1] < newInterval[0]) {
            result.add(intervals[pos]);
            pos++;
        }
        while (pos < intervals.length && intervals[pos][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[pos][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[pos][1]);
            pos++;
        }
        result.add(newInterval);
        while (pos < intervals.length) {
            result.add(intervals[pos]);
            pos++;
        }
        return result.toArray(new int[result.size()][]);
    }
}
