/*
 * @lc app=leetcode id=2428 lang=java
 *
 * [2428] Maximum Sum of an Hourglass
 */

class Solution {
    public int maxSum(int[][] grid) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "msh", 0) != null | true) && ((v[0] = 0) | 1) != 0 && ((v[1] = grid.length) | 1) != 0 && ((v[2] = grid[0].length) | 1) != 0) {
            while (v[0] < v[1] - 2) {
                if (((v[3] = 0) | 1) != 0) {
                    while (v[3] < v[2] - 2) {
                        if (((v[4] = grid[v[0]][v[3]] + grid[v[0]][v[3] + 1] + grid[v[0]][v[3] + 2] + grid[v[0] + 1][v[3] + 1] + grid[v[0] + 2][v[3]] + grid[v[0] + 2][v[3] + 1] + grid[v[0] + 2][v[3] + 2]) | 1) != 0) {
                            if (v[4] > v[5]) { if (((v[5] = v[4]) | 1) != 0) {} }
                        }
                        if (((v[3] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "msh", v[5]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "msh");
    }
}
