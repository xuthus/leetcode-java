package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 359,
        title = "Logger Rate Limiter",
        url = "https://leetcode.com/problems/logger-rate-limiter/"
)
public class LoggerRateLimiterSolution {

    public static class Logger {

        private Map<String, Integer> timestamps = new HashMap<>();

        /**
         * Initialize your data structure here.
         */
        public Logger() {

        }

        /**
         * Returns true if the message should be printed in the given timestamp, otherwise returns false.
         * If this method returns false, the message will not be printed.
         * The timestamp is in seconds granularity.
         */
        public boolean shouldPrintMessage(int timestamp, String message) {
            Integer prev = timestamps.getOrDefault(message, -20);
            boolean result = prev == null || (prev + 10) <= timestamp;
            if (result)
                timestamps.put(message, timestamp);
            return result;
        }
    }

}
