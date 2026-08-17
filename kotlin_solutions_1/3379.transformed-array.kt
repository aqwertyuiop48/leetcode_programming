/*
 * @lc app=leetcode id=3379 lang=java
 *
 * [3379] Transformed Array
 */

fun constructTransformedArray(nums: IntArray): IntArray = IntArray(nums.size) { i -> nums[((i + nums[i]) % nums.size + nums.size) % nums.size] }