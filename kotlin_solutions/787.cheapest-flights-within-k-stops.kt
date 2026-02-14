/*
 * @lc app=leetcode id=787 lang=kotlin
 *
 * [787] Cheapest Flights Within K Stops
 */

class Solution { fun findCheapestPrice(n: Int, flights: Array<IntArray>, src: Int, dst: Int, k: Int): Int = generateSequence(IntArray(n) { Int.MAX_VALUE }.apply { this[src] = 0 }) { price -> price.clone().apply { flights.forEach { (from, to, cost) -> if (price[from] != Int.MAX_VALUE) this[to] = minOf(this[to], price[from] + cost) }} }.elementAt(k + 1)[dst].takeIf { it != Int.MAX_VALUE } ?: -1 }