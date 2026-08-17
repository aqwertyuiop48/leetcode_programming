/*
 * @lc app=leetcode id=1608 lang=kotlin
 *
 * [1608] Special Array With X Elements Greater Than or Equal X
 */

class Solution {
    fun specialArray(nums: IntArray): Int = (0..nums.size).find { x -> nums.count { it >= x } == x } ?: -1
}