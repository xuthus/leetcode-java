package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 496,
        title = "Next Greater Element I",
        url = "https://leetcode.com/problems/next-greater-element-i/"
)
public class NextGreaterElementISolution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> stack = new LinkedList<>();
        Map<Integer, Integer> max = new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                max.put(nums2[i], -1);
            } else {
                int m = stack.peek();
                while (m < nums2[i]) {
                    stack.pop();
                    if (stack.isEmpty()) {
                        m = -1;
                        break;
                    }
                    m = stack.peek();
                }
                max.put(nums2[i], m);
            }
            stack.push(nums2[i]);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = max.get(nums1[i]);
        }
        return res;
    }
}
