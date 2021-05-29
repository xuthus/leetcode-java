package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.*;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 981,
        title = "Time Based Key-Value Store",
        url = "https://leetcode.com/problems/time-based-key-value-store/"
)
public class TimeBasedKeyValueStoreSolution {
    static class TimeMap {

        Map<String, List<Integer>> times = new HashMap<>();
        Map<String, List<String>> values = new HashMap<>();

        /**
         * Initialize your data structure here.
         */
        public TimeMap() {

        }

        public void set(String key, String value, int timestamp) {
            times.computeIfAbsent(key, k -> new ArrayList<>()).add(timestamp);
            values.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
        }

        public String get(String key, int timestamp) {
            List<Integer> stamps = times.get(key);
            if (stamps == null)
                return "";
            if (stamps.size() < 32) {
                int i = 0;
                while (i < stamps.size()) {
                    if (stamps.get(i) == timestamp)
                        return values.get(key).get(i);
                    if (stamps.get(i) > timestamp)
                        return i == 0 ? "" : values.get(key).get(i - 1);
                    i++;
                }
                return values.get(key).get(stamps.size() - 1);

            }
            int index = Collections.binarySearch(stamps, timestamp);
            if (index < 0) {
                if (index == -1)
                    return "";
                index = -index - 2;
            }
            return values.get(key).get(index);
        }
    }
}
