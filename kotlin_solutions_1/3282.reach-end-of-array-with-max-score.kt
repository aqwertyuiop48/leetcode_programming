/*
 * @lc app=leetcode id=3282 lang=java
 *
 * [3282] Reach End of Array With Max Score
 */

class Solution {
    fun findMaximumScore(nums: List<Int>): Long = nums.dropLast(1).fold(0L to 0L) { (score, maxVal), x -> (score + maxOf(maxVal, x.toLong())) to maxOf(maxVal, x.toLong()) }.first
}