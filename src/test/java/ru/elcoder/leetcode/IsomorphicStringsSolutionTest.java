package ru.elcoder.leetcode;

import junit.framework.TestCase;

import static org.assertj.core.api.Assertions.assertThat;

public class IsomorphicStringsSolutionTest extends TestCase {

    public void testIsIsomorphic() {
        IsomorphicStringsSolution solution = new IsomorphicStringsSolution();
        boolean isomorphic = solution.isIsomorphic("add", "egg");
        assertThat(isomorphic).isEqualTo(true);

        isomorphic = solution.isIsomorphic("dad", "ege");
        assertThat(isomorphic).isEqualTo(true);

        isomorphic = solution.isIsomorphic("dad", "zaz");
        assertThat(isomorphic).isEqualTo(true);

        isomorphic = solution.isIsomorphic("dad", "zax");
        assertThat(isomorphic).isEqualTo(false);

        isomorphic = solution.isIsomorphic("googla", "beeblc");
        assertThat(isomorphic).isEqualTo(true);

        isomorphic = solution.isIsomorphic("googlo", "beeble");
        assertThat(isomorphic).isEqualTo(true);

        isomorphic = solution.isIsomorphic("googlo", "beebly");
        assertThat(isomorphic).isEqualTo(false);
    }

    public void testIsIsomorphic_Wrong1() {
        IsomorphicStringsSolution solution = new IsomorphicStringsSolution();
        boolean isomorphic = solution.isIsomorphic("bbbaaaba", "aaabbbba");
        assertThat(isomorphic).isEqualTo(false);
    }

    public void testIsIsomorphic_Wrong2() {
        IsomorphicStringsSolution solution = new IsomorphicStringsSolution();
        boolean isomorphic = solution.isIsomorphic("badc", "bada");
        assertThat(isomorphic).isEqualTo(false);
    }

    public void testIsIsomorphic_Wrong3() {
        IsomorphicStringsSolution solution = new IsomorphicStringsSolution();
        boolean isomorphic = solution.isIsomorphic("paper", "title");
        assertThat(isomorphic).isEqualTo(true);
    }
}