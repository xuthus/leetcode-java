package ru.elcoder.leetcode.models;

public class VersionControl {
    private int badVersion;

    public boolean isBadVersion(int n) {
        return n >= badVersion;
    }

    public void setBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }
}
