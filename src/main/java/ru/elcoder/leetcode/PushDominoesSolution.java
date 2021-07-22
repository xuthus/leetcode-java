package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 838,
        title = "Push Dominoes",
        url = "https://leetcode.com/problems/push-dominoes/"
)
public class PushDominoesSolution {
    public String pushDominoes(String dominoes) {
        // find first pushed domino i1
        // mark all dominoes on the left side of i1 as either 'L' if dominoes[i1] == 'L' or '.' otherwise
        // while (find next pushed domino i2) != -1:
        //      mark all dominoes between i1 and i2 using two pointers approach
        //      i1 = i2
        // mark all dominoes on the right side of i1 as either 'R' if dominoes[i1] == 'R' or '.' otherwise
        // corner cases: no pushed dominoes, 1 pushed domino, pushed dominoes on both ends of string, pushed neighbor dominoes
        // work with array of chars, construct string on return
        char[] chars = dominoes.toCharArray();
        int i1 = -1, i2 = -1;
        i1 = findPushed(chars, 0);
        if (i1 == -1)
            return dominoes;
        if (chars[i1] == 'L')
            Arrays.fill(chars, 0, i1, 'L');
        // while (find next pushed domino i2) != -1:
        while ((i2 = findPushed(chars, i1 + 1)) != -1) {
            // mark all dominoes between i1 and i2 using two pointers approach
            if (chars[i1] == chars[i2])
                Arrays.fill(chars, i1, i2, chars[i2]);
            else if (chars[i1] == 'R' /* && chars[i2] == 'L' */)
                fillTwoPointers(chars, i1, i2);
            i1 = i2;
        }
        if (chars[i1] == 'R')
            Arrays.fill(chars, i1, chars.length, 'R');
        return new String(chars);
    }

    private void fillTwoPointers(char[] chars, int i1, int i2) {
        char c1 = chars[i1];
        char c2 = chars[i2];
        while (i1 < i2) {
            chars[i1] = c1;
            chars[i2] = c2;
            i1++;
            i2--;
        }
    }

    private int findPushed(char[] chars, int fromPos) {
        while (fromPos < chars.length && chars[fromPos] == '.')
            fromPos++;
        return fromPos < chars.length ? fromPos : -1;
    }
}
