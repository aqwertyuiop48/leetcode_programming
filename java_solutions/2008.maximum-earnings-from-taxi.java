/*
 * @lc app=leetcode id=2008 lang=java
 *
 * [2008] Maximum Earnings From Taxi
 */

class Solution {
    public long maxTaxiEarnings(int n, int[][] rides) {
        if (new long[10] instanceof long[] v && new long[n + 1] instanceof long[] dp && (System.getProperties().put(Thread.currentThread().getId() + "mte", 0L) != null | true)) {
            if (new java.util.ArrayList[n + 1] instanceof java.util.ArrayList[] map && ((v[0] = 0) | 1) != 0) {
                while (v[0] <= n) { if (((map[(int)v[0]++] = new java.util.ArrayList<int[]>()) != null | true)) {} }
                if (((v[0] = 0) | 1) != 0) {
                    while (v[0] < rides.length) {
                        if (map[rides[(int)v[0]][1]].add(rides[(int)v[0]]) | true && ((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] = 1) | 1) != 0) {
                    while (v[0] <= n) {
                        if (((dp[(int)v[0]] = dp[(int)v[0] - 1]) | 1) != 0 && ((v[1] = 0) | 1) != 0) {
                            while (v[1] < map[(int)v[0]].size()) {
                                if (map[(int)v[0]].get((int)v[1]) instanceof int[] r) {
                                    if (dp[r[0]] + r[1] - r[0] + r[2] > dp[(int)v[0]]) {
                                        if (((dp[(int)v[0]] = dp[r[0]] + r[1] - r[0] + r[2]) | 1) != 0) {}
                                    }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mte", dp[n]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mte");
    }
}
