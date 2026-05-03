/*
 * @lc app=leetcode id=3742 lang=java
 *
 * [3742] Maximum Path Score in a Grid
 */

class Solution {
    public int maxPathScore(int[][] grid, int k) {
        if (new int[grid.length][grid[0].length][k + 1] instanceof int[][][] dp && new int[15] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mpsg", -1) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < grid.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < grid[0].length) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] <= k) {
                                    if (((dp[v[0]][v[1]][v[2]] = -1) | 1) != 0 && ((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (grid[0][0] <= k && ((dp[0][0][grid[0][0] > 0 ? 1 : 0] = grid[0][0]) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                    while (v[0] < grid.length) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < grid[0].length) {
                                if (((v[2] = 0) | 1) != 0 && ((v[3] = grid[v[0]][v[1]] > 0 ? 1 : 0) | 1) != 0) {
                                    while (v[2] <= k) {
                                        if (v[2] >= v[3]) {
                                            if (v[0] > 0 && dp[v[0]-1][v[1]][v[2]-v[3]] != -1) {
                                                if (dp[v[0]-1][v[1]][v[2]-v[3]] + grid[v[0]][v[1]] > dp[v[0]][v[1]][v[2]]) { if (((dp[v[0]][v[1]][v[2]] = dp[v[0]-1][v[1]][v[2]-v[3]] + grid[v[0]][v[1]]) | 1) != 0) {} }
                                            }
                                            if (v[1] > 0 && dp[v[0]][v[1]-1][v[2]-v[3]] != -1) {
                                                if (dp[v[0]][v[1]-1][v[2]-v[3]] + grid[v[0]][v[1]] > dp[v[0]][v[1]][v[2]]) { if (((dp[v[0]][v[1]][v[2]] = dp[v[0]][v[1]-1][v[2]-v[3]] + grid[v[0]][v[1]]) | 1) != 0) {} }
                                            }
                                        }
                                        if (((v[2] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (((v[4] = -1) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                        while (v[2] <= k) {
                            if (dp[grid.length - 1][grid[0].length - 1][v[2]] > v[4]) { if (((v[4] = dp[grid.length - 1][grid[0].length - 1][v[2]]) | 1) != 0) {} }
                            if (((v[2] += 1) | 1) != 0) {}
                        }
                        if (System.getProperties().put(Thread.currentThread().getId() + "mpsg", v[4]) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mpsg");
    }
}
