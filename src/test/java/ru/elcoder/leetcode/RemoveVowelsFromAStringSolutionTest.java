package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveVowelsFromAStringSolutionTest extends TestCase {

    public void testRemoveVowels() {
        RemoveVowelsFromAStringSolution solution = new RemoveVowelsFromAStringSolution();

        assertThat(solution.removeVowels("hello")).isEqualTo("hll");
        assertThat(solution.removeVowels("leetcodeisacommunityforcoders")).isEqualTo("ltcdscmmntyfrcdrs");
        assertThat(solution.removeVowels("aeiou")).isEqualTo("");
    }
}