/*
 * @lc app=leetcode id=690 lang=java
 *
 * [690] Employee Importance
 */

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        return employees.stream().filter(e -> e.id == id).findFirst()
            .map(e -> e.importance + e.subordinates.stream().mapToInt(s -> getImportance(employees, s)).sum()).get();
    }
}
