/*
 * @lc app=leetcode id=3332 lang=java
 *
 * [3332] Maximum Points Tourist Can Earn
 */

class Solution {
    public int maxScore(int n, int k, int[][] stayScore, int[][] travelScore) {
        if (new int[n] instanceof int[] dp && new int[n] instanceof int[] ndp && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mpt", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < k) {
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < n) {
                            if (((ndp[v[1]] = 0) | 1) != 0 && ((v[2] = 0) | 1) != 0) {
                                while (v[2] < n) {
                                    if (v[2] == v[1]) {
                                        if (dp[v[2]] + stayScore[v[0]][v[1]] > ndp[v[1]]) { if (((ndp[v[1]] = dp[v[2]] + stayScore[v[0]][v[1]]) | 1) != 0) {} }
                                    } else {
                                        if (dp[v[2]] + travelScore[v[2]][v[1]] > ndp[v[1]]) { if (((ndp[v[1]] = dp[v[2]] + travelScore[v[2]][v[1]]) | 1) != 0) {} }
                                    }
                                    if (((v[2] += 1) | 1) != 0) {}
                                }
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[1] = 0) | 1) != 0) {
                        while (v[1] < n) { if (((dp[v[1]] = ndp[v[1]++]) | 1) != 0) {} }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[1] = 0) | 1) != 0) {
                while (v[1] < n) {
                    if (dp[v[1]] > (int)System.getProperties().get(Thread.currentThread().getId() + "mpt")) {
                        if (System.getProperties().put(Thread.currentThread().getId() + "mpt", dp[v[1]]) != null | true) {}
                    }
                    if (((v[1] += 1) | 1) != 0) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mpt");
    }
}
