/*
 * @lc app=leetcode id=2639 lang=java
 *
 * [2639] Find the Width of Columns of a Grid
 */

class Solution {
    public int[] findColumnWidth(int[][] grid) {
        if (new int[grid[0].length] instanceof int[] ans && new int[10] instanceof int[] v && (System.getProperties().put("fcw", ans) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < grid[0].length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < grid.length) {
                            if (((v[2] = String.valueOf(grid[v[1]][v[0]]).length()) | 1) != 0 && v[2] > ans[v[0]]) { if (((ans[v[0]] = v[2]) | 1) != 0) {} }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
        }
        return (int[]) System.getProperties().get("fcw");
    }
}
