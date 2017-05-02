package ru.elcoder.leetcode;

import java.util.*;

/**
 * Created by xuthus on 28.04.2017.
 */
public class FindAllAnagramsSolution {

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
