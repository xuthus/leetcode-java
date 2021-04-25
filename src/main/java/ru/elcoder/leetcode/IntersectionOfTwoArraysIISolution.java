package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 350,
        title = "Intersection of Two Arrays II",
        url = "https://leetcode.com/problems/intersection-of-two-arrays-ii/"
)
public class IntersectionOfTwoArraysIISolution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] numsA = new int[1001];
        int[] numsB = new int[1001];
        for (int i : nums1)
            numsA[i]++;
        int cnt = 0;
        for (int i : nums2) {
            numsB[i]++;
            if (numsB[i] <= numsA[i])
                cnt++;
        }
        int[] result = new int[cnt];
        int p = 0;
        for (int i = 0; i < numsA.length; i++) {
            if (numsA[i] > 0) {
                int max = Math.min(numsA[i], numsB[i]);
                for (int j = 0; j < max; j++)
                    result[p++] = i;
            }
        }
        return result;
    }
}
