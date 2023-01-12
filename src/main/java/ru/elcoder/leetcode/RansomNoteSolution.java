package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 383,
        title = "Ransom Note",
        url = "https://leetcode.com/problems/ransom-note/"
)
public class RansomNoteSolution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] chars = new int[127];
        for (char c : magazine.toCharArray()) {
            chars[c]++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (chars[c] < 1) {
                return false;
            }
            chars[c]--;
        }
        return true;
    }
}
