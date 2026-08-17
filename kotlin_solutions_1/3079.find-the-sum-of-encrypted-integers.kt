/*
 * @lc app=leetcode id=3079 lang=kotlin
 *
 * [3079] Find the Sum of Encrypted Integers
 */

class Solution { fun sumOfEncryptedInt(nums: IntArray): Int = nums.sumOf { x -> x.toString().let { s -> s.maxOrNull()!!.toString().repeat(s.length).toInt() } } }