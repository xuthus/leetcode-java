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
        int[] maxValues = new int[height.length];
        int max = Integer.MIN_VALUE;
        for (int i = maxValues.length - 1; i >= 0; i--) {
            if (height[i] > max) {
                max = height[i];
            }
            maxValues[i] = max;
        }
        int maxVolume = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
            int maxPos = findMaxFromRight(i, maxValues);
            int volume = (maxPos - i) * height[i];
            if (volume > maxVolume) {
                maxVolume = volume;
            }
        }
        maxValues = new int[height.length];
        max = Integer.MIN_VALUE;
        for (int i = 0; i < maxValues.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
            maxValues[i] = max;
        }
        for (int i = height.length - 1; i >= 0; i--) {
            int maxPos = findMaxFromLeft(i, maxValues);
            int volume = (i - maxPos) * height[i];
            if (volume > maxVolume) {
                maxVolume = volume;
            }
        }
        return maxVolume;
    }

    private int findMaxFromLeft(int p, int[] heights) {
        Arrays.binarySearch(heights, p, )
        for (int i = 0; i < heights.length; i++) { // TODO: 4/23/2021 add binary search
            if (heights[i] >= heights[p]) {
                return i;
            }
        }
        return p;
    }

    private int findMaxFromRight(int p, int[] heights) {
        for (int i = heights.length - 1; i >= p; i--) { // TODO: 4/23/2021 add binary search
            if (heights[i] >= heights[p]) {
                return i;
            }
        }
        return p;
    }
}
