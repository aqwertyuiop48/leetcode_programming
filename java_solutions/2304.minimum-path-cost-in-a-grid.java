/*
 * @lc app=leetcode id=2304 lang=java
 *
 * [2304] Minimum Path Cost in a Grid
 */

class Solution {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        if (new int[grid[0].length] instanceof int[] dp && new int[grid[0].length] instanceof int[] ndp && new int[10] instanceof int[] v && (System.getProperties().put("mpc", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < grid[0].length) { if (((dp[v[0]] = grid[0][v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
                if (((v[0] = 1) | 1) != 0) {
                    while (v[0] < grid.length) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < grid[0].length) {
                                if (((ndp[v[1]] = 999999999) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                                    while (v[2] < grid[0].length) {
                                        if (dp[v[2]] + moveCost[grid[v[0]-1][v[2]]][v[1]] + grid[v[0]][v[1]] < ndp[v[1]]) {
                                            if (((ndp[v[1]] = dp[v[2]] + moveCost[grid[v[0]-1][v[2]]][v[1]] + grid[v[0]][v[1]]) | 1) != 0) {}
                                        }
                                        if (((v[2] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[1] = 0) | 1) != 0) { while (v[1] < grid[0].length) { if (((dp[v[1]] = ndp[v[1]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} } }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (((v[3] = 999999999) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                        while (v[1] < grid[0].length) { if (dp[v[1]] < v[3]) { if (((v[3] = dp[v[1]]) | 1) != 0) {} } if (((v[1] += 1) | 1) != 0) {} }
                        if (System.getProperties().put("mpc", v[3]) != null | true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get("mpc");
    }
}
