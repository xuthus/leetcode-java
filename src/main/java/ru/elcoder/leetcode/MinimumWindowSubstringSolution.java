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
        Map<Character, Integer> target = new HashMap<>();
        for (char c : t.toCharArray()) {
//            target.put(c, target.getOrDefault(c, 0) + 1);
            target.merge(c, 1, Integer::sum);
        }
        Map<Character, Integer> cover = new HashMap<>(target);
        int i = 0, j = -1, p1 = -1, p2 = -1, min = Integer.MAX_VALUE;
        while (j < s.length() && i < s.length()) {
            while (j < s.length() && !covers(cover)) {
                j++;
                if (j >= s.length())
                    break;
                char c = s.charAt(j);
                final Integer count = cover.get(c);
                if (count == null)
                    continue;
                if (count == 1)
                    cover.remove(c);
                else
                    cover.put(c, count - 1);
            }
            while (i <= j && covers(cover)) {
                i++;
                if (i >= s.length())
                    break;
                char c = s.charAt(i - 1);
                if (!target.containsKey(c))
                    continue;
                cover.merge(c, 1, Integer::sum);
            }
            if (i > j)
                break;
            if (min > (j - i + 2)) {
                p1 = i - 1;
                p2 = j + 1;
                min = p2 - p1;
            }
        }
        return p1 == -1 ? "" : s.substring(p1, p2);
    }

    private boolean covers(Map<Character, Integer> cover) {
        return cover.size() == 0;
    }

}
