package ru.elcoder.stepik.algorithms.huffman;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class DecoderSolutionTest {

    @Test
    public void testDecode_1() {
        final DecoderSolution solution = new DecoderSolution();
        assertEquals("a", solution.decode("1", 0, sort(Arrays.asList(
                new DecoderSolution.CharFrequency('a', "1")
        ))));
    }

    @Test
    public void testDecode_1111() {
        final DecoderSolution solution = new DecoderSolution();
        assertEquals("aaaa", solution.decode("1111", 0, sort(Arrays.asList(
                new DecoderSolution.CharFrequency('a', "1")
        ))));
    }

    @Test
    public void testDecode_12() {
        final DecoderSolution solution = new DecoderSolution();
        assertEquals("ab", solution.decode("12", 0, sort(Arrays.asList(
                new DecoderSolution.CharFrequency('a', "1"),
                new DecoderSolution.CharFrequency('b', "2")
        ))));
    }

    @Test
    public void testDecode_1211() {
        final DecoderSolution solution = new DecoderSolution();
        assertEquals("abaa", solution.decode("1211", 0, sort(Arrays.asList(
                new DecoderSolution.CharFrequency('a', "1"),
                new DecoderSolution.CharFrequency('b', "2")
        ))));
    }

    @Test
    public void testDecode_000111011110() {
        final DecoderSolution solution = new DecoderSolution();
        assertEquals("abcde", solution.decode("000111011110", 0, sort(Arrays.asList(
                new DecoderSolution.CharFrequency('a', "00"),
                new DecoderSolution.CharFrequency('b', "01"),
                new DecoderSolution.CharFrequency('e', "10"),
                new DecoderSolution.CharFrequency('c', "110"),
                new DecoderSolution.CharFrequency('d', "111")
        ))));
    }

    @Test
    public void testDecode_110110001100101() {
        final DecoderSolution solution = new DecoderSolution();
        assertEquals("aabacaadb", solution.decode("110110001100101", 0, sort(Arrays.asList(
                new DecoderSolution.CharFrequency('a', "1"),
                new DecoderSolution.CharFrequency('b', "01"),
                new DecoderSolution.CharFrequency('c', "000"),
                new DecoderSolution.CharFrequency('d', "001")
        ))));
    }

    private List<DecoderSolution.CharFrequency> sort(List<DecoderSolution.CharFrequency> list) {
        Collections.sort(list, DecoderSolution.CharFrequency::compareTo);
        return list;
    }

}
