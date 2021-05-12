package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 208,
        title = "Implement Trie (Prefix Tree)",
        url = "https://leetcode.com/problems/implement-trie-prefix-tree/"
)
public class ImplementTriePrefixTreeSolution {
    public static class Trie {

        private TrieNode root = new TrieNode(' ');

        /** Initialize your data structure here. */
        public Trie() {

        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            TrieNode n = root;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                n = n.children.computeIfAbsent(ch, c-> new TrieNode(ch));
            }
            n.children.put(' ', null);
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TrieNode n = root;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                n = n.children.get(ch);
                if (n == null)
                    return false;
            }
            return n.children.containsKey(' ');
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TrieNode n = root;
            for (int i = 0; i < prefix.length(); i++) {
                char ch = prefix.charAt(i);
                n = n.children.get(ch);
                if (n == null)
                    return false;
            }
            return true;
        }

        private static class TrieNode {
            char val;
            Map<Character, TrieNode> children = new HashMap<>();
            public TrieNode(char c) {
                this.val = c;
            }
        }
    }
}
