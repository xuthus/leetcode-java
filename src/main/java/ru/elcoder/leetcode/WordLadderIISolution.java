package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.*;
import java.util.stream.Collectors;

@Leetcode(
        difficulty = DifficultyLevel.Hard,
        number = 126,
        title = "Word Ladder II",
        url = "https://leetcode.com/problems/word-ladder-ii/"
)
public class WordLadderIISolution {
    Map<String, Set<String>> nextWords = new HashMap<>();
    Set<String> used = new HashSet<>();
    Stack<String> path = new Stack<>();
    List<List<String>> res = new ArrayList<>();
    Map<String, Integer> shortestPath = new HashMap<>();

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        bfs(beginWord, endWord, wordList);
        return res;
    }

    private void bfs(String word, String endWord, List<String> wordList) {
        path.push(word);
        used.add(word);
        if (shortestPath.getOrDefault(word, Integer.MAX_VALUE) >= path.size() && (res.isEmpty() || path.size() <= res.get(0).size())) {
            shortestPath.put(word, path.size());
            if (word.equals(endWord)) {
                if (!res.isEmpty() && path.size() < res.get(0).size()) {
                    res.clear();
                }
                res.add(new ArrayList<>(path));
            } else {
                Set<String> next = nextWords.computeIfAbsent(word, w ->
                        wordList.stream()
                                .filter(w2 -> isNextWord(w, w2))
                                .collect(Collectors.toSet())
                );
                if (next.contains(endWord)) {
                    bfs(endWord, endWord, wordList);
                } else {
                    for (String nextWord : next) {
                        shortestPath.merge(nextWord, path.size() + 1, Math::min);
                    }
                    for (String nextWord : next) {
                        if (!used.contains(nextWord)) {
                            bfs(nextWord, endWord, wordList);
                        }
                    }
                }
            }
        }
        used.remove(word);
        path.pop();
    }

    private boolean isNextWord(String w1, String w2) {
        if (w1.length() != w2.length())
            return false;
        int diff = 0;
        for (int i = 0; i < w1.length(); i++)
            if (w1.charAt(i) != w2.charAt(i)) {
                diff++;
                if (diff > 1)
                    return false;
            }
        return diff == 1;
    }
}
