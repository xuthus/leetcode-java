package ru.elcoder.codesignal;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmendTheSentenceSolutionTest {

    @Test
    public void amendTheSentence() {
        final AmendTheSentenceSolution solution = new AmendTheSentenceSolution();
        assertEquals("hello", solution.amendTheSentence("Hello"));
        assertEquals("hello", solution.amendTheSentence("hello"));
        assertEquals("hello world", solution.amendTheSentence("HelloWorld"));
        assertEquals("codesignal is awesome", solution.amendTheSentence("CodesignalIsAwesome"));
    }
}
