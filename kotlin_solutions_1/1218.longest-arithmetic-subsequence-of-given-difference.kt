/*
 * @lc app=leetcode id=1218 lang=kotlin
 *
 * [1218] Longest Arithmetic Subsequence of Given Difference
 */

class Solution {
    fun longestSubsequence(arr: IntArray, difference: Int): Int = arr.fold(mutableMapOf<Int, Int>()) { dp, x -> dp.apply { this[x] = getOrDefault(x - difference, 0) + 1 } }.values.maxOrNull() ?: 0
}