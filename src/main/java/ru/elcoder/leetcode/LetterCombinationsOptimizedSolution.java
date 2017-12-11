package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by xuthus on 09.12.2017.
 */
@Difficulty(DifficultyLevel.Medium)
@BeatsPercent(67.99)
public class LetterCombinationsOptimizedSolution implements LetterCombinations {
    private static char[][] a = new char[][]{
            {' '},
            null,
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}
    };


    /*
    Given a digit string, return all possible letter combinations that the number could represent.

    A mapping of digit to letters (just like on the telephone buttons) is given below.
    image url: https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Telephone-keypad2.svg/200px-Telephone-keypad2.svg.png

    Example:
        Input:   Digit string "23"
        Output:  ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
    Note:
    Although the above answer is in lexicographical order, your answer could be in any order you want.

    See not optimized realisation in LetterCombinationsSolution class.

    https://leetcode.com/problems/letter-combinations-of-a-phone-number/
    */
    @Override
    public List<String> letterCombinations(String digits) {

        if (digits == null || digits.length() < 1)
            return new LinkedList<String>();

        final List<char[]> letters = new LinkedList<>();
        for (char c : digits.toCharArray()) {
            final char[] chars = a[c - '0'];
            if (chars != null) {
                letters.add(chars);
            }
        }
        return combineLetters(letters);
    }

    List<String> combineLetters(List<char[]> letters) {
        int size = 1;
        for (char[] chars : letters) {
            size = size * chars.length;
        }
        char[][] result = new char[size][letters.size()];
        int letterCount = size;
        int repeats = 1;
        for (int i = 0; i < letters.size(); i++) {
            char[] l = letters.get(i);
            letterCount = letterCount / l.length;
            int offset = 0;
            if (letterCount > 1) {
                for (int r = 0; r < repeats; r++) {
                    for (char aL : l) {
                        for (int k = 0; k < letterCount; k++) {
                            result[offset++][i] = aL;
                        }
                    }
                }
            } else {
                for (int r = 0; r < repeats; r++) {
                    for (char aL : l) {
                        result[offset++][i] = aL;
                    }
                }
            }
            repeats = repeats * l.length;
        }
        List<String> res = new ArrayList<>(result.length);
        for (char[] letter : result) {
            res.add(new String(letter));
        }
        return res;
    }
}
