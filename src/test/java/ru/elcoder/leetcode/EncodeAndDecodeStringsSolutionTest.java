package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.EncodeAndDecodeStringsSolution.Codec;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class EncodeAndDecodeStringsSolutionTest {

    @Test
    public void testEncoder() {
        Codec codec = new Codec();
        assertEquals(Arrays.asList("hello", "world"), codec.decode(codec.encode(Arrays.asList("hello", "world"))));
        assertEquals(Arrays.asList("hello", "world", "", "!"), codec.decode(codec.encode(Arrays.asList("hello", "world", "", "!"))));
    }
}