/*
 * @lc app=leetcode id=123 lang=java
 *
 * [123] Best Time to Buy and Sell Stock III
 */

class Solution {
    public int maxProfit(int[] prices) {
        if (new int[]{0, Integer.MIN_VALUE, 0, Integer.MIN_VALUE, 0} instanceof int[] v) {
            while (v[0] < prices.length) {
                if (((v[1] = Math.max(v[1], -prices[v[0]])) | 1) != 0 && ((v[2] = Math.max(v[2], v[1] + prices[v[0]])) | 1) != 0) {
                    if (((v[3] = Math.max(v[3], v[2] - prices[v[0]])) | 1) != 0 && ((v[4] = Math.max(v[4], v[3] + prices[v[0]])) | 1) != 0) {
                        if (((v[0] += 1) | 1) != 0) {}
                    }
                }
            }
            if (((prices[0] = v[4]) | 1) != 0) {}
        }
        return prices.length > 0 ? prices[0] : 0;
    }
}
