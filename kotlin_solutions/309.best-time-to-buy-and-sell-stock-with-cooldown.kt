/*
 * @lc app=leetcode id=309 lang=kotlin
 *
 * [309] Best Time to Buy and Sell Stock with Cooldown
 */

class Solution {fun maxProfit(prices: IntArray): Int = if (prices.isEmpty()) 0 else prices.drop(1).fold(Triple(-prices[0], 0, 0)) { (hold, sold, rest), price -> Triple(maxOf(hold, rest - price), hold + price, maxOf(rest, sold)) }.let { (_, sold, rest) -> maxOf(sold, rest) }}

