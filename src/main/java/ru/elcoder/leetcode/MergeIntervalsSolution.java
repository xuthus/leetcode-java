package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;
import java.util.Comparator;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 56,
        title = "Merge Intervals",
        url = "https://leetcode.com/problems/merge-intervals/"
)
public class MergeIntervalsSolution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int cnt = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i] == null) { // already merged
                continue;
            }
            cnt++;
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[j] == null) { // already merged
                    continue;
                }
                if (mergeIntervals(intervals[i], intervals[j])) {
                    intervals[j] = null;
                } else {
                    break;  // i-th item finished
                }
            }
        }
        int[][] result = new int[cnt][];
        cnt = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i] != null) {
                result[cnt++] = intervals[i];
            }
        }
        return result;
    }

    private boolean mergeIntervals(int[] i1, int[] i2) {
        if (i2[0] - i1[1] > 0) {
            return false;
        }
        i1[1] = Math.max(i1[1], i2[1]);
        return true;
    }
}
