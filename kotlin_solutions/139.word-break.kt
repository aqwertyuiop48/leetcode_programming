/*
 * @lc app=leetcode id=139 lang=kotlin
 *
 * [139] Word Break
 */

class Solution { fun wordBreak(s: String, wordDict: List<String>): Boolean = wordDict.toSet().let { dict -> BooleanArray(s.length + 1).apply { this[0] = true }.also { dp -> (1..s.length).forEach { i -> (0 until i).forEach { j -> if (dp[j] && s.substring(j, i) in dict) dp[i] = true } } }[s.length] } }

