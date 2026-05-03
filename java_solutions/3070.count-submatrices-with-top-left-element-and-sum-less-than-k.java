/*
 * @lc app=leetcode id=3070 lang=java
 *
 * [3070] Count Submatrices with Top-Left Element and Sum Less Than k
 */

class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "csm", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < grid.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < grid[0].length) {
                            if (v[0] > 0) { if (((grid[v[0]][v[1]] += grid[v[0]-1][v[1]]) | 1) != 0) {} }
                            if (v[1] > 0) { if (((grid[v[0]][v[1]] += grid[v[0]][v[1]-1]) | 1) != 0) {} }
                            if (v[0] > 0 && v[1] > 0) { if (((grid[v[0]][v[1]] -= grid[v[0]-1][v[1]-1]) | 1) != 0) {} }
                            if (grid[v[0]][v[1]] <= k) { if (((v[2] += 1) | 1) != 0) {} }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "csm", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "csm");
    }
}
