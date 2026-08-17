/*
 * @lc app=leetcode id=3434 lang=kotlin
 *
 * [3434] Maximum Frequency After Subarray Operation
 */

class Solution {
    fun maxFrequency(nums: IntArray, k: Int): Int = nums.count { it == k }.let { cK -> (1..50).filter { it != k }.maxOfOrNull { x -> nums.fold(0 to 0) { (cur, mx), n -> (if (n == x) cur + 1 else if (n == k) cur - 1 else cur).let { next -> maxOf(0, next) to maxOf(mx, maxOf(0, next)) } }.second }?.let { it + cK } ?: cK }
}