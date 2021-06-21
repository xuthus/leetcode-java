package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 1906,
        title = "Minimum Absolute Difference Queries",
        url = "https://leetcode.com/problems/minimum-absolute-difference-queries/"
)
public class MinimumAbsoluteDifferenceQueriesSolution {
    public int[] minDifference(int[] nums, int[][] queries) {
        List<Integer>[] positions = new List[101];
        for (int i = 0; i < positions.length; i++) {
            positions[i] = new ArrayList<>();
        }
        for (int i = 0; i < nums.length; i++) {
            positions[nums[i]].add(i);
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++)
            res[i] = minDiff(queries[i][0], queries[i][1], positions);
        return res;
    }

    int minDiff(int from, int to, List<Integer>[] positions) {
        boolean[] flag = new boolean[101];
        for (int i = 0; i < positions.length; i++) {
            final int p1 = Collections.binarySearch(positions[i], from);
            final int p2 = Collections.binarySearch(positions[i], to);
            flag[i] = !(p1 < 0 && p2 < 0 && p1 == p2);
        }
        return minDist(flag);
    }

    int minDist(boolean[] flag) {
        int res = 100;
        int pos = -1;
        for (int i = 1; i <= 100; i++) {
            if (flag[i]) {
                if (pos > -1)
                    res = Math.min(res, i - pos);
                pos = i;
            }
        }
        return res == 100 ? -1 : res;
    }
}
