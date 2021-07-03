package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 362,
        title = "Design Hit Counter",
        url = "https://leetcode.com/problems/design-hit-counter/"
)
public class DesignHitCounterSolution {

    public interface HitCounter {
        void hit(int timestamp);

        int getHits(int timestamp);
    }

    /**
     * Your HitCounter object will be instantiated and called as such:
     * HitCounter obj = new HitCounter();
     * obj.hit(timestamp);
     * int param_2 = obj.getHits(timestamp);
     */
    // beats 7%
    public static class MapHitCounter implements HitCounter {

        private int hitsCount = 0;
        private Map<Integer, Integer> hits = new HashMap<>(300);
        private int[] lastHits = new int[300];
        private int lastTimestamp = -1;

        /**
         * Initialize your data structure here.
         */
        public MapHitCounter() {

        }

        /**
         * Record a hit.
         *
         * @param timestamp - The current timestamp (in seconds granularity).
         */
        public void hit(int timestamp) {
            removeHitsBefore(timestamp - 299);
            addHit(timestamp);
        }

        private void removeHitsBefore(int timestamp) {
            List<Integer> keysToRemove = hits.keySet().stream().filter(k -> k < timestamp).collect(Collectors.toList());
            keysToRemove.forEach(key -> {
                if (key < timestamp) {
                    hitsCount -= hits.remove(key);
                }
            });
        }

        private void addHit(int timestamp) {
            hitsCount++;
            hits.merge(timestamp, 1, Integer::sum);
        }

        /**
         * Return the number of hits in the past 5 minutes.
         *
         * @param timestamp - The current timestamp (in seconds granularity).
         */
        public int getHits(int timestamp) {
            removeHitsBefore(timestamp - 299);
            return hitsCount;
        }
    }

    // beats 93%
    public static class ArrayHitCounter implements HitCounter {

        private int hitsCount = 0;
        private final int[] lastHits = new int[300];
        private int lastTimestamp = -1;

        /**
         * Initialize your data structure here.
         */
        public ArrayHitCounter() {

        }

        /**
         * Record a hit.
         *
         * @param timestamp - The current timestamp (in seconds granularity).
         */
        public void hit(int timestamp) {
            removeHitsBefore(timestamp);
            addHit(timestamp);
        }

        private void removeHitsBefore(int timestamp) {
            if (lastTimestamp == timestamp)
                return;
            int diff = lastTimestamp == -1 ? 300 : timestamp - lastTimestamp;
            if (diff < 300 && diff > 0) {
                for (int i = 0; i < diff; i++) {
                    hitsCount -= lastHits[i];
                }
                System.arraycopy(lastHits, diff, lastHits, 0, 300 - diff);
                Arrays.fill(lastHits, 300 - diff, 300, 0);
            } else {
                hitsCount = 0;
                Arrays.fill(lastHits, 0, 300, 0);
            }
            lastTimestamp = timestamp;
        }

        private void addHit(int timestamp) {
            hitsCount++;
            lastHits[299]++;
        }

        /**
         * Return the number of hits in the past 5 minutes.
         *
         * @param timestamp - The current timestamp (in seconds granularity).
         */
        public int getHits(int timestamp) {
            removeHitsBefore(timestamp);
            return hitsCount;
        }
    }
}
