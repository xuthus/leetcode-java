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
        return new int[]{pos4 - (pos4 - pos5 - right0 - 1) - 1, pos2 - (pos2 - pos3 - right0 - 1)};
    }
}
