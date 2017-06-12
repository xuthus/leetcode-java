package ru.elcoder.leetcode;

/**
 * Created by xuthus on 01.05.2017.
 */
public class RomanToIntegerSolution {
    /*
    Given a roman numeral, convert it to an integer.
    Input is guaranteed to be within the range from 1 to 3999.
    https://leetcode.com/problems/roman-to-integer/
    */

    public int romanToInt(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int result = 0;
        char prev = 0;
        for (char c : s.trim().toUpperCase().toCharArray()) {
            switch (c) {
                case 'I':
                    result++;
                    break;
                case 'V':
                    result += prev == 'I' ? 3 : 5;
                    break;
                case 'X':
                    result += prev == 'I' ? 8 : 10;
                    break;
                case 'L':
                    result += prev == 'X' ? 30 : 50;
                    break;
                case 'C':
                    result += prev == 'X' ? 80 : 100;
                    break;
                case 'D':
                    result += prev == 'C' ? 300 : 500;
                    break;
                case 'M':
                    result += prev == 'C' ? 800 : 1000;
                    break;
            }
            prev = c;
        }

        return result;
    }
}
