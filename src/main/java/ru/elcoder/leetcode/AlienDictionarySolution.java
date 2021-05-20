package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Leetcode(
        difficulty = DifficultyLevel.Hard,
        number = 269,
        title = "Alien Dictionary",
        url = "https://leetcode.com/problems/alien-dictionary/"
)
public class AlienDictionarySolution {
    public String alienOrder(String[] words) {
        if (words.length == 0)
            return "";
        Map<Character, Set<Character>> edges = new HashMap<>();
        Set<Character> chars = new HashSet<>();
        addChars(words[0], chars);
        for (int i = 0; i < words.length - 1; i++) {
            addChars(words[i + 1], chars);
            if (!fillEdges(words[i], words[i + 1], edges))
                return "";
        }
        Set<Character> visited = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (Character ch : edges.keySet()) {
            if (!dfs(edges, ch, visited, sb)) {
                return "";
            }
        }
        for (int i = 0; i < sb.length(); i++)
            chars.remove(sb.charAt(i));
        for (Character character : chars)
            sb.append(character);
        final String result = sb.reverse().toString();
        if (!validOrder(words, result))
            return "";
        return result;
    }

    private boolean validOrder(String[] words, String result) {
        int[] positions = new int[255];
        for (int i = 0; i < result.length(); i++)
            positions[result.charAt(i)] = i;
        for (int i = 0; i < words.length - 1; i++) {
            String w1 = words[i];
            String w2 = words[i+1];
            int j = 0;
            while (j < w1.length() && j < w2.length()) {
                final char c1 = w1.charAt(j);
                final char c2 = w2.charAt(j);
                if (c1 != c2) {
                    if (positions[c1] > positions[c2])
                        return false;
                    break;
                }
                j++;
            }
        }
        return true;
    }

    private void addChars(String word, Set<Character> chars) {
        for (int i = 0; i < word.length(); i++)
            chars.add(word.charAt(i));
    }

    /*
    return True if the path is valid
    return False if the path contains loop (wrong order)
     */
    private boolean dfs(Map<Character, Set<Character>> edges, Character ch, Set<Character> visited, StringBuilder sb) {
        if (visited.contains(ch))
            return sb.indexOf(String.valueOf(ch)) > 0;
        visited.add(ch);
        final Set<Character> neighbors = edges.get(ch);
        if (neighbors == null || neighbors.isEmpty()) {
            sb.append(ch);
            return true;
        }
        for (Character neighbor : neighbors) {
            dfs(edges, neighbor, visited, sb);
        }
        sb.append(ch);
        return true;
    }

    private boolean fillEdges(String w1, String w2, Map<Character, Set<Character>> edges) {
        int i = 0;
        while (i < w1.length() && i < w2.length()) {
            if (w1.charAt(i) != w2.charAt(i)) {
                edges.computeIfAbsent(w1.charAt(i), c -> new HashSet<>()).add(w2.charAt(i));
                return true;
            }
            i++;
        }
        return w1.length() <= w2.length();
    }
}
