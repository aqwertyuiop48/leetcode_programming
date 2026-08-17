/*
 * @lc app=leetcode id=1312 lang=kotlin
 *
 * [1312] Minimum Insertion Steps to Make a String Palindrome
 */
class Solution { fun minInsertions(s: String): Int = s.length - s.fold(IntArray(s.length + 1)) { dp, c1 -> s.reversed().foldIndexed(IntArray(s.length + 1)) { j, nextDp, c2 -> nextDp.also { it[j + 1] = if (c1 == c2) dp[j] + 1 else maxOf(dp[j + 1], nextDp[j]) } } }.last() }