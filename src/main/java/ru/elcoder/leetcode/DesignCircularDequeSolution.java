package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 641,
        title = "Design Circular Deque",
        url = "https://leetcode.com/problems/design-circular-deque/"
)
public class DesignCircularDequeSolution {
    static class MyCircularDeque {
        int[] nums;
        int front = 0;
        int count = 0;

        /** Initialize your data structure here. Set the size of the deque to be k. */
        public MyCircularDeque(int k) {
            nums = new int[k];
        }

        /** Adds an item at the front of Deque. Return true if the operation is successful. */
        public boolean insertFront(int value) {
            if (isFull())
                return false;
            count++;
            front = (front + nums.length - 1) % nums.length;
            nums[front] = value;
            return true;
        }

        /** Adds an item at the rear of Deque. Return true if the operation is successful. */
        public boolean insertLast(int value) {
            if (isFull())
                return false;
            count++;
            nums[rearIndex()] = value;
            return true;
        }

        /** Deletes an item from the front of Deque. Return true if the operation is successful. */
        public boolean deleteFront() {
            if (isEmpty())
                return false;
            front = (front + 1) % nums.length;
            count--;
            return true;
        }

        /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
        public boolean deleteLast() {
            if (isEmpty())
                return false;
            count--;
            return true;
        }

        /** Get the front item from the deque. */
        public int getFront() {
            if (count == 0)
                return -1;
            return nums[front];
        }

        /** Get the last item from the deque. */
        public int getRear() {
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
