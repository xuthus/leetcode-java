package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 1545,
        title = "Find Kth Bit in Nth Binary String",
        url = "https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/"
)
public class FindKthBitInNthBinaryStringSolution {
    public char findKthBit(int n, int k) {
        String s = generate(n);
        return s.charAt(k - 1);
    }

    String generate(int n) {
        if (n == 1) {
            return "0";
        }
        String tmp = generate(n - 1);
        return tmp + "1" + reverse(invert(tmp));
    }

    String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    String invert(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            ch[i] = ch[i] == '0' ? '1' : '0';
        }
        return new String(ch);
    }
}
