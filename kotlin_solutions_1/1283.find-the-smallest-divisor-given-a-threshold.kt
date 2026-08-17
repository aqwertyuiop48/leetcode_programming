/*
 * @lc app=leetcode id=1283 lang=kotlin
 *
 * [1283] Find the Smallest Divisor Given a Threshold
 */

class Solution {
    fun smallestDivisor(nums: IntArray, threshold: Int): Int = generateSequence(1 to 1000000) { (l, r) -> if (l <= r) (l + (r - l) / 2).let { m -> if (nums.fold(0L) { a, x -> a + (x + m - 1) / m } <= threshold) l to m - 1 else m + 1 to r } else null }.last().first
}