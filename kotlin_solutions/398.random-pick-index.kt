/*
 * @lc app=leetcode id=398 lang=kotlin
 *
 * [398] Random Pick Index
 */

class Solution(private val nums: IntArray) { fun pick(target: Int): Int = nums.indices.filter { nums[it] == target }.random() }
