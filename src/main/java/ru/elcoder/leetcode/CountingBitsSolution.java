package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

@Difficulty(DifficultyLevel.Medium)
@BeatsPercent(79.08)
public class CountingBitsSolution {

    /*
    Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.

    Example:
    For num = 5 you should return [0,1,1,2,1,2].

    Follow up:

    It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
    Space complexity should be O(n).
    Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.
    https://leetcode.com/problems/counting-bits/
    */
    public int[] countBits(int num) {
        if (num == 0) {
            return new int[]{0};
        }
        int pow2 = getMaxPower2(num);
        int[] res = new int[num + 1];
        genCountsInPlace(pow2, res);
        for (int i = pow2; i <= num; i++) {
            res[i] = res[i - pow2] + 1;
        }
        return res;
    }

    int[] genCountsInPlace(int pow2, int[] arr) {
        if (pow2 == 1) {
            arr[0] = 0;
            return arr;
        }
        final int ofs = pow2 >> 1;
        genCountsInPlace(ofs, arr);
        for (int i = 0; i < ofs; i++) {
            arr[i + ofs] = arr[i] + 1;
        }
        return arr;
    }

    int getMaxPower2(int tmp) {
        int i = 0;
        while (tmp > 0) {
            i++;
            tmp = tmp >>> 1;
        }
        tmp = 1;
        while (--i > 0) {
            tmp = tmp << 1;
        }
        return tmp;
    }

}
