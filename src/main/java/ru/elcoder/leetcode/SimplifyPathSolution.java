package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.BeatsPercent;
import ru.elcoder.leetcode.models.Difficulty;
import ru.elcoder.leetcode.models.DifficultyLevel;

import java.util.LinkedList;

@Difficulty(DifficultyLevel.Medium)
@BeatsPercent(72.87)
public class SimplifyPathSolution {
    /*
    Given an absolute path for a file (Unix-style), simplify it.

    For example,
    path = "/home/", => "/home"
    path = "/a/./b/../../c/", => "/c"
    click to show corner cases.

    Corner Cases:
    Did you consider the case where path = "/../"?
    In this case, you should return "/".
    Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
    In this case, you should ignore redundant slashes and return "/home/foo".
    https://leetcode.com/problems/simplify-path/
    */
    public String simplifyPath(String path) {
        if (path == null) {
            return path;
        }
        LinkedList<String> stack = new LinkedList<>();
        // N.B.: if we use Arrays.stream(path.split("/")).forEach(...), @BeatsPercent downs to 0.78%!!! on OpenJDK 1.8.0
        String[] parts = path.split("/");
        for (String part : parts) {
            switch (part) {
                case "..":
                    if (stack.size() > 0)
                        stack.pop();
                    break;
                case ".":
                case "":
                    break;
                default:
                    stack.push(part);
            }
        }
        if (stack.size() > 0) {
            StringBuilder sb = new StringBuilder(path.length());
            while (!stack.isEmpty()) {
                sb.append("/").append(stack.pollLast());
            }
            return sb.toString();
        }
        return "/";
    }
}
