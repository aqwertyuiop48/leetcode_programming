/*
 * @lc app=leetcode id=1109 lang=kotlin
 *
 * [1109] Corporate Flight Bookings
 */

class Solution { fun corpFlightBookings(bookings: Array<IntArray>, n: Int): IntArray = IntArray(n).apply { bookings.forEach { b -> b[2].also { seats -> this[b[0] - 1] += seats }.also { seats -> if (b[1] < n) this[b[1]] -= seats } } }.apply { (1 until n).forEach { i -> this[i] += this[i - 1] } } }