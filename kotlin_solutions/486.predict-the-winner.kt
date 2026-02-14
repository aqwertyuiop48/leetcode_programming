/*
 * @lc app=leetcode id=486 lang=kotlin
 *
 * [486] Predict the Winner
 */

class Solution { fun predictTheWinner(nums: IntArray): Boolean = Array(nums.size) { IntArray(nums.size) }.apply { nums.indices.forEach { this[it][it] = nums[it] } .also{(nums.size - 2 downTo 0).forEach { i -> (i + 1..<nums.size).forEach { j -> this[i][j] = maxOf(nums[i] - this[i + 1][j], nums[j] - this[i][j - 1]) } }} }[0][nums.size - 1] >= 0 }