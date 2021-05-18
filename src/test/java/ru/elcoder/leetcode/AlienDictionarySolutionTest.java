package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class AlienDictionarySolutionTest {

    @Test
    public void alienOrder() {
        final AlienDictionarySolution solution = new AlienDictionarySolution();
        assertEquals("wertf", solution.alienOrder(arrayOf("wrt", "wrf", "er", "ett", "rftt")));
        assertEquals("", solution.alienOrder(arrayOf("a", "b", "c", "a")));
        assertEquals("", solution.alienOrder(arrayOf("qwa", "qwb", "qwc", "qwa")));
        assertEquals("zx", solution.alienOrder(arrayOf("z", "x")));
        assertEquals("azx", solution.alienOrder(arrayOf("az", "ax")));
        assertEquals("", solution.alienOrder(arrayOf("z", "x", "z")));
        assertEquals("", solution.alienOrder(arrayOf("az", "ax", "az")));
        assertEquals("", solution.alienOrder(arrayOf("")));
        assertEquals("z", solution.alienOrder(arrayOf("z")));
        assertEquals("z", solution.alienOrder(arrayOf("z", "z")));
        assertEquals("za", solution.alienOrder(arrayOf("az", "az")));
        assertEquals("", solution.alienOrder(arrayOf(
                "u", "z", "m", "e", "m", "n", "j", "a", "h"
        )));
        assertEquals("", solution.alienOrder(arrayOf(
                "uetpcqni", "zpjxtcgcaj", "myriicaowt", "epanjnops", "mfx", "nlfkow", "jgnflgej", "ahtdeklrlw", "hmlecdyjew"
        )));
    }

    @Test
    public void alienOrderStrangeCase() {
        final AlienDictionarySolution solution = new AlienDictionarySolution();
        assertEquals("", solution.alienOrder(arrayOf(
                "u", "z", "m", "e", "m", "n", "j", "a", "h"
        )));
    }

    @Test
    public void alienOrderWrongOrder() {
        final AlienDictionarySolution solution = new AlienDictionarySolution();
        assertEquals("", solution.alienOrder(arrayOf("azc", "az")));
    }
}
