package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 205,
        title = "Isomorphic Strings",
        url = "https://leetcode.com/problems/isomorphic-strings/"
)
public class IsomorphicStringsSolution {

    public boolean isIsomorphic(String s, String t) {
        char[] map = new char[256];
        boolean[] mapped = new boolean[256];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c1 = chars[i];
            char c2 = t.charAt(i);
            if (map[c1] == 0) {
                if (mapped[c2]) {
                    return false;
                }
                map[c1] = c2;
                mapped[c2] = true;
            } else if (map[c1] != c2) {
                return false;
            }
        }
        return true;
    }
}
