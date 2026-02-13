/*
 * @lc app=leetcode id=316 lang=kotlin
 *
 * [316] Remove Duplicate Letters
 */

class Solution {fun removeDuplicateLetters(s: String): String = s.groupingBy { it }.eachCount().toMutableMap().let { count -> s.fold(mutableSetOf<Char>()) { stack, c -> count.apply { this[c] = this[c]!! - 1 }.run { if (c !in stack) generateSequence { stack.takeIf { it.isNotEmpty() && c < it.last() && count[it.last()]!! > 0 }?.apply { remove(last()) } }.count().run { stack.apply { add(c) } } else stack } } }.joinToString("")}