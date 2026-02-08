/*
 * @lc app=leetcode id=14 lang=kotlin
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution { fun longestCommonPrefix(strs: Array<String>): String = strs.minByOrNull { it.length }?.indices?.takeWhile { i -> strs.all { it[i] == strs[0][i] } } ?.lastOrNull()?.let { strs[0].substring(0, it + 1) } ?: "" }
// @lc code=end

