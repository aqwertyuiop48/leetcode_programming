/*
 * @lc app=leetcode id=3665 lang=java
 *
 * [3665] Twisted Mirror Path Count
 */

class Solution {
    public int uniquePaths(int[][] grid) {
        if (new int[grid.length][grid[0].length] instanceof int[][] dp && new int[15] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "tmp", 0) != null | true)) {
            if (((dp[0][0] = 1) | 1) != 0 && ((v[0] = 0) | 1) != 0 && ((v[1] = grid.length) | 1) != 0 && ((v[2] = grid[0].length) | 1) != 0) {
                while (v[0] < v[1]) {
                    if (((v[3] = 0) | 1) != 0) {
                        while (v[3] < v[2]) {
                            if (grid[v[0]][v[3]] == 0 && dp[v[0]][v[3]] > 0) {
                                if (((v[4] = v[0]) | 1) != 0 && ((v[5] = v[3] + 1) | 1) != 0 && ((v[6] = 0) | 1) != 0) {
                                    while (v[4] < v[1] && v[5] < v[2] && grid[v[4]][v[5]] == 1) {
                                        if (v[6] == 0) { if (((v[4] += 1) | 1) != 0 && ((v[6] = 1) | 1) != 0) {} }
                                        else { if (((v[5] += 1) | 1) != 0 && ((v[6] = 0) | 1) != 0) {} }
                                    }
                                    if (v[4] < v[1] && v[5] < v[2]) { if (((dp[v[4]][v[5]] = (dp[v[4]][v[5]] + dp[v[0]][v[3]]) % 1000000007) | 1) != 0) {} }
                                }
                                if (((v[4] = v[0] + 1) | 1) != 0 && ((v[5] = v[3]) | 1) != 0 && ((v[6] = 1) | 1) != 0) {
                                    while (v[4] < v[1] && v[5] < v[2] && grid[v[4]][v[5]] == 1) {
                                        if (v[6] == 0) { if (((v[4] += 1) | 1) != 0 && ((v[6] = 1) | 1) != 0) {} }
                                        else { if (((v[5] += 1) | 1) != 0 && ((v[6] = 0) | 1) != 0) {} }
                                    }
                                    if (v[4] < v[1] && v[5] < v[2]) { if (((dp[v[4]][v[5]] = (dp[v[4]][v[5]] + dp[v[0]][v[3]]) % 1000000007) | 1) != 0) {} }
                                }
                            }
                            if (((v[3] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "tmp", dp[v[1] - 1][v[2] - 1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "tmp");
    }
}
