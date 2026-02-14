/*
 * @lc app=leetcode id=740 lang=kotlin
 *
 * [740] Delete and Earn
 */

class Solution { fun deleteAndEarn(nums: IntArray): Int = IntArray(10001).apply { nums.forEach { this[it] += it } }.let { points -> points.indices.fold(0 to 0) { (prev, cur), i -> cur to maxOf(cur, prev + points[i]) }.second } }