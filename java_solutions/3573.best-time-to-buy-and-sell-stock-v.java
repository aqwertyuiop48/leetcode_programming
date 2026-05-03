/*
 * @lc app=leetcode id=3573 lang=java
 *
 * [3573] Best Time to Buy and Sell Stock V
 */

class Solution {
    public long maximumProfit(int[] prices, int k) {
        if (prices.length > 0 && new long[k + 1] instanceof long[] profit && new long[k + 1] instanceof long[] buy && new long[k + 1] instanceof long[] sell && new int[10] instanceof int[] v && (System.getProperties().put(Thread.currentThread().getId() + "mp", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] <= k) { if (((buy[v[0]] = -prices[0]) | 1) != 0 && ((sell[v[0]] = prices[0]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {} }
            }
            if (((v[0] = 1) | 1) != 0) {
                while (v[0] < prices.length) {
                    if (((v[1] = prices[v[0]]) | 1) != 0 && ((v[2] = k) | 1) != 0) {
                        while (v[2] > 0) {
                            if (new long[]{profit[v[2] - 1]} instanceof long[] prevP) {
                                if (Math.max(buy[v[2]] + v[1], sell[v[2]] - v[1]) > profit[v[2]]) { if (((profit[v[2]] = Math.max(buy[v[2]] + v[1], sell[v[2]] - v[1])) | 1) != 0) {} }
                                if (prevP[0] - v[1] > buy[v[2]]) { if (((buy[v[2]] = prevP[0] - v[1]) | 1) != 0) {} }
                                if (prevP[0] + v[1] > sell[v[2]]) { if (((sell[v[2]] = prevP[0] + v[1]) | 1) != 0) {} }
                            }
                            if (((v[2] -= 1) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mp", profit[k]) != null | true) {}
            }
        }
        return (long) System.getProperties().getOrDefault(Thread.currentThread().getId() + "mp", 0L);
    }
}
