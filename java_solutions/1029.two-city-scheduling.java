/*
 * @lc app=leetcode id=1029 lang=java
 *
 * [1029] Two City Scheduling
 */

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("tcs", 0) != null | true)) {
            if (((costs = java.util.Arrays.stream(costs).sorted((a, b) -> (a[0] - a[1]) - (b[0] - b[1])).toArray(int[][]::new)) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                while (v[0] < costs.length / 2) {
                    if (((v[1] += costs[v[0]][0] + costs[v[0] + costs.length / 2][1]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("tcs", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("tcs");
    }
}
