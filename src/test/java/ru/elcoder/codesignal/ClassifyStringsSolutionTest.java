package ru.elcoder.codesignal;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClassifyStringsSolutionTest {

    @Test
    public void classifyStrings() {
        final ClassifyStringsSolution solution = new ClassifyStringsSolution();
        assertEquals("good", solution.classifyStrings("qwerty"));
        assertEquals("good", solution.classifyStrings("aebcdf"));
        assertEquals("bad", solution.classifyStrings("aeubcdf"));
        assertEquals("bad", solution.classifyStrings("aebcdfr"));
        assertEquals("mixed", solution.classifyStrings("ae?"));
        assertEquals("good", solution.classifyStrings("ab?"));
        assertEquals("good", solution.classifyStrings("?ab?"));
        assertEquals("good", solution.classifyStrings("?ab??"));
        assertEquals("mixed", solution.classifyStrings("?ab???"));
        assertEquals("bad", solution.classifyStrings("?abzxcv???"));
    }
}
