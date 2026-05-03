/*
 * @lc app=leetcode id=3180 lang=java
 *
 * [3180] Maximum Total Reward Using Operations I
 */

class Solution {
    public int maxTotalReward(int[] rewardValues) {
        if (new boolean[4005] instanceof boolean[] dp && new int[15] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mtr", 0) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < rewardValues.length) {
                    if (((v[1] = v[0] + 1) | 1) != 0) {
                        while (v[1] < rewardValues.length) {
                            if (rewardValues[v[0]] > rewardValues[v[1]]) { if (((v[2] = rewardValues[v[0]]) | 1) != 0 && ((rewardValues[v[0]] = rewardValues[v[1]]) | 1) != 0 && ((rewardValues[v[1]] = v[2]) | 1) != 0) {} }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if ((dp[0] = true) && ((v[0] = 0) | 1) != 0 && ((v[3] = 0) | 1) != 0) {
                    while (v[0] < rewardValues.length) {
                        if (((v[1] = rewardValues[v[0]] - 1) | 1) != 0) {
                            while (v[1] >= 0) {
                                if (dp[v[1]]) {
                                    if ((dp[v[1] + rewardValues[v[0]]] = true)) {
                                        if (v[1] + rewardValues[v[0]] > v[3]) { if (((v[3] = v[1] + rewardValues[v[0]]) | 1) != 0) {} }
                                    }
                                }
                                if (((v[1] -= 1) | 1) != 0) {}
                            }
                        }
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                    if (System.getProperties().put(Thread.currentThread().getId() + "mtr", v[3]) != null | true) {}
                }
            }
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mtr");
    }
}
