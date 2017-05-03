package ru.elcoder.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by xuthus on 03.05.2017.
 */
public class GroupAnagramsSolution {
    /*
    Given an array of strings, group anagrams together.

    For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
    Return:
    [
      ["ate", "eat","tea"],
      ["nat","tan"],
      ["bat"]
    ]
    Note: All inputs will be in lower-case.
    https://leetcode.com/problems/anagrams
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>((int) (strs.length / 0.75));
        String sortedWord;
        for (String word : strs) {
            if (word != null) {
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                sortedWord = new String(chars);
            } else
                sortedWord = null;
            List<String> words = groups.get(sortedWord);
            if (words == null) {
                words = new ArrayList<>();
                groups.put(sortedWord, words);
            }
            words.add(word);
        }
        ArrayList<List<String>> result = new ArrayList<>();
        result.addAll(groups.values());
        return result;
    }
}
