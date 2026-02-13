/*
 * @lc app=leetcode id=213 lang=kotlin
 *
 * [213] House Robber II
 */

class Solution {fun rob(nums: IntArray): Int =if (nums.size == 1) nums[0]else maxOf( nums.take(nums.size - 1).fold(0 to 0) { (p2, p1), n -> p1 to maxOf(p1, p2 + n) }.second,nums.drop(1).fold(0 to 0) { (p2, p1), n -> p1 to maxOf(p1, p2 + n) }.second)}

