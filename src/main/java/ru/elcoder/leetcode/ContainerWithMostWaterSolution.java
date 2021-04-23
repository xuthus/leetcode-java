package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 11,
        title = "Container With Most Water",
        url = "https://leetcode.com/problems/container-with-most-water/"
)
public class ContainerWithMostWaterSolution {

    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j;) {
            int area = (j - i) * Math.min(height[i], height[j]);
            max = Math.max(max, area);
            if (height[i] < height[j])
                i++;
            else if (height[i] > height[j])
                j--;
            else {
                i++;
                j--;
            }
        }
        return max;
    }
}
