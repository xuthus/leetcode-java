package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstUniqueCharacterInAStringSolutionTest extends TestCase {

    public void testFirstUniqChar() {
        FirstUniqueCharacterInAStringSolution solution = new FirstUniqueCharacterInAStringSolution();

        assertThat(solution.firstUniqChar("leetcode")).isEqualTo(0);
        assertThat(solution.firstUniqChar("loveleetcode")).isEqualTo(2);
        assertThat(solution.firstUniqChar("aabb")).isEqualTo(-1);
    }
}