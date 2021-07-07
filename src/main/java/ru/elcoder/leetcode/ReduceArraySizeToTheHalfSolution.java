package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 1338,
        title = "Reduce Array Size to The Half",
        url = "https://leetcode.com/problems/reduce-array-size-to-the-half/"
)
public class ReduceArraySizeToTheHalfSolution {
    public int minSetSize(int[] arr) {
        if (arr.length == 1)
            return 1;
        PriorityQueue<IntegerWithWeight> q = new PriorityQueue<>();
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : arr)
            counts.merge(num, 1, (v1, v2) -> v1 + v2);
        for (Integer key : counts.keySet()) {
            q.offer(new IntegerWithWeight(key, counts.get(key)));
        }
        int count = 0;
        int sum = 0;
        while (sum < arr.length / 2) {
            sum += q.poll().weight;
            count++;
        }
        return count;
    }

    public static class IntegerWithWeight implements Comparable<IntegerWithWeight> {
        int value;

        int weight;

        public IntegerWithWeight(int v, int w) {
            value = v;
            weight = w;
        }

        @Override
        public int compareTo(IntegerWithWeight other) {
            return -Integer.compare(weight, other.weight);
        }
    }
}
