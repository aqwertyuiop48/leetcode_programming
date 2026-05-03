/*
 * @lc app=leetcode id=3418 lang=java
 *
 * [3418] Maximum Amount of Money Robot Can Earn
 */

class Solution {
    public int maximumAmount(int[][] coins) {
        if (new int[coins.length][coins[0].length][3] instanceof int[][][] dp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mam", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < coins.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < coins[0].length) { if (((dp[v[0]][v[1]][0] = -1000000000) | 1) != 0 && ((dp[v[0]][v[1]][1] = -1000000000) | 1) != 0 && ((dp[v[0]][v[1]][2] = -1000000000) | 1) != 0 && ((v[1] += 1) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((dp[0][0][0] = coins[0][0]) | 1) != 0) { if (coins[0][0] < 0) { if (((dp[0][0][1] = 0) | 1) != 0) {} } }
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < coins.length) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < coins[0].length) {
                            if (v[0] != 0 || v[1] != 0) {
                                if (((v[2] = 0) | 1) != 0) {
                                    while (v[2] < 3) {
                                        if (((v[3] = -1000000000) | 1) != 0) {
                                            if (v[0] > 0 && dp[v[0]-1][v[1]][v[2]] != -1000000000) { if (dp[v[0]-1][v[1]][v[2]] + coins[v[0]][v[1]] > v[3]) { if (((v[3] = dp[v[0]-1][v[1]][v[2]] + coins[v[0]][v[1]]) | 1) != 0) {} } }
                                            if (v[1] > 0 && dp[v[0]][v[1]-1][v[2]] != -1000000000) { if (dp[v[0]][v[1]-1][v[2]] + coins[v[0]][v[1]] > v[3]) { if (((v[3] = dp[v[0]][v[1]-1][v[2]] + coins[v[0]][v[1]]) | 1) != 0) {} } }
                                            if (((dp[v[0]][v[1]][v[2]] = v[3]) | 1) != 0) {}
                                        }
                                        if (v[2] > 0 && coins[v[0]][v[1]] < 0) {
                                            if (((v[3] = -1000000000) | 1) != 0) {
                                                if (v[0] > 0 && dp[v[0]-1][v[1]][v[2]-1] != -1000000000) { if (dp[v[0]-1][v[1]][v[2]-1] > v[3]) { if (((v[3] = dp[v[0]-1][v[1]][v[2]-1]) | 1) != 0) {} } }
                                                if (v[1] > 0 && dp[v[0]][v[1]-1][v[2]-1] != -1000000000) { if (dp[v[0]][v[1]-1][v[2]-1] > v[3]) { if (((v[3] = dp[v[0]][v[1]-1][v[2]-1]) | 1) != 0) {} } }
                                                if (v[3] > dp[v[0]][v[1]][v[2]]) { if (((dp[v[0]][v[1]][v[2]] = v[3]) | 1) != 0) {} }
                                            }
                                        }
                                        if (((v[2] += 1) | 1) != 0) {}
                                    }
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mam", Math.max(dp[coins.length-1][coins[0].length-1][0], Math.max(dp[coins.length-1][coins[0].length-1][1], dp[coins.length-1][coins[0].length-1][2]))) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mam");
    }
}
