package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 649,
        title = "Palindromic Substrings",
        url = "https://leetcode.com/problems/palindromic-substrings/"
)
public class PalindromicSubstringsSolution {
    public int countSubstrings(String s) {
        Map<Integer, Boolean> memo = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++)
            for (int j = i; j < s.length(); j++)
                if (isPalindrome(s, i, j, memo))
                    cnt++;
        return cnt;
    }

    boolean isPalindrome(String s, int i, int j, Map<Integer, Boolean> memo) {
        if (i >= j)
            return true;
        int key = (i << 10) + j;
        if (memo.containsKey(key))
            return memo.get(key);
        char a = s.charAt(i);
        char b = s.charAt(j);
        if (a != b) {
            memo.put(key, false);
            return false;
        }
        boolean result = isPalindrome(s, i + 1, j - 1, memo);
        memo.put(key, result);
        return result;
    }
}
