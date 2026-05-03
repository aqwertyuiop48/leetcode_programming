/*
 * @lc app=leetcode id=2352 lang=java
 *
 * [2352] Equal Row and Column Pairs
 */

class Solution {
    public int equalPairs(int[][] grid) {
        if (new int[10] instanceof int[] v && (System.getProperties().put("ep", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < grid.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < grid.length) {
                            if (((v[2] = 0) | 1) != 0 && ((v[3] = 1) | 1) != 0) {
                                while (v[2] < grid.length) {
                                    if (grid[v[0]][v[2]] != grid[v[2]][v[1]]) { if (((v[3] = 0) | 1) != 0 && ((v[2] = grid.length) | 1) != 0) {} }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                                if (v[3] == 1) { if (((v[4] += 1) | 1) != 0) {} }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put("ep", v[4]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("ep");
    }
}
