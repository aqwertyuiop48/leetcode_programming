/*
 * @lc app=leetcode id=179 lang=kotlin
 *
 * [179] Largest Number
 */

class Solution { fun largestNumber(nums: IntArray): String = nums.map { it.toString() } .sortedWith { a, b -> (b + a).compareTo(a + b) } .joinToString("") .let { if (it.all { c -> c == '0' }) "0" else it } }

