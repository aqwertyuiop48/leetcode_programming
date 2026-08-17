/*
 * @lc app=leetcode id=3524 lang=kotlin
 *
 * [3524] Find X Value of Array I
 */

class Solution { fun resultArray(nums: IntArray, k: Int): LongArray = nums.fold(LongArray(k) to IntArray(k)) { (ans, cur), num -> (num % k).let { rem -> IntArray(k).also { it[rem]++ }.also { nxt -> (0 until k).forEach { j -> if (cur[j] > 0) nxt[(j * rem) % k] += cur[j] } }.also { nxt -> (0 until k).forEach { j -> ans[j] += nxt[j].toLong() } }.let { nxt -> ans to nxt } } }.first }