package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class RestoreIpAddressSolutionTest {

    @Test
    public void restoreIpAddresses() {
        final RestoreIpAddressSolution solution = new RestoreIpAddressSolution();
        assertArrayEquals(arrayOf("1.1.1.1"), solution.restoreIpAddresses("1111").toArray());
        assertArrayEquals(arrayOf("1.0.1.11", "1.0.11.1", "10.1.1.1"), solution.restoreIpAddresses("10111").toArray());
        assertArrayEquals(arrayOf("255.255.11.135", "255.255.111.35"), solution.restoreIpAddresses("25525511135").toArray());
        assertArrayEquals(arrayOf("0.0.0.0"), solution.restoreIpAddresses("0000").toArray());
        assertArrayEquals(arrayOf("0.10.0.10", "0.100.1.0"), solution.restoreIpAddresses("010010").toArray());
        assertArrayEquals(arrayOf("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3"), solution.restoreIpAddresses("101023").toArray());
    }
}