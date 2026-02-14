/*
 * @lc app=leetcode id=414 lang=kotlin
 *
 * [414] Third Maximum Number
 */

class Solution {fun thirdMax(nums: IntArray): Int = nums.toSet().sortedDescending().let { if (it.size >= 3) it[2] else it[0] }}

