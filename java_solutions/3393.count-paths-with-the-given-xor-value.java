/*
 * @lc app=leetcode id=3393 lang=java
 *
 * [3393] Count Paths With the Given XOR Value
 */

class Solution {
    public int countPathsWithXorValue(int[][] grid, int k) {
        if (new int[grid.length][grid[0].length][16] instanceof int[][][] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "cpx", 0) != null | true)) {
            if (((dp[0][0][grid[0][0]] = 1) | 1) != 0 && ((v[0] = 0) | 1) != 0) {
                while (v[0] < grid.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < grid[0].length) {
                            if (((v[2] = 0) | 1) != 0) {
                                while (v[2] < 16) {
                                    if (dp[v[0]][v[1]][v[2]] > 0) {
                                        if (v[0] + 1 < grid.length) { if (((dp[v[0]+1][v[1]][v[2] ^ grid[v[0]+1][v[1]]] = (dp[v[0]+1][v[1]][v[2] ^ grid[v[0]+1][v[1]]] + dp[v[0]][v[1]][v[2]]) % 1000000007) | 1) != 0) {} }
                                        if (v[1] + 1 < grid[0].length) { if (((dp[v[0]][v[1]+1][v[2] ^ grid[v[0]][v[1]+1]] = (dp[v[0]][v[1]+1][v[2] ^ grid[v[0]][v[1]+1]] + dp[v[0]][v[1]][v[2]]) % 1000000007) | 1) != 0) {} }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "cpx", dp[grid.length-1][grid[0].length-1][k]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "cpx");
    }
}
