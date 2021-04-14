package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 1247,
        title = "Minimum Swaps to Make Strings Equal",
        url = "https://leetcode.com/problems/minimum-swaps-to-make-strings-equal/"
)
public class MinimumSwapsToMakeStringsEqualSolution {
    public int minimumSwap(String s1, String s2) {
        int xcnt = 0, ycnt = 0;
        for (int i = 0; i < s1.length(); i++) {
            final char c1 = s1.charAt(i);
            if (c1 != s2.charAt(i)) {
                if (c1 == 'x') {
                    xcnt++;
                } else {
                    ycnt++;
                }
            }
        }
        if ((xcnt + ycnt) == 0) {
            return 0;
        }
        if ((xcnt & 1) != (ycnt & 1)) {
            return -1;
        }
        int cnt = (xcnt >> 1) + (ycnt >> 1);
        if ((xcnt & 1) == 1) {
            cnt += 2;
        }
        return cnt;
    }
}
