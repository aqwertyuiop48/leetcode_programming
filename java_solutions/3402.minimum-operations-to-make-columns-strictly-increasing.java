/*
 * @lc app=leetcode id=3402 lang=java
 *
 * [3402] Minimum Operations to Make Columns Strictly Increasing
 */

class Solution {
    public int minimumOperations(int[][] grid) {
        if (new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "moc", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < grid[0].length) {
                    if (((v[1] = 1) | 1) != 0) {
                        while (v[1] < grid.length) {
                            if (grid[v[1]][v[0]] <= grid[v[1]-1][v[0]]) {
                                if (((v[2] = grid[v[1]-1][v[0]] + 1 - grid[v[1]][v[0]]) | 1) != 0 && ((grid[v[1]][v[0]] = grid[v[1]-1][v[0]] + 1) | 1) != 0 && ((v[3] += v[2]) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "moc", v[3]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "moc");
    }
}
