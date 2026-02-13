/*
 * @lc app=leetcode id=188 lang=kotlin
 *
 * [188] Best Time to Buy and Sell Stock IV
 */

class Solution { fun maxProfit(k: Int, prices: IntArray): Int = if (prices.isEmpty()) 0 else prices.fold(Array(k + 1) { i -> intArrayOf(if (i > 0) -prices[0] else Int.MIN_VALUE, 0) }) { dp, price -> dp.apply { indices.forEach { i -> (if (i > 0) maxOf(this[i][0], this[i - 1][1] - price) else this[i][0]).also { x -> this[i][0] = x.also { this[i][1] = maxOf(this[i][1], it + price) } } } } }[k][1] }
