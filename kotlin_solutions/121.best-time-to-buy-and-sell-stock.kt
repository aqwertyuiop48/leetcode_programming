/*
 * @lc app=leetcode id=121 lang=kotlin
 *
 * [121] Best Time to Buy and Sell Stock
 */

class Solution { fun maxProfit(prices: IntArray): Int = prices.fold(Int.MAX_VALUE to 0) { (minPrice, maxProfit), price -> minOf(minPrice, price) to maxOf(maxProfit, price - minPrice) }.second }
