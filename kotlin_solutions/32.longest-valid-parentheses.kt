/*
 * @lc app=leetcode id=32 lang=kotlin
 *
 * [32] Longest Valid Parentheses
 */

class Solution {fun longestValidParentheses(s: String): Int =s.foldIndexed(Pair(mutableListOf(-1), 0)) { i, (stack, maxLen), c ->when (c) {'(' -> stack.apply { add(i) } to maxLen else -> stack.apply { if (isNotEmpty()) removeAt(size - 1) }.let { if (it.isEmpty()) it.apply { add(i) } to maxLen else it to maxOf(maxLen, i - it.last()) }}}.second}

