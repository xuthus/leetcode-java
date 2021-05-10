package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 211,
        title = "Design Add and Search Words Data Structure",
        url = "https://leetcode.com/problems/design-add-and-search-words-data-structure/"
)
public class DesignAddAndSearchWordsDataStructureSolution {
    public static class WordDictionary {

        private final Map<Character, Map> map = new HashMap<>();

        /**
         * Initialize your data structure here.
         */
        public WordDictionary() {

        }

        public void addWord(String word) {
            Map<Character, Map> m = map;
            for (int i = 0; i < word.length(); i++)
                m = m.computeIfAbsent(word.charAt(i), c -> new HashMap<>());
            m.put(' ', new HashMap<>());
        }

        public boolean search(String word) {
            return searchSubmap(word + ' ', 0, map);
        }

        public boolean searchSubmap(String word, int i, Map<Character, Map> submap) {
            if (i >= word.length())
                return true;
            Character c = word.charAt(i);
            if (c == '.') {
                // search for all prefixes
                for (Map m : submap.values()) {
                    if (searchSubmap(word, i + 1, (Map<Character, Map>) m))
                        return true;
                }
                return false;
            } else {
                if (!submap.containsKey(c))
                    return false;
                return searchSubmap(word, i + 1, (Map<Character, Map>) submap.get(c));
            }

        }
    }

}
