package ru.elcoder.leetcode.models;

/**
 * Created by xuthus on 19.05.2017.
 */
public @interface Leetcode {
    DifficultyLevel difficulty();
    int number();
    String url();
    String title();
}
