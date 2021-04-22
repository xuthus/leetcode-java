package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 70,
        title = "Climbing Stairs",
        url = "https://leetcode.com/problems/climbing-stairs/"
)
public class ClimbingStairsSolution {
    public int climbStairs(int n) {
        int prev = 1;
        int curr = 1;
        for (int i = 1; i < n; i++) {
            int t = curr;
            curr = curr + prev;
            prev = t;
        }
        return curr;
    }
}
