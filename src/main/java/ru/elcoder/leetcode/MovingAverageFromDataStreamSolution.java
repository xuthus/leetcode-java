package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.LinkedList;
import java.util.Queue;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 346,
        title = "Moving Average from Data Stream",
        url = "https://leetcode.com/problems/moving-average-from-data-stream/"
)
public class MovingAverageFromDataStreamSolution {
    static class MovingAverage {

        Queue<Integer> queue;
        int sum = 0;
        int size;

        /** Initialize your data structure here. */
        public MovingAverage(int size) {
            this.size = size;
            this.queue = new LinkedList<>();
        }

        public double next(int val) {
            sum += val;
            if (queue.size() == size)
                sum -= queue.poll();
            queue.offer(val);
            return sum * 1.0 / queue.size();
        }
    }
}
