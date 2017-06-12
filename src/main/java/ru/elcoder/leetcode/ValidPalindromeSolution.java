package ru.elcoder.leetcode;

/**
 * Created by xuthus on 01.05.2017.
 */
public class ValidPalindromeSolution {
    /*
    Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

    For example,
    "A man, a plan, a canal: Panama" is a palindrome.
    "race a car" is not a palindrome.

    Note:
    Have you consider that the string might be empty? This is a good question to ask during an interview.

    For the purpose of this problem, we define empty string as valid palindrome.
    https://leetcode.com/problems/valid-palindrome/
    https://leetcode.com/problems/valid-palindrome/
    */
    public boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1)
            return true;
        char[] chars = s.toCharArray();
        char[] clean = new char[chars.length];
        int pos = 0;
        for (char c : chars) {
            if (c >= '0' && c <= '9' || c >= 'a' && c <= 'z') {
                clean[pos++] = c;
            } else if (c >= 'A' && c <= 'Z') {
                clean[pos++] = (char) (c + 32);
            }
        }
        for (int i = 0, j = pos - 1; i < j; i++, j--)
            if (clean[i] != clean[j])
                return false;
        return true;
    }
}
