/*
 * @lc app=leetcode id=485 lang=kotlin
 *
 * [485] Max Consecutive Ones
 */

class Solution {fun findMaxConsecutiveOnes(nums: IntArray): Int =nums.joinToString("").split("0").maxOf { it.length }}
