package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1859,
        title = "Sorting the Sentence",
        url = "https://leetcode.com/problems/sorting-the-sentence/"
)
public class SortingTheSentenceSolution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] order = new String[words.length];
        for (String word : words)
            order[word.charAt(word.length() - 1) - '1'] = word.substring(0, word.length() - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(order[i]);
            if (i != words.length - 1)
                sb.append(' ');
        }
        return sb.toString();
    }
}
