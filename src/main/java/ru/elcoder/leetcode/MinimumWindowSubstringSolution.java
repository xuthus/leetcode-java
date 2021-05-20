package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Hard,
        number = 76,
        title = "Minimum Window Substring",
        url = "https://leetcode.com/problems/minimum-window-substring/"
)
public class MinimumWindowSubstringSolution {

    public String minWindow(String s, String t) {
        int[] target = new int[255];
        for (char c : t.toCharArray())
            target[c]++;
        int i = 0, j = 0, p1 = -1, p2 = -1, min = Integer.MAX_VALUE;
        Map<Character, Integer> cover = new HashMap<>();
        cover.put(s.charAt(i), 1);
        while (j < s.length() && i < s.length()) {
            while (!covers(cover, i, j, target, t.length(), s.length())) {
                j++;
                if (j >= s.length())
                    break;
                cover.merge(s.charAt(j), 1, Integer::sum);
            }
            while (covers(cover, i, j, target, t.length(), s.length())) {
                i++;
                if (i >= s.length())
                    break;
                final char key = s.charAt(i - 1);
                final Integer count = cover.get(key);
                if (count == 1)
                    cover.remove(key);
                else
                    cover.put(key, count - 1);
            }
            if (j >= s.length())
                break;
            if (min > (j - i + 2)) {
                p1 = i - 1;
                p2 = j + 1;
                min = p2 - p1;
            }
        }
        return p1 == -1 ? "" : s.substring(p1, p2);
    }

    private boolean covers(Map<Character, Integer> cover, int i, int j, int[] target, int minLength, int sourceLength) {
        if (j >= sourceLength || i >= sourceLength)
            return false;
        if ((j - i + 1) < minLength)
            return false;
        for (char c = 0; c < target.length; c++) {
            if (target[c] == 0)
                continue;
            final Integer count = cover.get(c);
            if (count == null || count < target[c])
                return false;
        }
        return true;
    }

}
