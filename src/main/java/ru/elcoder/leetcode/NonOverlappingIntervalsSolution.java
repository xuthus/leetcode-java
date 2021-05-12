package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;
import java.util.Comparator;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 435,
        title = "Non-overlapping Intervals",
        url = "https://leetcode.com/problems/non-overlapping-intervals/"
)
public class NonOverlappingIntervalsSolution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        int i = 0;
        int count = 0;
        while (i < intervals.length - 1) {
            if (overlaps(intervals[i], intervals[i + 1])) {
                count++;
                if (intervals[i + 1][1] > intervals[i][1])
                    intervals[i + 1] = intervals[i];
            }
            i++;
        }
        return count;
    }

    private boolean overlaps(int[] i1, int[] i2) {
        return i1[0] < i2[1] && i2[0] < i1[1];
    }
}
