package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 1313,
        title = "Decompress Run-Length Encoded List",
        url = "https://leetcode.com/problems/decompress-run-length-encoded-list/"
)
public class DecompressRunLengthEncodedListSolution {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i += 2)
            len += nums[i];
        int[] res = new int[len];
        len = 0;
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++)
                res[len++] = nums[i+1];
        }
        return res;
    }
}
