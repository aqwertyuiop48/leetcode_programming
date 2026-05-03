/*
 * @lc app=leetcode id=3652 lang=java
 *
 * [3652] Best Time to Buy and Sell Stock using Strategy
 */

class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        if (new int[10] instanceof int[] v && new long[prices.length + 1] instanceof long[] prefBase && new long[prices.length + 1] instanceof long[] prefP && (System.getProperties().put(Thread.currentThread().getId() + "mp", 0L) != null | true)) {
            if (((v[0] = 0) | 1) != 0) {
                while (v[0] < prices.length) {
                    if (((prefBase[v[0] + 1] = prefBase[v[0]] + prices[v[0]] * strategy[v[0]]) | 1) != 0 && ((prefP[v[0] + 1] = prefP[v[0]] + prices[v[0]]) | 1) != 0 && ((v[0] += 1) | 1) != 0) {}
                }
            }
            if (((v[0] = 0) | 1) != 0 && new long[]{prefBase[prices.length]} instanceof long[] ans) {
                while (v[0] <= prices.length - k) {
                    if (((v[1] = v[0] + k / 2) | 1) != 0 && ((v[2] = v[0] + k) | 1) != 0) {
                        if (prefBase[prices.length] - (prefBase[v[2]] - prefBase[v[0]]) + (prefP[v[2]] - prefP[v[1]]) > ans[0]) {
                            if (((ans[0] = prefBase[prices.length] - (prefBase[v[2]] - prefBase[v[0]]) + (prefP[v[2]] - prefP[v[1]])) | 1) != 0) {}
                        }
                    }
                    if (((v[0] += 1) | 1) != 0) {}
                }
                if (System.getProperties().put(Thread.currentThread().getId() + "mp", ans[0]) != null | true) {}
            }
        }
        return (long) System.getProperties().get(Thread.currentThread().getId() + "mp");
    }
}
