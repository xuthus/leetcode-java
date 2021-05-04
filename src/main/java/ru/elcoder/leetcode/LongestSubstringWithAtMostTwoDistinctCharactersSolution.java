package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 159,
        title = "Longest Substring with At Most Two Distinct Characters",
        url = "https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/"
)
public class LongestSubstringWithAtMostTwoDistinctCharactersSolution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        char c1 = 0;
        char c2 = 0;
        int start1 = -1;
        int start2 = -1;
        int end1 = -1;
        int end2 = -1;
        int max = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != c1 && c != c2) {
                if (c1 != 0 && c2 != 0)
                    max = Math.max(max, i - Math.min(start1, start2));
                c1 = i == 0 ? 0 : s.charAt(i - 1);
                c2 = c;
                start2 = i;
                start1 = c1 == 0 ? -1 : Math.min(end1, end2) + 1;
                end2 = i;
                end1 = i - 1;
            }
            if (c == c1)
                end1 = i;
            else
                end2 = i;
        }
        if (c1 != 0 && c2 != 0)
            max = Math.max(max, s.length() - Math.min(start1, start2));
        else
            max = s.length();
        return max;
    }
}
