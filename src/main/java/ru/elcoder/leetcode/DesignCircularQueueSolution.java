package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 622,
        title = "Design Circular Queue",
        url = "https://leetcode.com/problems/design-circular-queue/"
)
public class DesignCircularQueueSolution {
    public static class MyCircularQueue {
        int[] nums;
        int front = 0;
        int count = 0;

        public MyCircularQueue(int k) {
            nums = new int[k];
        }

        public boolean enQueue(int value) {
            if (isFull())
                return false;
            count++;
            nums[rearIndex()] = value;
            return true;
        }

        public boolean deQueue() {
            if (isEmpty())
                return false;
            count--;
            front = (front + 1) % nums.length;
            return true;
        }

        public int Front() {
            if (count == 0)
                return -1;
            return nums[front];
        }

        public int Rear() {
            if (count == 0)
                return -1;
            return nums[rearIndex()];
        }

        private int rearIndex() {
            return (front + count - 1) % nums.length;
        }

        public boolean isEmpty() {
            return count == 0;
        }

        public boolean isFull() {
            return count == nums.length;
        }
    }
}
