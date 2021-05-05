package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class MeetingRoomsSolutionTest {

    @Test
    public void canAttendMeetings() {
        final MeetingRoomsSolution solution = new MeetingRoomsSolution();
        assertTrue(solution.canAttendMeetings(new int[][] {
                arrayOf(10, 15),
                arrayOf(2, 7)
        }));
    }
}
