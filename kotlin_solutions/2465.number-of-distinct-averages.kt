/*
 * @lc app=leetcode id=2465 lang=kotlin
 *
 * [2465] Number of Distinct Averages
 */

class Solution { fun distinctAverages(nums: IntArray): Int = nums.sorted().let { s -> s.indices.take(s.size / 2).map { (s[it] + s[s.lastIndex - it]) / 2.0 }.distinct().size } }