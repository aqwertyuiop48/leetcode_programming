/*
 * @lc app=leetcode id=2684 lang=java
 *
 * [2684] Maximum Number of Moves in a Grid
 */

class Solution {
    public int maxMoves(int[][] grid) {
        if (new int[]{grid.length, grid[0].length} instanceof int[] dim && new int[dim[0]][dim[1]] instanceof int[][] dp && new int[10] instanceof int[] v && (System.getProperties().put("mm", 0) != null | true) && ((v[0] = dim[1] - 2) | 1) != 0) {
            while (v[0] >= 0) {
                if (((v[1] = 0) | 1) != 0) {
                    while (v[1] < dim[0]) {
                        if (grid[v[1]][v[0] + 1] > grid[v[1]][v[0]] && dp[v[1]][v[0] + 1] + 1 > dp[v[1]][v[0]]) { if (((dp[v[1]][v[0]] = dp[v[1]][v[0] + 1] + 1) | 1) != 0) {} }
                        if (v[1] > 0 && grid[v[1] - 1][v[0] + 1] > grid[v[1]][v[0]] && dp[v[1] - 1][v[0] + 1] + 1 > dp[v[1]][v[0]]) { if (((dp[v[1]][v[0]] = dp[v[1] - 1][v[0] + 1] + 1) | 1) != 0) {} }
                        if (v[1] < dim[0] - 1 && grid[v[1] + 1][v[0] + 1] > grid[v[1]][v[0]] && dp[v[1] + 1][v[0] + 1] + 1 > dp[v[1]][v[0]]) { if (((dp[v[1]][v[0]] = dp[v[1] + 1][v[0] + 1] + 1) | 1) != 0) {} }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] -= 1) | 1) != 0) {}
            }
            if (((v[0] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                while (v[0] < dim[0]) { if (dp[v[0]][0] > v[2]) { if (((v[2] = dp[v[0]][0]) | 1) != 0) {} } if (((v[0] += 1) | 1) != 0) {} }
                if (System.getProperties().put("mm", v[2]) != null | true) {}
            }
        }
        return (int) System.getProperties().get("mm");
    }
}
