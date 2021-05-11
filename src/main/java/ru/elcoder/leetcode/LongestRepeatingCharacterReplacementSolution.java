package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 424,
        title = "Longest Repeating Character Replacement",
        url = "https://leetcode.com/problems/longest-repeating-character-replacement/"
)
public class LongestRepeatingCharacterReplacementSolution {
    public int characterReplacement(String s, int k) {
        int p1 = 0, p2 = 0, max = 1;
        Map<Character, int[]> chars = new HashMap<>();
        chars.put(s.charAt(0), new int[]{1, 0});
        while (p1 < s.length()) {
            int charCount = getCharCount(s, p1, p2, chars);
            if (charCount <= k) {
                int len = p2 - p1 + 1;
                if (len > max)
                    max = len;
                p2++;
                if (p2 >= s.length())
                    break;
                Character ch = s.charAt(p2);
                chars.put(ch, new int[]{chars.getOrDefault(ch, new int[]{0, 0})[0] + 1, p2});
            } else {
                final char c1 = s.charAt(p1);
                p1++;
                chars.get(c1)[0]--;
                if (chars.get(c1)[0] == 0) {
                    chars.remove(c1);
                } else {
                    for (Character ch : chars.keySet()) {
                        if (chars.get(ch)[1] < p1) {
                            chars.remove(ch);
                            break;
                        }
                    }
                }
            }
        }
        return max;
    }

    private int getCharCount(String s, int p1, int p2, Map<Character, int[]> chars) {
        int max = 0;
        for (int[] cnt : chars.values()) {
            if (max < cnt[0])
                max = cnt[0];
        }
        return p2 - p1 + 1 - max;
    }
}
