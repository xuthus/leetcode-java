package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by xuthus on 09.12.2017.
 */
// TODO: 09.12.2017 optimize
@Difficulty(DifficultyLevel.Medium)
@BeatsPercent(8.75)
public class LetterCombinationsSolution {

    /*
    Given a digit string, return all possible letter combinations that the number could represent.

    A mapping of digit to letters (just like on the telephone buttons) is given below.
    image url: https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Telephone-keypad2.svg/200px-Telephone-keypad2.svg.png

    Example:
        Input:   Digit string "23"
        Output:  ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
    Note:
    Although the above answer is in lexicographical order, your answer could be in any order you want.

    https://leetcode.com/problems/letter-combinations-of-a-phone-number/
     */
    public List<String> letterCombinations(String digits) {
        final List<char[]> letters = new LinkedList<>();
        for (char c : digits.toCharArray()) {
            switch (c) {
                case '2':
                    letters.add(new char[]{'a', 'b', 'c'});
                    break;
                case '3':
                    letters.add(new char[]{'d', 'e', 'f'});
                    break;
                case '4':
                    letters.add(new char[]{'g', 'h', 'i'});
                    break;
                case '5':
                    letters.add(new char[]{'j', 'k', 'l'});
                    break;
                case '6':
                    letters.add(new char[]{'m', 'n', 'o'});
                    break;
                case '7':
                    letters.add(new char[]{'p', 'q', 'r', 's'});
                    break;
                case '8':
                    letters.add(new char[]{'t', 'u', 'v'});
                    break;
                case '9':
                    letters.add(new char[]{'w', 'x', 'y', 'z'});
                    break;
                case '0':
                    letters.add(new char[]{' '});
                    break;
            }
        }
        return combineLetters(letters);
    }

    private List<String> combineLetters(List<char[]> letters) {
        List<String> res = new LinkedList<>();
        if (letters.size() > 0) {
            final char[] s = letters.remove(0);
            if (letters.size() > 0) {
                List<String> combinations = combineLetters(letters);
                for (String letter : combinations) {
                    for (char c : s) {
                        res.add(c + letter);
                    }
                }
            } else {
                for (char c : s) {
                    res.add(c + "");
                }
            }
        }
        return res;
    }
}
