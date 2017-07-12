package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Sergey Yanzin (xuthus@yandex.ru) on 12.07.2017.
 */
@Difficulty(DifficultyLevel.Medium)
@BeatsPercent(84.12)
public class WordBreakSolution {
     /*
    Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be
    segmented into a space-separated sequence of one or more dictionary words. You may assume the dictionary does not
    contain duplicate words.

    For example, given
        s = "leetcode",
        dict = ["leet", "code"].
    Return true
        because "leetcode" can be segmented as "leet code".
    https://leetcode.com/problems/word-break/
    */

    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || wordDict == null || s.length() == 0 || wordDict.size() == 0) return false;
        Collections.sort(wordDict);
        return wordBreakSorted(s, wordDict, new HashSet<>());
    }

    private boolean wordBreakSorted(String s, List<String> wordDict, Set<String> checked) {
        if (checked.contains(s))
            return false;
        int idx = Collections.binarySearch(wordDict, s);
        if (idx >= 0)
            return true;
        idx = -idx - 2;
        if (idx < 0) {
            checked.add(s);
            return false;
        }
        while (idx >= 0) {
            final String s1 = wordDict.get(idx);
            if (s.startsWith(s1) && wordBreakSorted(s.substring(s1.length()), wordDict, checked))
                return true;
            idx--;
        }
        checked.add(s);
        return false;
    }

}
