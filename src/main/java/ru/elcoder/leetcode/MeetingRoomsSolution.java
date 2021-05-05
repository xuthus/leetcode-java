package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;
import java.util.Comparator;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 252,
        title = "Meeting Rooms",
        url = "https://leetcode.com/problems/meeting-rooms/"
)
public class MeetingRoomsSolution {
    public boolean canAttendMeetings(int[][] intervals) {
        if (intervals.length < 2)
            return true;
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        for (int i = 0; i < intervals.length - 1; i++)
            if (intervals[i][1] > intervals[i + 1][0])
                return false;
        return true;
    }
}
