package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Hard,
        number = 214,
        title = "Shortest Palindrome",
        url = "https://leetcode.com/problems/shortest-palindrome/"
)
public class ShortestPalindromeSolution {
    public String shortestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        final char c0 = s.charAt(0);
        final int maxIndex = s.length() - 1;
        final Boolean[] memo = new Boolean[s.length()];
        for (int i = maxIndex; i >= 0; i--) {
            if (s.charAt(i) == c0 && isPalindrome(s, 0, i, memo)) {
                return reversed(s, i + 1, maxIndex) + s;
            }
        }
        return s; // never be reached
    }

    public String reversed(String s, int p1, int p2) {
        if (p2 >= s.length()) {
            return "";
        }
        final StringBuilder sb = new StringBuilder(p2 - p1 + 1);
        for (int i = p2; i >= p1; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public boolean isPalindrome(String s, int p1, int p2, Boolean[] memo) {
        if (memo[p2] != null) {
            return memo[p2];
        }
        int key = p2;
        boolean result = true;
        while (p1 < p2) {
            if (s.charAt(p1) != s.charAt(p2)) {
                result = false;
                break;
            }
            p1++;
            p2--;
        }
        memo[key] = result;
        return result;
    }
}
