package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

/**
 * <img src="https://assets.leetcode.com/uploads/2018/10/22/rainwatertrap.png"/>
 */
@Leetcode(
        difficulty = DifficultyLevel.Hard,
        number = 42,
        title = "Trapping Rain Water",
        url = "https://leetcode.com/problems/trapping-rain-water/"
)
public class TrappingRainWaterSolution {

    /*
    for each point we must know maximum height on the left side and maximum height on the right side
    and water level at this point will be on minimal value of leftMax and rightMax
    if the point is under the level - we add its deepness to the result

    1. calculate max value on the left - scan from left to right and store to additional array
    2. calculate max value on the right, compare with leftMax for the point and store minimal value (it is water level)
    3. scan source array, compare with water level and calculate total volume
     */

    public int trap(int[] height) {
        int[] levels = new int[height.length];
        // left to right
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            levels[i] = max;
            if (height[i] > max) {
                max = height[i];
            }
        }
        // right to left
        max = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            levels[i] = Math.min(max, levels[i]);
            if (height[i] > max) {
                max = height[i];
            }
        }
        // calculate water volume
        int v = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            v += Math.max(0, levels[i] - height[i]);
        }
        return v;
    }
}
