/*
 * @lc app=leetcode id=189 lang=kotlin
 *
 * [189] Rotate Array
 */

class Solution {fun rotate(nums: IntArray, k: Int): Unit =(k % nums.size).let { steps ->nums.reverse().also{nums.reverse(0, steps)}.also{nums.reverse(steps, nums.size)}}}
