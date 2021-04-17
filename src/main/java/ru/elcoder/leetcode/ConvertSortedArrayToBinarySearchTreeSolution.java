package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;
import ru.elcoder.leetcode.models.TreeNode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 108,
        title = "Convert Sorted Array to Binary Search Tree",
        url = "https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/"
)
public class ConvertSortedArrayToBinarySearchTreeSolution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return newNode(nums, 0, nums.length - 1);
    }

    private TreeNode newNode(int[] nums, int p1, int p2) {
        if (p1 == p2)
            return new TreeNode(nums[p1]);
        int mid = (p1 + p2 + 1) >> 1;
        return new TreeNode(nums[mid],
                p1 == mid ? null : newNode(nums, p1, mid - 1),
                p2 == mid ? null : newNode(nums, mid + 1, p2)
        );
    }
}
