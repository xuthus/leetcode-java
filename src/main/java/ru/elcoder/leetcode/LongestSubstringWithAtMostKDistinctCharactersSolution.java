package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 340,
        title = "Longest Substring with At Most K Distinct Characters",
        url = "https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/"
)
public class LongestSubstringWithAtMostKDistinctCharactersSolution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (k == 0)
            return 0;
        int p1 = 0, p2 = 0, max = 1;
        Map<Character, Integer> positions = new HashMap<>();
        positions.put(s.charAt(0), 0);
        while (p1 < s.length()) {
            int charCount = positions.size();
            if (charCount <= k) {
                int len = p2 - p1 + 1;
                if (len > max)
                    max = len;
                p2++;
                if (p2 >= s.length())
                    break;
                positions.put(s.charAt(p2), p2);
            } else {
                p1++;
                // todo: replace this loop with PriorityQueue
                for (Character c : positions.keySet()) {
                    if (positions.get(c) < p1) {
                        positions.remove(c);
                        break;
                    }
                }
            }
        }
        return max;
    }
}
