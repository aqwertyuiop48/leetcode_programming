/*
 * @lc app=leetcode id=22 lang=kotlin
 *
 * [22] Generate Parentheses
 */

// @lc code=start
class Solution { fun generateParenthesis(n: Int): List<String> = generateSequence(listOf(Triple("", 0, 0))) { curr -> curr.flatMap { (s, open, close) -> listOfNotNull( (open < n).takeIf { it }?.let { Triple(s + "(", open + 1, close) }, (close < open).takeIf { it }?.let { Triple(s + ")", open, close + 1) } ) }.takeIf { it.isNotEmpty() } }.last().map { it.first } }
// @lc code=end

