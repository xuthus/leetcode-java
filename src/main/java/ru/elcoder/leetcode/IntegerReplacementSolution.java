package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 397,
        title = "Integer Replacement",
        url = "https://leetcode.com/problems/integer-replacement/"
)
public class IntegerReplacementSolution {
    public int integerReplacement(int n) {
        return replace(n, new HashMap<>());
    }

    private int replace(long n, Map<Long, Integer> memo) {
        if (n == 1) {
            return 0;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        final int result;
        if ((n & 1) == 0) {
            result = 1 + replace(n >> 1, memo);
        } else {
            result = 1 + Math.min(
                    replace(n + 1, memo),
                    replace(n - 1, memo)
            );
        }
        memo.put(n, result);
        return result;
    }
}
