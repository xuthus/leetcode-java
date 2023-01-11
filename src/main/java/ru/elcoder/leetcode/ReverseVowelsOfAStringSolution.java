package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 345,
        title = "Reverse Vowels of a String",
        url = "https://leetcode.com/problems/reverse-vowels-of-a-string/"
)
public class ReverseVowelsOfAStringSolution {
    static boolean[] isVowel = new boolean[127];

    static {
        for (char c : new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U',}) {
            isVowel[c] = true;
        }
    }

    public String reverseVowels(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        char[] chars = s.toCharArray();
        int i0 = 0;
        int i1 = chars.length - 1;
        while (true) {
            while (i0 <= i1 && !isVowel[chars[i0]])
                i0++;
            while (i1 >= i0 && !isVowel[chars[i1]])
                i1--;
            if (i0 >= i1)
                break;
            char tmp = chars[i0];
            chars[i0] = chars[i1];
            chars[i1] = tmp;
            i0++;
            i1--;
        }
        return new String(chars);
    }
}
