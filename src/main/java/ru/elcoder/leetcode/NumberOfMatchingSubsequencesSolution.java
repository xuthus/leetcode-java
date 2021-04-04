package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 792,
        title = "Number of Matching Subsequences",
        url = "https://leetcode.com/problems/number-of-matching-subsequences/"
)
public class NumberOfMatchingSubsequencesSolution {
    public int numMatchingSubseq(String s, String[] words) {
        final int[][] positions = new int[26][];
        final ArrayList<Integer>[] pos = new ArrayList[26];
        for (int i = 0; i < pos.length; i++) {
            pos[i] = new ArrayList<>();
        }
        final char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int ch = chars[i] - 'a';
            pos[ch].add(i);
        }
        for (int i = 0; i < pos.length; i++) {
            positions[i] = pos[i].stream().mapToInt(j -> j).toArray();
        }
        return (int) Arrays.stream(words)
                .filter(word -> isSubsequence(word, s, positions, 0))
                .count();
    }

    private boolean isSubsequence(String s, String t, int[][] positions, int fromPos) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        final int[] position = positions[s.charAt(0) - 'a'];
        int i = Arrays.binarySearch(position, fromPos);
        if (i < 0) {
            i = -i - 1;
        }
        return i < position.length && isSubsequence(s.substring(1), t, positions, position[i] + 1);
    }

}
