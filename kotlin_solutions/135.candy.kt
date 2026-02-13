/*
 * @lc app=leetcode id=135 lang=kotlin
 *
 * [135] Candy
 */

class Solution { fun candy(ratings: IntArray): Int = IntArray(ratings.size) { 1 }.apply { (1 until ratings.size).forEach { i -> if (ratings[i] > ratings[i - 1]) this[i] = this[i - 1] + 1 } .also{(ratings.size - 2 downTo 0).forEach { i -> if (ratings[i] > ratings[i + 1]) this[i] = maxOf(this[i], this[i + 1] + 1) }} }.sum() }
