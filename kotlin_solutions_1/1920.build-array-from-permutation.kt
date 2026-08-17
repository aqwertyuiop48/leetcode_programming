/*
 * @lc app=leetcode id=1920 lang=kotlin
 *
 * [1920] Build Array from Permutation
 */

class Solution {
    fun buildArray(nums: IntArray): IntArray = IntArray(nums.size) { nums[nums[it]] }
}