package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 841,
        title = "Keys and Rooms",
        url = "https://leetcode.com/problems/keys-and-rooms/"
)
public class KeysAndRoomsSolution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        while (!queue.isEmpty()) {
            Integer room = queue.poll();
            visited[room] = true;
            for (Integer key : rooms.get(room)) {
                if (!visited[key]) {
                    queue.offer(key);
                }
            }
        }
        for (boolean v : visited) {
            if (!v) {
                return false;
            }
        }
        return true;
    }
}
