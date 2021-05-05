package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 253,
        title = "Meeting Rooms II",
        url = "https://leetcode.com/problems/meeting-rooms-ii/"
)
public class MeetingRoomsIISolution {
    public int minMeetingRooms(int[][] intervals) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(Integer.MIN_VALUE);
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        for (int[] meet : intervals) {
            Integer room = q.peek();
            if (room <= meet[0])
                q.poll();
            q.add(meet[1]);
        }
        return q.size();
    }
}
