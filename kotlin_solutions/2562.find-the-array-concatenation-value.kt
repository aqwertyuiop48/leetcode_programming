/*
 * @lc app=leetcode id=2562 lang=kotlin
 *
 * [2562] Find the Array Concatenation Value
 */

class Solution {fun findTheArrayConcVal(nums: IntArray) = generateSequence(Triple(0, nums.size - 1, 0L)) { (l, r, con) -> if (l > r) null else Triple(l + 1, r - 1, con + (if (l == r) nums[l].toString() else nums[l].toString() + nums[r].toString()).toInt()) }.last().third}
