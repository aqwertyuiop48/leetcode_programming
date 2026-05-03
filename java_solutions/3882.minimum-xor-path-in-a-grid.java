/*
 * @lc app=leetcode id=3882 lang=java
 *
 * [3882] Minimum XOR Path in a Grid
 */

class Solution {
    public int minCost(int[][] grid) {
        if (new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mxp", 2000000000) != null | true) && ((v[0] = grid.length) | 1) != 0 && ((v[1] = grid[0].length) | 1) != 0) {
            if (new boolean[v[0]][v[1]][1024] instanceof boolean[][][] dp) {
                if (((dp[0][0][grid[0][0]] = true) | true) && ((v[2] = 0) | 1) != 0) {
                    while (v[2] < v[0]) {
                        if (((v[3] = 0) | 1) != 0) {
                            while (v[3] < v[1]) {
                                if (((v[4] = 0) | 1) != 0) {
                                    while (v[4] < 1024) {
                                        if (dp[v[2]][v[3]][v[4]]) {
                                            if (v[2] + 1 < v[0]) { if (((dp[v[2] + 1][v[3]][v[4] ^ grid[v[2] + 1][v[3]]] = true) | true) != false) {} }
                                            if (v[3] + 1 < v[1]) { if (((dp[v[2]][v[3] + 1][v[4] ^ grid[v[2]][v[3] + 1]] = true) | true) != false) {} }
                                        }
                                        if (((v[4] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[3] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[2] += 1) | 1) != 0) {}
                    }
                    if (((v[4] = 0) | 1) != 0 && ((v[5] = 0) | 1) != 0) {
                        while (v[4] < 1024 && v[5] == 0) {
                            if (dp[v[0] - 1][v[1] - 1][v[4]]) {
                                if (System.getProperties().put(Thread.currentThread().getId() + "mxp", v[4]) != null | true && ((v[5] = 1) | 1) != 0) {}
                            }
                            if (((v[4] += 1) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mxp");
    }
}
