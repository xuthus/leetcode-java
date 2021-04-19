package ru.elcoder.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ru.elcoder.leetcode.EmployeeImportanceSolution.Employee;
import static ru.elcoder.leetcode.utils.Utils.listOf;

public class EmployeeImportanceSolutionTest {

    @Test
    public void getImportance1() {
        final EmployeeImportanceSolution solution = new EmployeeImportanceSolution();
        assertEquals(11, solution.getImportance(
                listOf(
                        new Employee(1, 5, listOf(2, 3)),
                        new Employee(2, 3, listOf()),
                        new Employee(3, 3, listOf())
                ),
                1
        ));
    }

    @Test
    public void getImportance2() {
        final EmployeeImportanceSolution solution = new EmployeeImportanceSolution();
        assertEquals(3, solution.getImportance(
                listOf(
                        new Employee(1, 5, listOf(2, 3)),
                        new Employee(2, 3, listOf()),
                        new Employee(3, 3, listOf())
                ),
                2
        ));
    }

    @Test
    public void getImportance3() {
        final EmployeeImportanceSolution solution = new EmployeeImportanceSolution();
        assertEquals(4, solution.getImportance(
                listOf(
                        new Employee(1, 5, listOf(2, 3)),
                        new Employee(2, 3, listOf()),
                        new Employee(3, 4, listOf())
                ),
                3
        ));
    }

    @Test
    public void getImportance4() {
        final EmployeeImportanceSolution solution = new EmployeeImportanceSolution();
        assertEquals(21, solution.getImportance(
                listOf(
                        new Employee(1, 5, listOf(2, 3)),
                        new Employee(2, 3, listOf(4, 5, 6)),
                        new Employee(3, 4, listOf()),
                        new Employee(4, 5, listOf()),
                        new Employee(5, 6, null),
                        new Employee(6, 7, listOf())
                ),
                2
        ));
    }
}
