/*
 * @lc app=leetcode id=1365 lang=kotlin
 *
 * [1365] How Many Numbers Are Smaller Than the Current Number
 */

class Solution { fun smallerNumbersThanCurrent(nums: IntArray): IntArray = nums.sorted().let { sorted -> nums.map { sorted.indexOf(it) }.toIntArray() } }