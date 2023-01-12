package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class ConvertANumberToHexadecimalSolutionTest extends TestCase {

    public void testToHex() {
        ConvertANumberToHexadecimalSolution solution = new ConvertANumberToHexadecimalSolution();

        assertThat(solution.toHex(-1)).isEqualTo("ffffffff");
        assertThat(solution.toHex(26)).isEqualTo("1a");
        assertThat(solution.toHex(0)).isEqualTo("0");
        assertThat(solution.toHex(-1234)).isEqualTo("fffffb2e");
    }

}
