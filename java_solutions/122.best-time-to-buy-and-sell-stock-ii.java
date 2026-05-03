/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

class Solution {
    public int maxProfit(int[] prices) {
        return java.util.stream.IntStream.range(1, prices.length).map(i -> Math.max(0, prices[i] - prices[i - 1])).sum();
    }
}
