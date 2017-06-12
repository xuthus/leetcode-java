package ru.elcoder.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by xuthus on 28.04.2017.
 */
public class FindAllAnagramsSolution {
    /*
    Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
    Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
    The order of output does not matter.

    Example 1:

    Input:
    s: "cbaebabacd" p: "abc"

    Output:
    [0, 6]

    Explanation:
    The substring with start index = 0 is "cba", which is an anagram of "abc".
    The substring with start index = 6 is "bac", which is an anagram of "abc".

    Example 2:

    Input:
    s: "abab" p: "ab"

    Output:
    [0, 1, 2]

    Explanation:
    The substring with start index = 0 is "ab", which is an anagram of "ab".
    The substring with start index = 1 is "ba", which is an anagram of "ab".
    The substring with start index = 2 is "ab", which is an anagram of "ab".
    https://leetcode.com/problems/find-all-anagrams-in-a-string/
     */

    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] weightsP = new int[128];
        int[] weights = new int[128];
        if (s.length() > p.length()) {
            char[] tchars = p.toCharArray();
            long sumP = 0;
            for (char c : tchars) {
                sumP += c;
                weightsP[c]++;
            }
            char[] schars = s.toCharArray();
            long sum = 0;
            for (int i = 0; i < tchars.length; i++) {
                sum += schars[i];
                weights[schars[i]]++;
            }
            int lastIndex = s.length() - p.length();
            for (int i = 0, j = tchars.length; i <= lastIndex; i++, j++) {
                if (sum == sumP) {
                    if (Arrays.equals(weights, weightsP))
                        result.add(i);
                }
                sum -= schars[i];
                weights[schars[i]]--;
                if (j < schars.length) {
                    sum += schars[j];
                    weights[schars[j]]++;
                }
            }
        }
        return result;
    }

    public List<Integer> findAnagramsVariant2(String s, String p) {
        ArrayList<Integer> result = new ArrayList<>();
        if (s.length() > p.length()) {
            char[] tchars = p.toCharArray();
            long sumP = 0;
            for (char c : tchars)
                sumP += c;
            Arrays.sort(tchars);
            char[] schars = s.toCharArray();
            long sum = 0;
            for (int i = 0; i < tchars.length; i++) {
                sum += schars[i];
            }
            int lastIndex = s.length() - p.length();
            for (int i = 0, j = tchars.length; i <= lastIndex; i++, j++) {
                if (sum == sumP) {
                    char[] ss = Arrays.copyOfRange(schars, i, i + tchars.length);
                    Arrays.sort(ss);
                    if (Arrays.equals(ss, tchars))
                        result.add(i);
                }
                sum -= schars[i];
                if (j < schars.length)
                    sum += schars[j];
            }
        }
        return result;
    }
}
