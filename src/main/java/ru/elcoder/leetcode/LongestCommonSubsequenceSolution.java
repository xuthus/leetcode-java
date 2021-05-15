package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 1143,
        title = "Longest Common Subsequence",
        url = "https://leetcode.com/problems/longest-common-subsequence/"
)
public class LongestCommonSubsequenceSolution {
    public int longestCommonSubsequence(String text1, String text2) {
        return longest(text1, text2, 0, 0, new HashMap<>(text1.length() * text2.length()));
    }

    int longest(String text1, String text2, int from1, int from2, Map<Integer, Integer> memo) {
        if (from1 >= text1.length() || from2 >= text2.length())
            return 0;
        int key = (from1 << 10) + from2;
        if (memo.containsKey(key))
            return memo.get(key);
        int result = (text1.charAt(from1) == text2.charAt(from2)) ?
                1 + longest(text1, text2, from1 + 1, from2 + 1, memo)
                : Math.max(
                longest(text1, text2, from1, from2 + 1, memo),
                longest(text1, text2, from1 + 1, from2, memo)
        );
        memo.put(key, result);
        return result;
    }
}
