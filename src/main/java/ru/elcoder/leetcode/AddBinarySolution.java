package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 67,
        title = "Add Binary",
        url = "https://leetcode.com/problems/add-binary/"
)
public class AddBinarySolution {
    public String addBinary(String a, String b) {
        char[] chars1 = a.toCharArray();
        char[] chars2 = b.toCharArray();
        char[] res = new char[Math.max(chars1.length, chars2.length) + 1];
        int i = 0;
        int overflow = 0;
        while (i < chars1.length && i < chars2.length) {
            int sum = chars1[chars1.length - i - 1] - '0' + chars2[chars2.length - i - 1] - '0' + overflow;
            res[res.length - i - 1] = (char) ((sum & 1) + '0');
            overflow = sum >> 1;
            i++;
        }
        if (chars2.length > chars1.length)
            chars1 = chars2;
        while (i < chars1.length) {
            int sum = chars1[chars1.length - i - 1] - '0' + overflow;
            res[res.length - i - 1] = (char) ((sum & 1) + '0');
            overflow = sum >> 1;
            i++;
        }
        if (overflow > 0) {
            res[0] = '1';
            return new String(res);
        }
        return new String(res, 1, res.length - 1);
    }
}
