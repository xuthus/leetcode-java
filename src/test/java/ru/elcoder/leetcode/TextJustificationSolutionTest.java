package ru.elcoder.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by xuthus on 05.05.2017.
 */
public class TextJustificationSolutionTest {

    @Test
    public void testFullJustify() throws Exception {
        TextJustificationSolution solution = new TextJustificationSolution();
        List<String> lines = solution.fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16);
        assertArrayEquals(new String[]{"This    is    an", "example  of text", "justification.  "}, lines.toArray(new String[0]));

        lines = solution.fullJustify(new String[]{"My", "momma", "always", "said,", "\"Life", "was", "like", "a", "box", "of", "chocolates.", "You", "never", "know", "what", "you're", "gonna", "get."}, 20);
        assertArrayEquals(new String[]{"My    momma   always", "said, \"Life was like", "a box of chocolates.", "You  never know what", "you're gonna get.   "}, lines.toArray(new String[0]));

        lines = solution.fullJustify(new String[]{"What", "must", "be", "shall", "be."}, 12);
        assertArrayEquals(new String[]{"What must be", "shall be.   "}, lines.toArray(new String[0]));

        lines = solution.fullJustify(new String[]{"This"}, 4);
        assertArrayEquals(new String[]{"This"}, lines.toArray(new String[0]));

        lines = solution.fullJustify(new String[]{"to", "a", "few."}, 6);
        assertArrayEquals(new String[]{"to   a", "few.  "}, lines.toArray(new String[0]));

        lines = solution.fullJustify(new String[]{"Listen", "to", "many,", "speak", "to", "a", "few."}, 6);
        assertArrayEquals(new String[]{"Listen", "to    ", "many, ", "speak ", "to   a", "few.  "}, lines.toArray(new String[0]));

        lines = solution.fullJustify(new String[]{"This"}, 6);
        assertArrayEquals(new String[]{"This  "}, lines.toArray(new String[0]));

        lines = solution.fullJustify(new String[]{"This", "is"}, 6);
        assertArrayEquals(new String[]{"This  ", "is    "}, lines.toArray(new String[0]));

        lines = solution.fullJustify(new String[]{""}, 6);
        assertArrayEquals(new String[]{"      "}, lines.toArray(new String[0]));

        lines = solution.fullJustify(new String[]{"hello"}, 3);
        assertArrayEquals(new String[]{"hello"}, lines.toArray(new String[0]));

        lines = solution.fullJustify(new String[]{"hello"}, 0);
        assertArrayEquals(new String[]{"hello"}, lines.toArray(new String[0]));

        lines = solution.fullJustify(new String[]{""}, 0);
        assertArrayEquals(new String[]{""}, lines.toArray(new String[0]));

        lines = solution.fullJustify(new String[]{}, 6);
        assertArrayEquals(new String[]{}, lines.toArray(new String[0]));
    }

}