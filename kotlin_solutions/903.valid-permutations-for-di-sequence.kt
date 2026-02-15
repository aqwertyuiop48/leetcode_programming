/*
 * @lc app=leetcode id=903 lang=kotlin
 *
 * [903] Valid Permutations for DI Sequence
 */

class Solution { fun numPermsDISequence(s: String) = s.fold(longArrayOf(1)) { dp, c -> LongArray(dp.size + 1) { j -> (if (c == 'D') j until dp.size else 0 until j).sumOf { dp[it] } % 1000000007 } }.sum().let { (it % 1000000007).toInt() } }
