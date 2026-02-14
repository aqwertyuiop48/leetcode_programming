/*
 * @lc app=leetcode id=659 lang=kotlin
 *
 * [659] Split Array into Consecutive Subsequences
 */

class Solution { fun isPossible(nums: IntArray): Boolean = (mutableMapOf<Int, Int>() to mutableMapOf<Int, Int>()).let { (freq, tail) -> nums.forEach { freq[it] = (freq[it] ?: 0) + 1 } .run{nums.all { n -> when { (freq[n] ?: 0) == 0 -> {true} (tail[n - 1] ?: 0) > 0 -> {freq.apply { this[n] = this[n]!! - 1 }.run { tail.apply { this[n - 1] = this[n - 1]!! - 1 }.apply { this[n] = (this[n] ?: 0) + 1 } }.let { true }} (freq[n + 1] ?: 0) > 0 && (freq[n + 2] ?: 0) > 0 -> {freq.apply { this[n] = this[n]!! - 1 }.apply { this[n + 1] = this[n + 1]!! - 1 }.apply { this[n + 2] = this[n + 2]!! - 1 }.run { tail.apply { this[n + 2] = (this[n + 2] ?: 0) + 1 } }.let { true }} else -> false } }} } }
