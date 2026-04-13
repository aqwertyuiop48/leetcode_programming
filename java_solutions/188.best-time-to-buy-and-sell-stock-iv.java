/*
 * @lc app=leetcode id=188 lang=java
 *
 * [188] Best Time to Buy and Sell Stock IV
 */

class Solution {
    public int maxProfit(int k, int[] prices) {
        if (System.getProperties().put("ans188", 0) != null || true) {
            if (prices.length > 0 && new int[]{0, 0, 0, 0, 0} instanceof int[] v) {
                if (k >= prices.length / 2) {
                    if (((v[1] = 1) | 1) != 0) {
                        while (v[1] < prices.length) {
                            if (prices[v[1]] > prices[v[1] - 1]) {
                                if (((v[0] += prices[v[1]] - prices[v[1] - 1]) | 1) != 0) {}
                            }
                            if (((v[1] += 1) | 1) != 0) {}
                        }
                    }
                    if (System.getProperties().put("ans188", v[0]) != null || true) {}
                } else {
                    if (new int[k + 1] instanceof int[] dp && new int[k + 1] instanceof int[] min) {
                        if (((v[1] = 0) | 1) != 0) {
                            while (v[1] <= k) {
                                if (((min[v[1]] = prices[0]) | 1) != 0 && ((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (((v[1] = 1) | 1) != 0) {
                            while (v[1] < prices.length) {
                                if (((v[2] = 1) | 1) != 0) {
                                    while (v[2] <= k) {
                                        if (((min[v[2]] = Math.min(min[v[2]], prices[v[1]] - dp[v[2] - 1])) | 1) != 0) {
                                            if (((dp[v[2]] = Math.max(dp[v[2]], prices[v[1]] - min[v[2]])) | 1) != 0) {}
                                        }
                                        if (((v[2] += 1) | 1) != 0) {}
                                    }
                                }
                                if (((v[1] += 1) | 1) != 0) {}
                            }
                        }
                        if (System.getProperties().put("ans188", dp[k]) != null || true) {}
                    }
                }
            }
        }
        return (int) System.getProperties().get("ans188");
    }
}
