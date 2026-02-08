/*
 * @lc app=leetcode id=20 lang=kotlin
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution { fun isValid(s: String): Boolean = s.fold(mutableListOf<Char>()) { stack, c -> when (c) { '(', '{', '[' -> stack.apply { add(c) } else -> stack.takeIf { it.isNotEmpty() && mapOf(')' to '(', '}' to '{', ']' to '[')[c] == it.last() } ?.apply { removeAt(size - 1) } ?: return false } }.isEmpty() }
// @lc code=end

