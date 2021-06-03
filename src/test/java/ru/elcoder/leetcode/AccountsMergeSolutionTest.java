package ru.elcoder.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AccountsMergeSolutionTest {

    @Test
    public void accountsMerge1() {
        final AccountsMergeSolution solution = new AccountsMergeSolution();
        final List<List<String>> accounts = solution.accountsMerge(Arrays.asList(
                Arrays.asList("David", "David0@m.co", "David1@m.co"),
                Arrays.asList("David", "David3@m.co", "David4@m.co"),
                Arrays.asList("David", "David4@m.co", "David5@m.co"),
                Arrays.asList("David", "David2@m.co", "David3@m.co"),
                Arrays.asList("David", "David1@m.co", "David2@m.co")
        ));
        assertEquals(1, accounts.size());
        assertEquals(7, accounts.get(0).size());
    }

    @Test
    public void accountsMerge2() {
        final AccountsMergeSolution solution = new AccountsMergeSolution();
        final List<List<String>> accounts = solution.accountsMerge(Arrays.asList(
                Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com"),
                Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com"),
                Arrays.asList("Mary", "mary@mail.com"),
                Arrays.asList("John", "johnnybravo@mail.com")
        ));
        assertEquals(3, accounts.size());
    }

    @Test
    public void accountsMerge3() {
        final AccountsMergeSolution solution = new AccountsMergeSolution();
        final List<List<String>> accounts = solution.accountsMerge(Arrays.asList(
                Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com")
        ));
        assertEquals(1, accounts.size());
    }

    @Test
    public void accountsMerge4() {
        final AccountsMergeSolution solution = new AccountsMergeSolution();
        final List<List<String>> accounts = solution.accountsMerge(Arrays.asList(
                Arrays.asList("x", "x1", "x2"),
                Arrays.asList("x", "x2", "x3"),
                Arrays.asList("x", "x3", "x4"),
                Arrays.asList("x", "x4", "x5")
        ));
        assertEquals(1, accounts.size());
    }

    @Test
    public void accountsMerge5() {
        final AccountsMergeSolution solution = new AccountsMergeSolution();
        final List<List<String>> accounts = solution.accountsMerge(Arrays.asList(
                Arrays.asList("x", "x3", "x4"),
                Arrays.asList("x", "x4", "x5"),
                Arrays.asList("x", "x1", "x2"),
                Arrays.asList("x", "x2", "x3")
        ));
        assertEquals(1, accounts.size());
        assertEquals(6, accounts.get(0).size());
    }

    @Test
    public void accountsMerge6() {
        final AccountsMergeSolution solution = new AccountsMergeSolution();
        final List<List<String>> accounts = solution.accountsMerge(Arrays.asList(
                Arrays.asList("Alex", "Alex5@m.co", "Alex4@m.co", "Alex0@m.co"),
                Arrays.asList("Ethan", "Ethan3@m.co", "Ethan3@m.co", "Ethan0@m.co"),
                Arrays.asList("Kevin", "Kevin4@m.co", "Kevin2@m.co", "Kevin2@m.co"),
                Arrays.asList("Gabe", "Gabe0@m.co", "Gabe3@m.co", "Gabe2@m.co"),
                Arrays.asList("Gabe", "Gabe3@m.co", "Gabe4@m.co", "Gabe2@m.co")
        ));
        assertEquals(4, accounts.size());
    }
}
