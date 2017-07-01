package ru.elcoder.leetcode.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuthus on 01.07.2017.
 */
public class NestedInteger {

    private Integer value;
    private List<NestedInteger> list = new ArrayList<>();

    public NestedInteger() {
    }

    public NestedInteger(int value) {
        this.value = value;
    }

    public boolean isInteger() {
        return value != null;
    }

    public Integer getInteger() {
        return value;
    }

    public void setInteger(int value) {
        this.value = value;
    }

    public void add(NestedInteger ni) {
        list.add(ni);
    }

    public List<NestedInteger> getList() {
        return list;
    }
}
