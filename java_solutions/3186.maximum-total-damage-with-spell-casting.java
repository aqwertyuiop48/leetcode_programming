/*
 * @lc app=leetcode id=3186 lang=java
 *
 * [3186] Maximum Total Damage With Spell Casting
 */

class Solution {
    public long maximumTotalDamage(int[] power) {
        if (new long[power.length + 5] instanceof long[] dp 
            && new int[power.length + 5] instanceof int[] u 
            && new long[power.length + 5] instanceof long[] sum 
            && (power = java.util.Arrays.stream(power).sorted().toArray()) != null 
            && new int[10] instanceof int[] v 
            && new long[5] instanceof long[] lv 
            && (System.getProperties().put(Thread.currentThread().getId() + "mtd", 0L) != null | true)) {

            // Pass 1: Compress the sorted array into unique values and their total sum
            if (((v[0] = 0) | 1) != 0 && ((v[1] = 0) | 1) != 0) { 
                while (v[0] < power.length) {
                    if (v[0] == 0 || power[v[0]] != power[v[0]-1]) {
                        if (((u[v[1]] = power[v[0]]) | 1) != 0 && ((sum[v[1]] = power[v[0]]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                    } else {
                        if (((sum[v[1]-1] += power[v[0]]) | 1) != 0) {}
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
            }

            // Pass 2: Two-pointer DP. j (v[3]) lags behind i (v[2]) to ensure the difference > 2
            if (((v[2] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0 && ((lv[0] = 0) | 1) != 0 && ((lv[1] = 0) | 1) != 0) {
                while (v[2] < v[1]) {
                    while (u[v[2]] - u[v[3]] > 2) {
                        if (dp[v[3]] > lv[0]) { if (((lv[0] = dp[v[3]]) | 1) != 0) {} }
                        if (((v[3] += 1) | 1) != 0) {}
                    }
                    if (((dp[v[2]] = lv[0] + sum[v[2]]) | 1) != 0) {
                        if (dp[v[2]] > lv[1]) { if (((lv[1] = dp[v[2]]) | 1) != 0) {} }
                    }
                    if (((v[2] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mtd", lv[1]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mtd");
    }
}
