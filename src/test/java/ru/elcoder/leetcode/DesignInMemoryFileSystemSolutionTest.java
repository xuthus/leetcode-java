package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;
import static ru.elcoder.leetcode.DesignInMemoryFileSystemSolution.*;

public class DesignInMemoryFileSystemSolutionTest {

    @Test
    public void case1() {
        FileSystem fs = new FileSystem();
        assertEquals(0, fs.ls("/").size());
        fs.mkdir("/a/b/c");
        assertEquals(1, fs.ls("/").size());
        assertEquals("a", fs.ls("/").get(0));
        fs.mkdir("/a/b/d");
        assertEquals(2, fs.ls("/a/b").size());
        assertEquals("c", fs.ls("/a/b").get(0));
        assertEquals("d", fs.ls("/a/b").get(1));
        fs.addContentToFile("/a/b/readme.txt", "Hello, ");
        fs.addContentToFile("/a/b/readme.txt", "World!");
        assertEquals("Hello, World!", fs.readContentFromFile("/a/b/readme.txt"));
    }

}