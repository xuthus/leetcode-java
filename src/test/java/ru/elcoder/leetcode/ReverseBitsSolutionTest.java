package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseBitsSolutionTest {

    @Test
    public void reverseBits1() {
        final ReverseBitsSolution solution = new ReverseBitsSolution();
        assertEquals(0b00111001011110000010100101000000, solution.reverseBits(0b00000010100101000001111010011100));
    }

    @Test
    public void reverseBits2() {
        final ReverseBitsSolution solution = new ReverseBitsSolution();
        assertEquals(0b10111111111111111111111111111111, solution.reverseBits(0b11111111111111111111111111111101));
    }
}