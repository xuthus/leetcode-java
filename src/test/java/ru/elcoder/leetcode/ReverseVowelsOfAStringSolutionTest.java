package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseVowelsOfAStringSolutionTest extends TestCase {

    public void testReverseVowels() {
        ReverseVowelsOfAStringSolution solution = new ReverseVowelsOfAStringSolution();

        assertThat(solution.reverseVowels("hEllo")).isEqualTo("hollE");
        assertThat(solution.reverseVowels("hello")).isEqualTo("holle");
        assertThat(solution.reverseVowels("leetcode")).isEqualTo("leotcede");
    }
}