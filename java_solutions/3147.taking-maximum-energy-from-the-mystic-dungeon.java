/*
 * @lc app=leetcode id=3147 lang=java
 *
 * [3147] Taking Maximum Energy From the Mystic Dungeon
 */

class Solution {
    public int maximumEnergy(int[] energy, int k) {
        if (new int[energy.length] instanceof int[] dp && new int[5] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "tme", -999999999) != null | true)) {
            if (((v[0] = energy.length - 1) | 1) != 0 && ((v[1] = -999999999) | 1) != 0) {
                while (v[0] >= 0) {
                    if (((dp[v[0]] = energy[v[0]]) | 1) != 0) {}
                    if (v[0] + k < energy.length) {
                        if (((dp[v[0]] += dp[v[0] + k]) | 1) != 0) {}
                    }
                    if (dp[v[0]] > v[1]) { if (((v[1] = dp[v[0]]) | 1) != 0) {} }
                    if (((v[0] -= 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "tme", v[1]) != null | true) {}
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "tme");
    }
}
