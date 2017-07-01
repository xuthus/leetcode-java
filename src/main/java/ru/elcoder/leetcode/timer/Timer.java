package ru.elcoder.leetcode.timer;

import java.util.Stack;

/**
 * Created by xuthus on 02.07.2017.
 */
public class Timer {
    private Stack<Long> startAt = new Stack<>();

    public void start() {
        startAt.push(System.currentTimeMillis());
    }

    public long finish() {
        return System.currentTimeMillis() - startAt.pop();
    }
}
