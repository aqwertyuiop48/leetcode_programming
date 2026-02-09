/*
 * @lc app=leetcode id=55 lang=kotlin
 *
 * [55] Jump Game
 */

class Solution {fun canJump(nums: IntArray): Boolean = nums.withIndex().reversed().fold(nums.lastIndex) { target, (i, v) -> if(i + v >= target) i else target } == 0}

