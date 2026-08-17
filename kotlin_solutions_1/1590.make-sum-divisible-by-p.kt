/*
 * @lc app=leetcode id=1590 lang=kotlin
 *
 * [1590] Make Sum Divisible by P
 */

class Solution { fun minSubarray(nums: IntArray, p: Int): Int = nums.fold(0L) { acc, x -> (acc + x) % p }.toInt().let { rem -> if (rem == 0) 0 else mutableMapOf(0 to -1).let { map -> nums.indices.fold(0 to nums.size) { (cur, minLen), i -> ((cur + nums[i]) % p).let { newCur -> (newCur to minOf(minLen, i - (map[(newCur - rem + p) % p] ?: -nums.size))).also { map[newCur] = i } } }.second.let { if (it < nums.size) it else -1 } } } }