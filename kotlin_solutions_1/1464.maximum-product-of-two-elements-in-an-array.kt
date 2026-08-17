/*
 * @lc app=leetcode id=1464 lang=kotlin
 *
 * [1464] Maximum Product of Two Elements in an Array
 */

class Solution {
    fun maxProduct(nums: IntArray): Int = nums.sortedDescending().let { (it[0] - 1) * (it[1] - 1) }
}