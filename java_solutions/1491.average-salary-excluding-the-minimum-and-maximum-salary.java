/*
 * @lc app=leetcode id=1491 lang=java
 *
 * [1491] Average Salary Excluding the Minimum and Maximum Salary
 */

class Solution {
    public double average(int[] salary) {
        return Arrays.stream(salary)
            .sorted()
            .skip(1)
            .limit(salary.length - 2)
            .average()
            .orElse(0.0);
    }
}
