package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 347,
        title = "Top K Frequent Elements",
        url = "https://leetcode.com/problems/top-k-frequent-elements/"
)
public class TopKFrequentElementsSolution {
    public int[] topKFrequent(int[] nums, int k) {
        final Map<Integer, Integer> count = new HashMap<>();
        for (int num: nums)
            count.put(num, count.getOrDefault(num, 0) + 1);
        final PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
                (e1, e2) -> Integer.compare(e1.getValue(), e2.getValue())
        );
        count.entrySet().forEach(e -> {
            queue.add(e);
            if (queue.size() > k)
                queue.remove();
        });
        int[] result = new int[k];
        for (int i = 0; i < k; i++)
            result[i] = queue.poll().getKey();
        return result;
    }
}
