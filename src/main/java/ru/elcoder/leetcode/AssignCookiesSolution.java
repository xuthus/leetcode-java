package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Arrays;

/**
 * <p>Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at
 * most one cookie.</p>
 *
 * <p>Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with;
 * and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i
 * will be content. Your goal is to maximize the number of your content children and output the maximum number.</p>
 */
@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 455,
        title = "Assign Cookies",
        url = "https://leetcode.com/problems/assign-cookies/"
)
public class AssignCookiesSolution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int start = 0;
        int count = 0;
        for (int greed : g) {
            for (int i = start; i < s.length; i++) {
                if (greed <= s[i]) {
                    start = i + 1;
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
