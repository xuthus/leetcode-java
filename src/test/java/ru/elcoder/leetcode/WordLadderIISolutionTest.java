package ru.elcoder.leetcode;

import org.junit.Test;
import ru.elcoder.leetcode.utils.Utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WordLadderIISolutionTest {

    @Test
    public void findLadders0() {
        WordLadderIISolution solution = new WordLadderIISolution();
        List<List<String>> ladders = solution.findLadders("hit", "cat", Arrays.asList("hat", "cat", "cut"));
        assertEquals(1, ladders.size());
        assertTrue(ladders.get(0).contains("hat"));
        assertTrue(ladders.get(0).contains("cat"));
        assertEquals(3, ladders.get(0).size());
    }

    @Test
    public void findLadders1() {
        WordLadderIISolution solution = new WordLadderIISolution();
        List<List<String>> ladders = solution.findLadders("hit", "cog",
                Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
        assertEquals(2, ladders.size());
        assertEquals(5, ladders.get(0).size());
        assertEquals(5, ladders.get(1).size());
    }

    @Test
    public void findLadders2() {
        WordLadderIISolution solution = new WordLadderIISolution();
        List<List<String>> ladders = solution.findLadders("hit", "cog",
                Arrays.asList("hot", "dot", "dog", "lot", "log"));
        assertEquals(0, ladders.size());
    }

    @Test
    public void findLadders3() {
        WordLadderIISolution solution = new WordLadderIISolution();
        List<List<String>> ladders = solution.findLadders("hit", "cog",
                Arrays.asList("hot", "dog", "hox", "log", "cog"));
        assertEquals(0, ladders.size());
    }

    @Test
    public void findLadders4_Long() {
        WordLadderIISolution solution = new WordLadderIISolution();
        List<String> strings = Arrays.stream(Utils.readStringFromResources("ladderII.txt").split(","))
                .map(s -> s.substring(1, s.length() - 1))
                .collect(Collectors.toList());
        List<List<String>> ladders = solution.findLadders("cet", "ism", strings);
        assertEquals(3, ladders.size());
    }
}