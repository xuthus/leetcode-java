package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

/**
 * Created by xuthus on 05.07.2017.
 */
@Difficulty(DifficultyLevel.Medium)
@BeatsPercent(97.84)
public class FractionAdditionAndSubtractionSolution {
    private static int calcMostDivider(int min, int max) {
        if (min < 0) min = -min;
        if (max < 0) max = -max;
        while (min != 0 && max != 0) {
            if (min > max)
                min = min % max;
            else
                max = max % min;
        }
        return min + max;
    }

    private static int[] addFractions(int[] a, int[] b) {
        int numerator = a[0] * b[1] + b[0] * a[1];
        int denominator = a[1] * b[1];
        int[] result = denominator < 0 ? new int[]{-numerator, -denominator} : new int[]{numerator, denominator};
        int divider = calcMostDivider(result[0], result[1]);
        if (divider != 1)
            for (int i = 0; i < result.length; i++)
                result[i] = result[i] / divider;
        return result;
    }

    /*
    Given a string representing an expression of fraction addition and subtraction, you need to return the calculation
    result in string format. The final result should be irreducible fraction. If your final result is an integer, say
    2, you need to change it to the format of fraction that has denominator 1. So in this case, 2 should be converted
    to 2/1.
    Example 1:
        Input:"-1/2+1/2"
        Output: "0/1"
    Example 2:
        Input:"-1/2+1/2+1/3"
        Output: "1/3"
    Example 3:
        Input:"1/3-1/2"
        Output: "-1/6"
    Example 4:
        Input:"5/3+1/3"
        Output: "2/1"
    Note:
        The input string only contains '0' to '9', '/', '+' and '-'. So does the output.
        Each fraction (input and output) has format ±numerator/denominator. If the first input fraction or the output
        is positive, then '+' will be omitted.
        The input only contains valid irreducible fractions, where the numerator and denominator of each fraction will
        always be in the range [1,10]. If the denominator is 1, it means this fraction is actually an integer in a
        fraction format defined above.
        The number of given fractions will be in the range [1,10].
        The numerator and denominator of the final result are guaranteed to be valid and in the range of 32-bit int.
    https://leetcode.com/problems/fraction-addition-and-subtraction/
    */
    public String fractionAddition(String expression) {
        char[] s = expression.toCharArray();
        int pos = 0;
        int sign = 1;
        int[] fraction = null;
        for (; ; ) {
            int num = 0;
            boolean digits = false;
            while (s[pos] == '-' || (s[pos] >= '0' && s[pos] <= '9')) {
                if (s[pos] == '-' && digits)
                    break;
                if (s[pos] == '-')
                    sign = -sign;
                else {
                    num = ((num << 3) + (num << 1)) + s[pos] - '0';
                    digits = true;
                }
                pos++;
            }
            pos++;
            int denom = 0;
            digits = false;
            while (pos < s.length && (s[pos] == '-' || (s[pos] >= '0' && s[pos] <= '9'))) {
                if (s[pos] == '-' && digits)
                    break;
                if (s[pos] == '-')
                    sign = -sign;
                else {
                    denom = ((denom << 3) + (denom << 1)) + s[pos] - '0';
                    digits = true;
                }
                pos++;
            }
            if (fraction == null)
                fraction = new int[]{sign * num, denom};
            else
                fraction = addFractions(fraction, new int[]{sign * num, denom});
            if (pos < s.length) {
                sign = s[pos] == '-' ? -1 : 1;
                pos++;
            } else
                break;
        }
        return fraction[0] + "/" + fraction[1];
    }

}
