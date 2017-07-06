package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

/**
 * Created by xuthus on 05.07.2017.
 */
@Difficulty(DifficultyLevel.Medium)
@BeatsPercent(93.78)
public class ComplexNumberMultiplicationSolution {
    /*
    Given two strings representing two complex numbers.
    You need to return a string representing their multiplication. Note i2 = -1 according to the definition.

    Example 1:
        Input: "1+1i", "1+1i"
        Output: "0+2i"
        Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
    Example 2:
        Input: "1+-1i", "1+-1i"
        Output: "0+-2i"
        Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
    Note:
        The input strings will not have extra blank.
        The input strings will be given in the form of a+bi, where the integer a and b will both belong to the
        range of [-100, 100]. And the output should be also in this form.

    https://leetcode.com/problems/complex-number-multiplication/
    */

    public String complexNumberMultiply(String a, String b) {
        return complexNumberToString(
                multiplyComplexNumbers(
                        parseComplexNumber(a),
                        parseComplexNumber(b)
                )
        );
    }

    public int[] parseComplexNumber(String a) {
        char[] chars = a.toCharArray();
        int pos = -1;
        int real = 0;
        int im = 0;
        int sign = 1;
        while (isDigit(chars[++pos])) {
            if (chars[pos] == '-') {
                sign = -1;
            } else
                real = ((real << 3) + (real << 1)) + chars[pos] - '0';
        }
        real *= sign;
        sign = 1;
        while (isDigit(chars[++pos])) {
            if (chars[pos] == '-')
                sign = -sign;
            else
                im = ((im << 3) + (im << 1)) + chars[pos] - '0';
        }
        return new int[]{real, im * sign};
    }

    public boolean isDigit(char c) {
        return (c >= '0' && c <= '9') || c == '-';
    }

    public int[] multiplyComplexNumbers(int[] num1, int[] num2) {
        return new int[]{num1[0] * num2[0] - num1[1] * num2[1], num1[1] * num2[0] + num1[0] * num2[1]};
    }

    public String complexNumberToString(int[] num) {
        return new StringBuilder(10).append(num[0]).append('+').append(num[1]).append('i').toString();
    }
}
