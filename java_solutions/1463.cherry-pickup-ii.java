/*
 * @lc app=leetcode id=1463 lang=java
 *
 * [1463] Cherry Pickup II
 */

class Solution {
    public int cherryPickup(int[][] grid) {
        if (new int[]{0, grid.length - 1, 0, 0, 0, 0, 0, grid.length, grid[0].length} instanceof int[] v && new int[grid.length + 1][grid[0].length + 2][grid[0].length + 2] instanceof int[][][] dp) {
            while (v[0] < 4) {
                if (v[0] == 0) {
                    if (v[1] >= 0) {
                        if (((v[2] = 0) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    } else {
                        if (((grid[0][0] = dp[0][1][v[8]]) | 1) != 0 && ((v[0] = 4) | 1) != 0) {}
                    }
                } else if (v[0] == 1) {
                    if (v[2] < v[8]) {
                        if (((v[3] = 0) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                    } else {
                        if (((v[1] -= 1) | 1) != 0 && ((v[0] = 0) | 1) != 0) {}
                    }
                } else if (v[0] == 2) {
                    if (v[3] < v[8]) {
                        if (((v[6] = 0) | 1) != 0 && ((v[4] = v[2] - 1) | 1) != 0 && ((v[0] = 3) | 1) != 0) {}
                    } else {
                        if (((v[2] += 1) | 1) != 0 && ((v[0] = 1) | 1) != 0) {}
                    }
                } else if (v[0] == 3) {
                    if (v[4] <= v[2] + 1) {
                        if (((v[5] = v[3] - 1) | 1) != 0) {
                            while (v[5] <= v[3] + 1) {
                                if (v[4] >= 0 && v[4] < v[8] && v[5] >= 0 && v[5] < v[8]) {
                                    if (((v[6] = Math.max(v[6], dp[v[1] + 1][v[4] + 1][v[5] + 1])) | 1) != 0) {}
                                }
                                if (((v[5] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[4] += 1) | 1) != 0) {}
                    } else {
                        if (((dp[v[1]][v[2] + 1][v[3] + 1] = v[6] + grid[v[1]][v[2]] + (v[2] == v[3] ? 0 : grid[v[1]][v[3]])) | 1) != 0) {
                            if (((v[3] += 1) | 1) != 0 && ((v[0] = 2) | 1) != 0) {}
                        }
                    }
                }
            }
        }
        return grid[0][0];
    }
}
