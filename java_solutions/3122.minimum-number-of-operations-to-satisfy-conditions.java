/*
 * @lc app=leetcode id=3122 lang=java
 *
 * [3122] Minimum Number of Operations to Satisfy Conditions
 */

class Solution {
    public int minimumOperations(int[][] grid) {
        if (new int[grid[0].length][10] instanceof int[][] cnt && new int[grid[0].length][10] instanceof int[][] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mos", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < grid[0].length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < grid.length) {
                            if (((cnt[v[0]][grid[v[1]][v[0]]] += 1) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < grid[0].length) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] < 10) {
                                if (((v[2] = grid.length - cnt[v[0]][v[1]]) | 1) != 0 && ((dp[v[0]][v[1]] = 99999999) | 1) != 0) {
                                    if (v[0] == 0) { if (((dp[v[0]][v[1]] = v[2]) | 1) != 0) {} }
                                    else {
                                        if (((v[3] = 0) | 1) != 0) {
                                            while (v[3] < 10) {
                                                if (v[1] != v[3] && dp[v[0]-1][v[3]] + v[2] < dp[v[0]][v[1]]) {
                                                    if (((dp[v[0]][v[1]] = dp[v[0]-1][v[3]] + v[2]) | 1) != 0) {}
                                                }
                                                if (((v[3] += 1) | 1) != 0) {}
                                            }
                                        }
                                    }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] = 0) | 1) != 0 && ((v[1] = 99999999) | 1) != 0) {
                    while (v[0] < 10) {
                        if (dp[grid[0].length - 1][v[0]] < v[1]) { if (((v[1] = dp[grid[0].length - 1][v[0]]) | 1) != 0) {} }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mos", v[1]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mos");
    }
}
