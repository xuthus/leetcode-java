package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.*;

@Leetcode(
        difficulty = DifficultyLevel.Hard,
        number = 212,
        title = "Word Search II",
        url = "https://leetcode.com/problems/word-search-ii/"
)
public class WordSearchIISolution {
    public List<String> findWords(char[][] board, String[] words) {
        Set<String> res = new HashSet<>();
        Trie trie = new Trie(words);
        int height = board.length;
        int width = board[0].length;
        char[][] marks = new char[height][width];
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                doFind(res, board, h, w, trie, new char[16], 1, marks);
            }
        }
        return new ArrayList<>(res);
    }

    private void doFind(Set<String> res, char[][] board, int h, int w, Trie trie, char[] sequence, int len, char[][] marks) {
        if (len > trie.maxLength || h < 0 || h >= board.length || w < 0 || w >= board[0].length || marks[h][w] == '*') {
            return;
        }
        sequence[len - 1] = board[h][w];
        marks[h][w] = '*';
        if (trie.containsWord(sequence, len))
            res.add(mkString(sequence, len));
        if (trie.containsPrefix(sequence, len)) {
            doFind(res, board, h - 1, w, trie, sequence, len + 1, marks);
            doFind(res, board, h + 1, w, trie, sequence, len + 1, marks);
            doFind(res, board, h, w - 1, trie, sequence, len + 1, marks);
            doFind(res, board, h, w + 1, trie, sequence, len + 1, marks);
        }
        marks[h][w] = ' ';
    }

    private static String mkString(char[] sequence, int len) {
        return new String(sequence, 0, len);
    }


    public static class Trie {

        private TrieNode root = new TrieNode(' ');
        int maxLength = 0;

        /** Initialize your data structure here. */
        public Trie(String[] words) {
            for (String word: words)
                insert(word);
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            maxLength = Math.max(maxLength, word.length());
            TrieNode n = root;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                n = n.children.computeIfAbsent(ch, c-> new TrieNode(ch));
            }
            n.children.put(' ', null);
        }

        /** Returns if the word is in the trie. */
        boolean containsWord(char[] sequence, int len) {
            TrieNode n = root;
            for (int i = 0; i < len; i++) {
                n = n.children.get(sequence[i]);
                if (n == null)
                    return false;
            }
            return n.children.containsKey(' ');
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        boolean containsPrefix(char[] sequence, int len) {
            TrieNode n = root;
            for (int i = 0; i < len; i++) {
                n = n.children.get(sequence[i]);
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

    private static class TrieNaive {
        private final String[] words;

        TrieNaive(String[] words) {
            this.words = words;
        }

        boolean containsPrefix(char[] sequence, int len) {
            String prefix = mkString(sequence, len);
            return Arrays.stream(words).anyMatch(w -> w.startsWith(prefix));
        }

        boolean containsWord(char[] sequence, int len) {
            return Arrays.asList(words).contains(mkString(sequence, len));
        }
    }

}
