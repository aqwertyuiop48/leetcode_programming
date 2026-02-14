/*
 * @lc app=leetcode id=714 lang=kotlin
 *
 * [714] Best Time to Buy and Sell Stock with Transaction Fee
 */

class Solution { fun maxProfit(prices: IntArray, fee: Int): Int = prices.fold(-prices[0] to 0) { (hold, sold), price -> maxOf(hold, sold - price) to maxOf(sold, hold + price - fee) }.second }