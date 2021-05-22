package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 953,
        title = "Verifying an Alien Dictionary",
        url = "https://leetcode.com/problems/verifying-an-alien-dictionary/"
)
public class VerifyingAlienDictionarySolution {
    public boolean isAlienSorted(String[] words, String order) {
        if (words == null || words.length < 2)
            return true;
        byte[] pos = new byte[128];
        for (byte i = 0; i < order.length(); i++)
            pos[order.charAt(i)] = i;
        for (int i = 0; i < words.length - 1; i++) {
            if (!validOrder(words[i], words[i+1], pos))
                return false;
        }
        return true;
    }

    boolean validOrder(String w1, String w2, byte[] pos) {
        int i = 0;
        while (i < w1.length() && i < w2.length()) {
            char c1 = w1.charAt(i);
            char c2 = w2.charAt(i);
            if (c1 != c2) {
                return pos[c1] < pos[c2];
            }
            i++;
        }
        return w2.length() >= w1.length();
    }
}
