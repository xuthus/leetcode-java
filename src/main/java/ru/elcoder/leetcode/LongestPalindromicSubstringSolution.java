package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a string s, return the longest palindromic substring in s.
 */
@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 5,
        title = "Longest Palindromic Substring",
        url = "https://leetcode.com/problems/longest-palindromic-substring/"
)
public class LongestPalindromicSubstringSolution {
    public String longestPalindrome(String s) {
        final Map<Character, List<Integer>> positions = new HashMap<>();
        final char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            positions.computeIfAbsent(chars[i], c -> new ArrayList<>()).add(i);
        }
        String maxLen = s.substring(0, 1);
        for (Character firstChar : positions.keySet()) {
            final List<Integer> pos = positions.get(firstChar);
            for (int i1 = 0; i1 < pos.size(); i1++) {
                for (int i2 = i1 + 1; i2 < pos.size(); i2++) {
                    final int p2 = pos.get(i2);
                    final int p1 = pos.get(i1);
                    int len = p2 - p1 + 1;
                    if (len <= maxLen.length()) {
                        continue;
                    }
                    if (isPalindrome(s, p1, p2)) {
                        maxLen = s.substring(p1, p2 + 1);
                    }
                }
            }
        }
        return maxLen;
    }

    /*
     * maybe need to memoize
     */
    private boolean isPalindrome(String s, int i1, int i2) {
        while (i1 < i2) {
            if (s.charAt(i1) != s.charAt(i2)) {
                return false;
            }
            i1++;
            i2--;
        }
        return true;
    }
}
