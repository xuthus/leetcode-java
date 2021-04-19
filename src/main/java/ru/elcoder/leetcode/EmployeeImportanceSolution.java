package ru.elcoder.leetcode;

import ru.elcoder.leetcode.models.DifficultyLevel;
import ru.elcoder.leetcode.models.Leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Leetcode(
        difficulty = DifficultyLevel.Easy,
        number = 690,
        title = "Employee Importance",
        url = "https://leetcode.com/problems/employee-importance/"
)
public class EmployeeImportanceSolution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> persons = new HashMap<>();
        for (Employee employee : employees) {
            persons.put(employee.id, employee);
        }
        return depthFirstSearch(persons, id);
    }

    private int depthFirstSearch(Map<Integer, Employee> persons, int personId) {
        final Employee employee = persons.get(personId);
        int result = employee.importance;
        if (employee.subordinates != null) {
            for (Integer subordinate : employee.subordinates) {
                result += depthFirstSearch(persons, subordinate);
            }
        }
        return result;
    }

    /*
    Same approach, but using Streams API
     */
    public int getImportanceStreams(List<Employee> employees, int id) {
        Map<Integer, Employee> persons = employees.stream().collect(Collectors.toMap(e -> e.id, e -> e));
        return depthFirstSearch(persons, id);
    }

    private int depthFirstSearchStreams(Map<Integer, Employee> persons, int personId) {
        final Employee employee = persons.get(personId);
        return employee.importance
                + Optional.ofNullable(employee.subordinates)
                .orElse(Collections.emptyList()).stream()
                .mapToInt(s -> depthFirstSearchStreams(persons, s))
                .sum();
    }

    public static class Employee {
        public int id;

        public int importance;

        public List<Integer> subordinates;

        public Employee(int id, int importance, List<Integer> subordinates) {
            this.id = id;
            this.importance = importance;
            this.subordinates = subordinates;
        }
    }
}
