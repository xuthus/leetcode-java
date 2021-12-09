package ru.elcoder.stepik.algorithms.huffman;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class EncoderSolutionTest {

    @Test
    public void testEncode_aabacaadb() {
        final EncoderSolution solution = new EncoderSolution();
        final List<String> res = solution.encode("aabacaadb");
        assertEquals(6, res.size());
        assertEquals("4 15", res.get(0));
        assertEquals("110110001100101", res.get(res.size() - 1));
    }

    @Test
    public void testEncode_aa() {
        final EncoderSolution solution = new EncoderSolution();
        final List<String> res = solution.encode("aa");
        assertEquals(3, res.size());
        assertEquals("1 2", res.get(0));
        assertEquals("11", res.get(res.size() - 1));
    }

    @Test
    public void testEncode_aab() {
        final EncoderSolution solution = new EncoderSolution();
        final List<String> res = solution.encode("aab");
        assertEquals(4, res.size());
        assertEquals("2 3", res.get(0));
        assertEquals("110", res.get(res.size() - 1));
    }

    @Test
    public void testEncode_aabc() {
        final EncoderSolution solution = new EncoderSolution();
        final List<String> res = solution.encode("aabc");
        assertEquals(5, res.size());
        assertEquals("3 6", res.get(0));
        assertEquals("110001", res.get(res.size() - 1));
    }

    @Test
    public void testEncode_abc() {
        final EncoderSolution solution = new EncoderSolution();
        final List<String> res = solution.encode("abc");
        assertEquals(5, res.size());
        assertEquals("3 5", res.get(0));
        assertEquals("10110", res.get(res.size() - 1));
    }

    @Test
    public void testEncode_abcd() {
        final EncoderSolution solution = new EncoderSolution();
        final List<String> res = solution.encode("abcd");
        assertEquals(6, res.size());
        assertEquals("4 8", res.get(0));
        assertEquals("00011011", res.get(res.size() - 1));
    }

    @Test
    public void testEncode_abcde() {
        final EncoderSolution solution = new EncoderSolution();
        final List<String> res = solution.encode("abcde");
        assertEquals(7, res.size());
        assertEquals("5 12", res.get(0));
        assertEquals("000111011110", res.get(res.size() - 1));
    }

    @Test
    public void testEncode_100a() {
        final EncoderSolution solution = new EncoderSolution();
        final StringBuilder str = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            str.append('a');
        }
        final List<String> res = solution.encode(str.toString());
        assertEquals(3, res.size());
        assertEquals("1 100", res.get(0));
        assertEquals("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", res.get(res.size() - 1));
    }

    @Test
    public void testEncode_100a100b() {
        final EncoderSolution solution = new EncoderSolution();
        final StringBuilder str = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            str.append('a');
            str.append('b');
        }
        final List<String> res = solution.encode(str.toString());
        assertEquals(4, res.size());
        assertEquals("2 200", res.get(0));
        assertEquals("01010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101", res.get(res.size() - 1));
    }

    @Test
    public void testEncode_LoremIpsum() {
        final EncoderSolution solution = new EncoderSolution();
        final List<String> res = solution.encode("Lorem ipsum dolor sit amet, consectetur adipisicing elit. Delectus eligendi illum iste omnis voluptatum. Aspernatur atque, aut autem culpa dolorem eveniet hic illum neque nesciunt, officiis possimus repudiandae voluptate voluptatem!");
        assertEquals(28, res.size());
        assertEquals("26 970", res.get(0));
        assertEquals("1010010100111010101000011001111110100111110000011000000100110110001110101100011111111110100001000010101110101000100101110011110110111010101111110010111011001010110000100000111111101011110111111110111111111011101100110001001101111111010100111001010010001001100101011111101100011110001001101111101100101011011000011111100111101100110110000011001111011111100101000011000111011111101111001011010011011011001101011100010111011000001101001110000000111011111010010101011101100101110110010101100001011100000001100010101000100001011001110100001011001110010000110010111110001101101000101000000100110110001110101010000110001010110101011011111101011101000000010111110111100111101100110110000011001101101000000011000101001101101001111011111111100110111110101000100001110110001011000111110111111111110111100110100011011101111111000111000111100101010101101011000000111110010110110000100100101001011010011011011001101011100010111001010010110100110110110011010111000101110010000100000110", res.get(res.size() - 1));
    }
}
