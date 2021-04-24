package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class UniqueEmailAddressesSolutionTest {

    @Test
    public void numUniqueEmails() {
        final UniqueEmailAddressesSolution solution = new UniqueEmailAddressesSolution();
        assertEquals(3, solution.numUniqueEmails(arrayOf("a@leetcode.com", "b@leetcode.com", "c@leetcode.com")));
        assertEquals(3, solution.numUniqueEmails(arrayOf("test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com")));
    }
}