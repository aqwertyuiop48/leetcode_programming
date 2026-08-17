/*
 * @lc app=leetcode id=1021 lang=kotlin
 *
 * [1021] Remove Outermost Parentheses
 */

class Solution {
    fun removeOuterParentheses(s: String): String = buildString { s.fold(0) { d, c -> if (c == '(') (d + 1).also { if (d > 0) append(c) } else (d - 1).also { if (d > 1) append(c) } } }
}