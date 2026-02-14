/*
 * @lc app=leetcode id=553 lang=kotlin
 *
 * [553] Optimal Division
 */

class Solution {fun optimalDivision(nums: IntArray) = if (nums.size == 1) "${nums[0]}" else if (nums.size == 2) "${nums[0]}/${nums[1]}" else "${nums[0]}/(${nums.slice(1 until nums.size).joinToString("/")})"}
