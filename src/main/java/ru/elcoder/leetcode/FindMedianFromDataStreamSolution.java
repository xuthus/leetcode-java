package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.PriorityQueue;

@Leetcode(
        difficulty = DifficultyLevel.Hard,
        number = 295,
        title = "Find Median from Data Stream",
        url = "https://leetcode.com/problems/find-median-from-data-stream/"
)
public class FindMedianFromDataStreamSolution {
    public static class MedianFinder {

        private PriorityQueue<Integer> left;
        private PriorityQueue<Integer> right;

        /** initialize your data structure here. */
        public MedianFinder() {
            left = new PriorityQueue<>((i1, i2) -> -Integer.compare(i1, i2));
            right = new PriorityQueue<>(Integer::compare);
        }

        public void addNum(int num) {
            Integer leftNum = left.peek();
            if (leftNum == null || leftNum > num)
                left.add(num);
            else
                right.add(num);
            balance();
        }

        private void balance() {
            while (left.size() > right.size()) {
                int num = left.poll();
                right.offer(num);
            }
            while (right.size() > left.size()) {
                int num = right.poll();
                left.offer(num);
            }
        }

        public double findMedian() {
            if (left.size() > right.size())
                return left.peek();
            if (left.size() < right.size())
                return right.peek();
            else
                return (left.peek() + right.peek()) / 2.0;
        }
    }
}
