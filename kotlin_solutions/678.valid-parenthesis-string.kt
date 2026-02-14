/*
 * @lc app=leetcode id=678 lang=kotlin
 *
 * [678] Valid Parenthesis String
 */

class Solution { fun checkValidString(s: String): Boolean = s.fold(0 to 0) { (lo, hi), c -> (when(c) { '(' -> lo + 1 to hi + 1 ')'-> lo - 1 to hi - 1 else -> lo - 1 to hi + 1 }).let { (l, h) -> if (h < 0) return false else maxOf(l, 0) to h } }.let { it.first == 0 } }
