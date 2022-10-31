package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.VersionControl;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 278,
        title = "First Bad Version",
        url = "https://leetcode.com/problems/first-bad-version/"
)
public class FirstBadVersionSolution extends VersionControl {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
    public int firstBadVersion(int n) {
        if (isBadVersion(1)) {
            return 1;
        }
        long min = 1;
        long max = n;
        int res = -1;
        while (min < max) {
            long mid = (max + min + 1) / 2;
            if (isBadVersion((int) mid)) {
                max = mid - 1;
                res = (int) mid;
            } else {
                min = mid;
            }
        }
        return res;
    }
}
