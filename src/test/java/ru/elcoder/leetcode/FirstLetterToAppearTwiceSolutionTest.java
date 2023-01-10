package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstLetterToAppearTwiceSolutionTest extends TestCase {

    public void testRepeatedCharacter() {
        FirstLetterToAppearTwiceSolution solution = new FirstLetterToAppearTwiceSolution();

        assertThat(solution.repeatedCharacter("hello")).isEqualTo('l');
        assertThat(solution.repeatedCharacter("abccbaacz")).isEqualTo('c');
        assertThat(solution.repeatedCharacter("abcdd")).isEqualTo('d');
        assertThat(solution.repeatedCharacter("aabb")).isEqualTo('a');
    }
}