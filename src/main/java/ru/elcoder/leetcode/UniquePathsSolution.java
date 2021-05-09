package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 62,
        title = "Unique Paths",
        url = "https://leetcode.com/problems/unique-paths/"
)
public class UniquePathsSolution {
    public int uniquePaths(int m, int n) {
        return uniquePathsMemoized(m, n, new HashMap<>(m * n));
    }

    private int uniquePathsMemoized(int m, int n, Map<Integer, Integer> memo) {
        int key = (m << 10) + n;
        if (memo.containsKey(key))
            return memo.get(key);
        if (m == 1 || n == 1) {
            memo.put(key, 1);
            return 1;
        }
        int result = uniquePathsMemoized(m - 1, n, memo)
                + uniquePathsMemoized(m, n - 1, memo);
        memo.put(key, result);
        return result;
    }
}
