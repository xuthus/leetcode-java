package ru.elcoder.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GenerateParenthesesSolutionTest {

    @Test
    public void generateParenthesis2() {
        GenerateParenthesesSolution solution = new GenerateParenthesesSolution();
        List<String> list = solution.generateParenthesis(2);
        assertEquals(2, list.size());
        assertEquals("(())", list.get(0));
        assertEquals("()()", list.get(1));
    }

    @Test
    public void generateParenthesis3() {
        GenerateParenthesesSolution solution = new GenerateParenthesesSolution();
        List<String> list = solution.generateParenthesis(3);
        assertEquals(5, list.size());
        assertEquals("((()))", list.get(0));
        assertEquals("(()())", list.get(1));
        assertEquals("(())()", list.get(2));
        assertEquals("()(())", list.get(3));
        assertEquals("()()()", list.get(4));
    }
}