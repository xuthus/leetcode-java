package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Hard,
        number = 927,
        title = "Three Equal Parts",
        url = "https://leetcode.com/problems/three-equal-parts/"
)
public class ThreeEqualPartsSolution {
    private static final int[] WRONG = new int[]{-1, -1};

    // 000..10101..000..10101..000..10101..000
    //      p6  p5      p4  p3      p2  p1
    //                                   right0s
    // p5 - p4 >= right0s
    // p3 - p2 >= right0s
    // return {p4 + (p5-p4 - right0s), p2 + (p3-p2 - right0s)}

    public int[] threeEqualParts(int[] arr) {
        if (arr.length < 3)
            return WRONG;
        int cnt1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                cnt1++;
        }
        if (cnt1 == 0)
            return new int[] {0, arr.length - 1};
        if (cnt1 % 3 != 0)
            return WRONG;
        int cnt = cnt1 / 3, pos2 = -1, right0 = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                if (right0 == -1)
                    right0 = arr.length - 1 - i;
                cnt--;
                if (cnt == 0) {
                    pos2 = i;  // start of most left 1's of 3rd number. There are may be 0's at left.
                    break;
                }
            }
        }
        // find most right 1's of 2nd number
        int pos3 = -1;
        for (int i = pos2 - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                pos3 = i;
                break;
            }
        }
        // find most left 1's of 2nd number
        int pos4 = -1;
        cnt = cnt1 / 3;
        for (int i = pos3; i >= 0; i--) {
            if (arr[i] == 1) {
                cnt--;
                if (cnt == 0) {
                    pos4 = i;
                    break;
                }
            }
        }
        // find most right 1's of 1st number
        int pos5 = -1;
        for (int i = pos4 - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                pos5 = i;
                break;
            }
        }
        // p5 - p4 >= right0s
        if ((pos4 - pos5 - 1) < right0)
            return WRONG;
        // p3 - p2 >= right0s
        if ((pos2 - pos3 - 1) < right0)
            return WRONG;
        final int endOf1st = pos4 - (pos4 - pos5 - right0 - 1) - 1;
        final int beginOf3rd = pos2 - (pos2 - pos3 - right0 - 1);
        if (!sameNumbers(arr, 0, endOf1st, endOf1st + 1, beginOf3rd - 1)) {
            return WRONG;
        }
        if (!sameNumbers(arr, endOf1st + 1, beginOf3rd - 1, beginOf3rd, arr.length - 1)) {
            return WRONG;
        }
        return new int[]{endOf1st, beginOf3rd};
    }

    private boolean sameNumbers(int[] arr, int from1, int to1, int from2, int to2) {
        int p1 = to1;
        int p2 = to2;
        while (p1 >= from1 && p2 >= from2) {
            if (arr[p1] != arr[p2])
                return false;
            p1--;
            p2--;
        }
        return true;
    }
}
