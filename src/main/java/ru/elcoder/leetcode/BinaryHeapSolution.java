package ru.elcoder.leetcode;

import java.util.Comparator;

public class BinaryHeapSolution {
    public static class BinaryHeap {

        public static final Comparator<Integer> MAX = Comparator.comparingInt(o -> o);

        public static final Comparator<Integer> MIN = (o1, o2) -> o2 - o1;

        int[] queue;

        Comparator<Integer> comparator = MAX;

        int size = 0;

        public BinaryHeap(int initialCapacity) {
            queue = new int[initialCapacity];
        }

        public BinaryHeap(int initialCapacity, Comparator<Integer> comparator) {
            this(initialCapacity);
            this.comparator = comparator;
        }

        public void pollAll(int[] items) {
            for (int item : items)
                offer(item);
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void offer(int item) {
            int nodePos = size;
            queue[size++] = item;
            int parent = (size - 2) >> 1;
            while (parent >= 0) {
                if (comparator.compare(queue[nodePos], queue[parent]) <= 0)
                    break;
                swap(nodePos, parent);
                nodePos = parent;
                parent = (parent - 1) >> 1;
            }
            if (queue.length == size) {
                int[] tmp = new int[size << 1];
                System.arraycopy(queue, 0, tmp, 0, queue.length);
                queue = tmp;
            }
        }

        public int peek() {
            return queue[0];
        }

        private void swap(int p1, int p2) {
            int tmp = queue[p1];
            queue[p1] = queue[p2];
            queue[p2] = tmp;
        }

        public int poll() {
            int res = peek();
            queue[0] = queue[--size];
            heapify(0);
            return res;
        }

        private void heapify(int p) {
            final int left = 1 + (p << 1);
            final int right = 2 + (p << 1);
            if (size <= left)
                return;
            if (comparator.compare(queue[p], queue[left]) >= 0 && (right >= size || comparator.compare(queue[p], queue[right]) >= 0))
                return;
            if (right >= size || comparator.compare(queue[left], queue[right]) > 0) {
                swap(p, left);
                heapify(left);
            } else {
                swap(p, right);
                heapify(right);
            }
        }
    }
}
