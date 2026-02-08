/*
 * @lc app=leetcode id=8 lang=kotlin
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution { fun myAtoi(s: String) = "(^[-+]?\\d+)([\\s+-.\\dA-Za-z]*)".toRegex().find(s.trimStart())?.destructured?.let { (num) -> try { num.toInt() } catch (e: Exception) { if (num.firstOrNull() != '-') Int.MAX_VALUE else Int.MIN_VALUE } } ?: 0 }
// @lc code=end

