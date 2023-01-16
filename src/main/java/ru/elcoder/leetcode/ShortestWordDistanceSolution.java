package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 243,
        title = "Shortest Word Distance",
        url = "https://leetcode.com/problems/shortest-word-distance/"
)
public class ShortestWordDistanceSolution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int idx1 = -1, idx2 = -1;
        int shortest = Integer.MAX_VALUE;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)) {
                idx1 = i;
                if (idx2 > -1) {
                    shortest = Math.min(idx1 - idx2, shortest);
                }
            } else if (wordsDict[i].equals(word2)) {
                idx2 = i;
                if (idx1 > -1) {
                    shortest = Math.min(idx2 - idx1, shortest);
                }
            }
        }
        return shortest;
    }
}
