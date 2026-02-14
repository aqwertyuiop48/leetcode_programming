/*
 * @lc app=leetcode id=413 lang=kotlin
 *
 * [413] Arithmetic Slices
 */

class Solution {fun numberOfArithmeticSlices(nums: IntArray): Int = nums.asIterable().windowed(3).fold(0 to 0) { (total, curr), w -> if (w[1] - w[0] == w[2] - w[1]) total + curr + 1 to curr + 1 else total to 0 }.first}