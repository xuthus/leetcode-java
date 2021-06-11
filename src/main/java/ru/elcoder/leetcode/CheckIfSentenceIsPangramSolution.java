package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1832,
        title = "Check if the Sentence Is Pangram",
        url = "https://leetcode.com/problems/check-if-the-sentence-is-pangram/"
)
public class CheckIfSentenceIsPangramSolution {
    public boolean checkIfPangram1(String sentence) {
        int len = sentence.length();
        if (len < 26)
            return false;
        int[] chars = new int[129];
        for (int i = 0; i < len; i++) {
            char c = sentence.charAt(i);
            if (chars[c] == 0)
                chars[c] = 1;
        }
        for (int i = 'a'; i <= 'z'; i++)
            if (chars[i] == 0)
                return false;
        return true;
    }

    public boolean checkIfPangram2(String sentence) {
        int len = sentence.length();
        if (len < 26)
            return false;
        int cnt = 26;
        boolean[] chars = new boolean[129];
        for (int i = 0; i < len; i++) {
            char c = sentence.charAt(i);
            if (!chars[c]) {
                chars[c] = true;
                cnt--;
                if (cnt == 0)
                    return true;
            }
        }
        return cnt == 0;
    }
}
