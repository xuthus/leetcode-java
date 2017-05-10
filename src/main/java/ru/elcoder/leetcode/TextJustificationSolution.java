package ru.elcoder.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by xuthus on 05.05.2017.
 */
public class TextJustificationSolution {
    /*
    Given an array of words and a length L, format the text such that each line has exactly L characters
    and is fully (left and right) justified.

    You should pack your words in a greedy approach; that is, pack as many words as you can in each line.
    Pad extra spaces ' ' when necessary so that each line has exactly L characters.

    Extra spaces between words should be distributed as evenly as possible. If the number of spaces
    on a line do not divide evenly between words, the empty slots on the left will be assigned more
    spaces than the slots on the right.

    For the last line of text, it should be left justified and no extra space is inserted between words.

    For example,
    words: ["This", "is", "an", "example", "of", "text", "justification."]
    L: 16.

    Return the formatted lines as:
    [
       "This    is    an",
       "example  of text",
       "justification.  "
    ]
    Note: Each word is guaranteed not to exceed L in length.

    Corner Cases:
    A line other than the last line might contain only one word. What should you do in this case?
    In this case, that line should be left-justified.
    Subscribe to see which companies asked this question.
    https://leetcode.com/problems/text-justification
     */
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        if (words == null || words.length == 0)
            return res;
        int[] spaces = new int[words.length];
        char[] SPACES = new char[maxWidth];
        Arrays.fill(SPACES, ' ');
        int start = 0;
        int pos = 0;
        StringBuilder sb = new StringBuilder(maxWidth);
        while (pos < words.length) {
            int len = 0;
            while (len < maxWidth && pos < words.length) {
                len += words[pos++].length();
                if (len >= maxWidth)
                    break;
                spaces[pos - 1] = 1;
                len++;  // + 1 space
            }
            if (len > maxWidth && pos > start) {
                pos -= 2;
                len -= words[pos + 1].length();
            } else {
                pos--;
            }
            if (pos >= start) {
                if (spaces[pos] > 0) {
                    len -= spaces[pos];
                    spaces[pos] = 0;  // remove trailing space
                }
                int diff = maxWidth - len;
                if (pos < (words.length - 1)) {
                    if ((pos - start) <= 1) {
                        spaces[start] += diff;
                    } else {
                        for (int i = 0; i < diff; i++)
                            spaces[start + i % (pos - start)]++;
                    }
                } else {
                    spaces[pos] += diff;
                }
            } else
                pos = start;
            sb.setLength(0);
            for (int i = start; i <= pos; i++) {
                sb.append(words[i]).append(SPACES, 0, spaces[i]);
            }
            res.add(sb.toString());
            start = ++pos;
        }
        return res;
    }

}
