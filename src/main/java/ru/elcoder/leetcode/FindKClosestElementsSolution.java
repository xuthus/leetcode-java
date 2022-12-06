package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 658,
        title = "Find K Closest Elements",
        url = "https://leetcode.com/problems/find-k-closest-elements/"
)
public class FindKClosestElementsSolution {

    // arr is ascending sorted
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int pos = Arrays.binarySearch(arr, x);
        int left, right;
        if (pos < 0) {
            pos = -pos - 1;
        }
        left = Math.max(pos - k, 0);
        right = left + k - 1;
        List<Integer> res = new ArrayList<>();
        while (findClosest(arr, x, left, right + 1) > 0) {
            left++;
            right++;
        }
        for (int i = 0; i < k; i++) {
            res.add(arr[left + i]);
        }
        return res;
    }

    private int findClosest(int[] arr, int x, int left, int right) {
        if (right >= arr.length) {
            return -1;
        }
        return Integer.compare(Math.abs(x - arr[left]), Math.abs(x - arr[right]));
    }

}
