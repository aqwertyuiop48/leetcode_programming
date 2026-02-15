/*
 * @lc app=leetcode id=1991 lang=kotlin
 *
 * [1991] Find the Middle Index in Array
 */

class Solution {fun findMiddleIndex(nums: IntArray): Int = nums.runningFold(0) { acc, v -> acc + v }.drop(1).let { prefixes -> nums.indices.firstOrNull { i -> prefixes.getOrElse(i - 1) { 0 } == prefixes.last() - prefixes[i] } ?: -1 }}

