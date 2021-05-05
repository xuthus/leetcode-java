package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class MeetingRoomsIISolutionTest {

    @Test
    public void minMeetingRooms() {
        final MeetingRoomsIISolution solution = new MeetingRoomsIISolution();
        assertEquals(2, solution.minMeetingRooms(new int[][]{
                arrayOf(0, 30),
                arrayOf(5, 10),
                arrayOf(20, 23)
        }));
        assertEquals(1, solution.minMeetingRooms(new int[][]{
                arrayOf(0, 3),
                arrayOf(5, 10),
                arrayOf(20, 23)
        }));
        assertEquals(3, solution.minMeetingRooms(new int[][]{
                arrayOf(0, 30),
                arrayOf(5, 10),
                arrayOf(8, 23)
        }));
    }
}
