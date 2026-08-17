/* @lc app=leetcode id=2420 lang=kotlin */
class Solution {
    fun goodIndices(nums: IntArray, k: Int): List<Int> = IntArray(nums.size) { 1 }.also { d -> (1 until nums.size).forEach { if (nums[it] <= nums[it - 1]) d[it] = d[it - 1] + 1 } }.let { d -> IntArray(nums.size) { 1 }.also { i -> (nums.size - 2 downTo 0).forEach { if (nums[it] <= nums[it + 1]) i[it] = i[it + 1] + 1 } }.let { i -> (k until nums.size - k).filter { d[it - 1] >= k && i[it + 1] >= k } } }
}