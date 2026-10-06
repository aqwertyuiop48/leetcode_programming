/*
 * @lc app=leetcode id=714 lang=java
 *
 * [714] Best Time to Buy and Sell Stock with Transaction Fee
 */

class Solution {
    public int maxProfit(int[] prices, int fee) {
        return java.util.Arrays.stream(prices).boxed().reduce(new int[]{0, -prices[0]}, (s, p) -> new int[]{Math.max(s[0], s[1] + p - fee), Math.max(s[1], s[0] - p)}, (a, b) -> a)[0];
    }
}
