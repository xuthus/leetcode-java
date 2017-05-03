package ru.elcoder.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by xuthus on 03.05.2017.
 */
public class GroupAnagramsSolutionTest {

    @Test
    public void testGroupAnagrams() throws Exception {
        GroupAnagramsSolution solution = new GroupAnagramsSolution();
        List<List<String>> groups = solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        assertEquals(3, groups.size());
        for (List<String> group : groups) {
            if (group.size() == 1) {
                assertEquals("bat", group.iterator().next());
            } else if (group.size() == 2) {
                String[] words = new String[2];
                Arrays.sort(group.toArray(words));
                assertEquals("nat", words[0]);
                assertEquals("tan", words[1]);
            } else if (group.size() == 3) {
                String[] words = new String[3];
                Arrays.sort(group.toArray(words));
                assertEquals("ate", words[0]);
                assertEquals("eat", words[1]);
                assertEquals("tea", words[2]);
            } else
                fail();
        }
    }
}