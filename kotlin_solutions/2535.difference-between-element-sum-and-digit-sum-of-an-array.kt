/*
 * @lc app=leetcode id=2535 lang=kotlin
 *
 * [2535] Difference Between Element Sum and Digit Sum of an Array
 */

class Solution { fun differenceOfSum(nums: IntArray): Int = nums.sumOf{ number -> abs( number - number.toString().sumOf { it - '0' }) } }
