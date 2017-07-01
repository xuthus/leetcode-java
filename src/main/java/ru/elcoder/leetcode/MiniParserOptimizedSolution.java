package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.NestedInteger;

/**
 * Created by xuthus on 01.07.2017.
 */
@Difficulty(DifficultyLevel.Medium)
@BeatsPercent(99.64) // WOW!
public class MiniParserOptimizedSolution {
    /*
    Given a nested list of integers represented as a string, implement a parser to deserialize it.

    Each element is either an integer, or a list -- whose elements may also be integers or other lists.

    Note: You may assume that the string is well-formed:

    * String is non-empty.
    * String does not contain white spaces.
    * String contains only digits 0-9, [, - ,, ].

    Example 1:

    Given s = "324",
    You should return a NestedInteger object which contains a single integer 324.

    Example 2:

    Given s = "[123,[456,[789]]]",
    Return a NestedInteger object containing a nested list with 2 elements:
    1. An integer containing value 123.
    2. A nested list containing two elements:
        i.  An integer containing value 456.
        ii. A nested list with one element:
             a. An integer containing value 789.

    https://leetcode.com/problems/mini-parser/
    */

    public NestedInteger deserialize(String s) {
        if (s == null || s.length() == 0) return null;

        s = s.trim();
        if (s.charAt(0) != '[')
            return new NestedInteger(Integer.parseInt(s));

        NestedInteger root = new NestedInteger();
        parseList(root, s, 0);
        return root;
    }

    public int parseList(NestedInteger root, String s, int pos) {
        int number = 0;
        int sign = 1;
        boolean isNumber = false;

        while (pos < s.length()) {
            pos++;
            switch (s.charAt(pos)) {
                case '[': // new subList
                    NestedInteger child = new NestedInteger();
                    pos = parseList(child, s, pos);
                    root.add(child);
                    break;
                case ']': // list end
                    if (isNumber) {
                        root.add(new NestedInteger(sign == 1 ? number : -number));
                    }
                    return pos;
                case ',':
                    if (isNumber) {
                        root.add(new NestedInteger(sign == 1 ? number : -number));
                        isNumber = false;
                        number = 0;
                        sign = 1;
                    }
                    break;
                case ' ':
                    break;
                case '-':
                    sign = -1;
                    break;
                default:
                    isNumber = true;
                    number = ((number << 3) + (number << 1)) + s.charAt(pos) - '0';
            }
        }
        throw new IndexOutOfBoundsException("Expression is not well-formed:  " + s);
    }

}
