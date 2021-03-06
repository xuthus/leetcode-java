package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

/**
 * <p>You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers
 * cannot be planted in adjacent plots.</p>
 *
 * <p>Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and
 * an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers
 * rule.</p>
 */
@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 605,
        title = "Can Place Flowers",
        url = "https://leetcode.com/problems/can-place-flowers/"
)
public class CanPlaceFlowersSolution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int gapStart = -1;
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] != 0) {
                if (gapStart >= 0) {
                    int gapLen = i - gapStart;
                    if (gapStart == 0) {
                        gapLen++;
                    }
                    count += (gapLen - 1) >> 1;
                }
                gapStart = -1;
            } else {
                if (gapStart < 0) {
                    gapStart = i;
                }
            }
        }
        if (gapStart >= 0) {
            int gapLen = flowerbed.length - gapStart;
            if (gapStart == 0) {
                gapLen++;
            }
            count += gapLen >> 1;
        }
        return count >= n;
    }
}
