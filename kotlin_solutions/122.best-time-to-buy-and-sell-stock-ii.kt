/*
 * @lc app=leetcode id=122 lang=kotlin
 *
 * [122] Best Time to Buy and Sell Stock II
 */

class Solution {fun maxProfit(prices: IntArray): Int =prices.indices.drop(1).sumOf { maxOf(0, prices[it] - prices[it - 1]) }}
