package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.timer.Timer;

import java.security.SecureRandom;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.utils.Utils.arrayOf;

public class NumberOfMatchingSubsequencesSolutionTest {

    @Test
    public void numMatchingSubseq() {
        assertEquals(3, new NumberOfMatchingSubsequencesSolution().numMatchingSubseq(
                "abcde",
                arrayOf("a", "bb", "acd", "ace")
        ));
        assertEquals(2, new NumberOfMatchingSubsequencesSolution().numMatchingSubseq(
                "dsahjpjauf",
                arrayOf("ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax")
        ));
    }

    @Test
    public void numMatchingSubseqTimings() {
        final SecureRandom random = new SecureRandom(new byte[] {1, 3, 5, 7, 9, 11});
        String s = getRandomString(random, 50000);
        final ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            words.add(getRandomString(random, 50));
        }

        Timer.measure("matching subsequences", () -> {
            assertEquals(5000, new NumberOfMatchingSubsequencesSolution().numMatchingSubseq(
                    s,
                    words.toArray(new String[0])
            ));
        });
    }

    private String getRandomString(SecureRandom random, int len) {
        final StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append((char) (random.nextInt(26) + 'a'));
        }
        return sb.toString();
    }
}