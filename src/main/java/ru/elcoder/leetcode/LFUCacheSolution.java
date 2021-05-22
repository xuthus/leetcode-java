package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Hard,
        number = 460,
        title = "LFU Cache",
        url = "https://leetcode.com/problems/lfu-cache/"
)
public class LFUCacheSolution {
    static class LFUCache {
        int capacity;
        Map<Integer, Value> values;
        ListNode<Value> queue = null;  // most used on the tail

        public LFUCache(int capacity) {
            this.values = new HashMap<>(capacity);
            this.capacity = capacity;
        }

        public int get(int key) {
            Value value = values.get(key);
            if (value != null) {
                value.counter++;
                sortQueue(key);
            }
            return value == null ? -1 : value.val;
        }

        public void put(int key, int value) {
            if (capacity == 0)
                return;
            Value v = values.get(key);
            if (v != null) {
                v.val = value;
                v.counter++;
                sortQueue(key);
            } else {
                if (values.size() == capacity) {
                    removeLeastFrequentlyUsedItem();
                }
                v = new Value(key, value, 1);
                values.put(key, v);
                enqueue(v);
            }
        }

        private void enqueue(Value v) {
            queue = new ListNode<>(v, queue);
            sortQueue(v.key);
        }

        private void sortQueue(int key) {
            // find key
            ListNode<Value> node = queue;
            while (node.val.key != key)
                node = node.next;
            int counter = node.val.counter;
            // move it forward while its counter greater or equal to next.counter
            while (node.next != null && node.next.val.counter <= counter) {
                Value v = node.next.val;
                node.next.val = node.val;
                node.val = v;
                node = node.next;
            }
        }

        private void removeLeastFrequentlyUsedItem() {
            if (queue != null) {
                values.remove(queue.val.key);
                queue = queue.next;
            }
        }

        static class Value {
            int key;
            int val;
            int counter;

            Value(int key, int val, int counter) {
                this.key = key;
                this.val = val;
                this.counter = counter;
            }
        }

        static class ListNode<T> {
            public T val;

            public ListNode<T> next;

            public ListNode(T x) {
                val = x;
            }

            public ListNode(T val, ListNode<T> next) {
                this.val = val;
                this.next = next;
            }
        }
    }
}
