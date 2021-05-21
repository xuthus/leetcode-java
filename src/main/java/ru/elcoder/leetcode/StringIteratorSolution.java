package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 604,
        title = "String Iterator",
        url = "https://leetcode.com/problems/design-compressed-string-iterator/"
)
public class StringIteratorSolution {

    static class StringIterator {
        char[] chars;
        int[] lens;
        int p1 = 0, p2 = 0;

        public StringIterator(String compressedString) {
            // count letters
            int len = 0;
            for (int i = 0; i < compressedString.length(); i++) {
                char c = compressedString.charAt(i);
                if (c < '0' || c > '9')
                    len++;
            }
            chars = new char[len];
            lens = new int[len];
            len = 0;
            int j = 0;
            for (int i = 0; i < compressedString.length(); i++) {
                char c = compressedString.charAt(i);
                if (c >= '0' && c <= '9')
                    len = len * 10 + (c - '0');
                else {
                    chars[j++] = c;
                    if (len > 0) {
                        lens[j - 2] = len;
                        len = 0;
                    }
                }
            }
            lens[j - 1] = len;
        }

        public char next() {
            if (!hasNext())
                return ' ';
            if (p2 == lens[p1]) {
                p1++;
                p2 = 0;
            }
            p2++;
            return chars[p1];
        }

        public boolean hasNext() {
            return !(p1 >= chars.length || p1 == chars.length - 1 && p2 == lens[p1]);
        }
    }
}
