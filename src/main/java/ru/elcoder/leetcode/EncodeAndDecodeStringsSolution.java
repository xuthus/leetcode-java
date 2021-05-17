package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.LinkedList;
import java.util.List;

@Leetcode(
        difficulty = DifficultyLevel.Medium,
        number = 271,
        title = "Encode and Decode Strings",
        url = "https://leetcode.com/problems/encode-and-decode-strings/"
)
public class EncodeAndDecodeStringsSolution {

    public static class Codec {

        // Encodes a list of strings to a single string.
        public String encode(List<String> strs) {
            int totalLength = 0;
            for (String str: strs)
                totalLength += 2 + str.length();
            StringBuilder sb = new StringBuilder(totalLength);
            for (String str: strs)
                sb.append(encodeLength(str))
                        .append(str);
            return sb.toString();
        }

        private String encodeLength(String str) {
            char c0 = (char) ('0' + (str.length() & 15));
            char c1 = (char) ('0' + (str.length() >> 4));
            return c0 + Character.toString(c1);
        }

        // Decodes a single string to a list of strings.
        public List<String> decode(String s) {
            int pos = 0;
            List<String> res = new LinkedList<>();
            while (pos < s.length()) {
                int strLength = decodeLength(s, pos);
                res.add(s.substring(pos + 2, pos + 2 + strLength));
                pos += 2 + strLength;
            }
            return res;
        }

        private int decodeLength(String s, int pos) {
            int b0 = s.charAt(pos) - '0';
            int b1 = s.charAt(pos + 1) - '0';
            return (b1 << 4) + b0;
        }
    }
}
