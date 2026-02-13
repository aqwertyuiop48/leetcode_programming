/*
 * @lc app=leetcode id=123 lang=kotlin
 *
 * [123] Best Time to Buy and Sell Stock III
 */

class Solution {fun maxProfit(prices: IntArray): Int =prices.fold(intArrayOf(Int.MIN_VALUE, 0, Int.MIN_VALUE, 0)) { acc, price ->intArrayOf(maxOf(acc[0], -price),maxOf(acc[1], acc[0] + price),maxOf(acc[2], acc[1] - price),maxOf(acc[3], acc[2] + price))}[3]}
