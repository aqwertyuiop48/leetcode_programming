/* @lc app=leetcode id=2597 lang=kotlin */
class Solution {
    fun beautifulSubsets(nums: IntArray, k: Int): Int = (1 until (1 shl nums.size)).count { m -> nums.indices.filter { (m shr it) and 1 == 1 }.let { s -> s.all { i -> s.all { j -> i == j || kotlin.math.abs(nums[i] - nums[j]) != k } } } }
}