package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Hard,
        number = 76,
        title = "Minimum Window Substring",
        url = "https://leetcode.com/problems/minimum-window-substring/"
)
public class MinimumWindowSubstringSolution {

    public String minWindow(String s, String t) {
        final int sourceLength = s.length();
        final char[] chars = s.toCharArray();
        int[] target = new int[64];
        for (char c : t.toCharArray())
            target[c - 'A']++;
        int i = 0, j = 0, p1 = -1, p2 = -1, min = Integer.MAX_VALUE;
        int[] cover = new int[64];
        cover[chars[i] - 'A'] = 1;
        while (true) {
            if (!(j < sourceLength && i < sourceLength)) break;
            while (!covers(cover, i, j, target, t.length(), sourceLength)) {
                j++;
                if (j >= sourceLength)
                    break;
                cover[chars[j] - 'A']++;
            }
            while (covers(cover, i, j, target, t.length(), sourceLength)) {
                i++;
                if (i >= sourceLength)
                    break;
                cover[chars[i - 1] - 'A']--;
            }
            if (j >= sourceLength)
                break;
            if (min > (j - i + 2)) {
                p1 = i - 1;
                p2 = j + 1;
                min = p2 - p1;
            }
        }
        return p1 == -1 ? "" : s.substring(p1, p2);
    }

    private boolean covers(int[] cover, int i, int j, int[] target, int minLength, int sourceLength) {
        if (j >= sourceLength || i >= sourceLength || (j - i + 1) < minLength)
            return false;
        for (char c = 0; c < 60; c++) {
            if (cover[c] < target[c])
                return false;
        }
        return true;
    }

}
