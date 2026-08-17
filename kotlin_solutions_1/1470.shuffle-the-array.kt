/*
 * @lc app=leetcode id=1470 lang=kotlin
 *
 * [1470] Shuffle the Array
 */

class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray = IntArray(2 * n) { if (it % 2 == 0) nums[it / 2] else nums[n + it / 2] }
}