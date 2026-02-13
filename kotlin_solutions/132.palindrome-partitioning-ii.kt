/*
 * @lc app=leetcode id=132 lang=kotlin
 *
 * [132] Palindrome Partitioning II
 */

class Solution { fun minCut(s: String): Int = Array<Int?>(s.length) { null }.let { dp -> DeepRecursiveFunction<Int, Int> { i -> dp[i] ?: (if (i == s.length) 0 else (i..s.lastIndex) .filter { j -> (i..j).all { s[it] == s[j - (it - i)] } } .minOfOrNull { if (it + 1 == s.length) 0 else 1 + callRecursive(it + 1) }!! ).also { dp[i] = it } }.invoke(0) } }
