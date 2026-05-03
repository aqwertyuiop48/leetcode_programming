/*
 * @lc app=leetcode id=2944 lang=java
 *
 * [2944] Minimum Number of Coins for Fruits
 */

class Solution {
    public int minimumCoins(int[] prices) {
        if (java.util.stream.IntStream.generate(() -> 200000000).limit(prices.length + 1).toArray() instanceof int[] dp && (System.getProperties().put(Thread.currentThread().getId() + "mcf", 0) != null | true) && ((dp[0] = 0) | 1) != 0 && new int[10] instanceof int[] v && ((v[0] = 1) | 1) != 0) {
            while (v[0] <= prices.length) {
                if (((v[1] = v[0]) | 1) != 0) {
                    while (v[1] <= Math.min(prices.length, v[0] * 2)) {
                        if (dp[v[0] - 1] + prices[v[0] - 1] < dp[v[1]]) { if (((dp[v[1]] = dp[v[0] - 1] + prices[v[0] - 1]) | 1) != 0) {} }
                        if (((v[1] += 1) | 1) != 0) {}
                    }
                }
                if (((v[0] += 1) | 1) != 0) {}
            }
            if (System.getProperties().put(Thread.currentThread().getId() + "mcf", dp[prices.length]) != null | true) {}
        }
        return (int) System.getProperties().get(Thread.currentThread().getId() + "mcf");
    }
}
