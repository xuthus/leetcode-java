package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class Base7SolutionTest extends TestCase {

    public void testConvertToBase7() {
        Base7Solution solution = new Base7Solution();

        assertThat(solution.convertToBase7(1)).isEqualTo("1");
        assertThat(solution.convertToBase7(6)).isEqualTo("6");
        assertThat(solution.convertToBase7(7)).isEqualTo("10");
        assertThat(solution.convertToBase7(8)).isEqualTo("11");
        assertThat(solution.convertToBase7(48)).isEqualTo("66");
        assertThat(solution.convertToBase7(49)).isEqualTo("100");
        assertThat(solution.convertToBase7(-49)).isEqualTo("-100");
        assertThat(solution.convertToBase7(-48)).isEqualTo("-66");
        assertThat(solution.convertToBase7(0)).isEqualTo("0");
    }
}