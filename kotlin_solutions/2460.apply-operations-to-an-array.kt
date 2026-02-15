/*
 * @lc app=leetcode id=2460 lang=kotlin
 *
 * [2460] Apply Operations to an Array
 */
class Solution { fun applyOperations(nums: IntArray): IntArray = nums.apply { (0..lastIndex - 1).forEach { i -> if (this[i] == this[i + 1]) this[i] = this[i].also { this[i + 1] = 0 } * 2 } }.partition { it != 0 }.run { (first + second).toIntArray() } }