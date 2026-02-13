/*
 * @lc app=leetcode id=301 lang=kotlin
 *
 * [301] Remove Invalid Parentheses
 */

class Solution(private val m: MutableMap<Int, MutableSet<String>> = mutableMapOf()) {private fun go(l: MutableList<Char>, a: CharArray, lp: Int, rp: Int, i: Int): Unit = (if (lp == rp) m.getOrPut(l.size) { mutableSetOf() }.add(l.joinToString("")) else Unit).let { (i..a.lastIndex).forEach { j -> if (lp >= rp) l.add(a[j]).also { when (a[j]) { '(' -> {go(l, a, lp + 1, rp, j + 1)} ')' -> {go(l, a, lp, rp + 1, j + 1)} else -> go(l, a, lp, rp, j + 1) }.also { l.removeAt(l.lastIndex) } } } } fun removeInvalidParentheses(s: String) = m.apply { clear() }.apply { go(mutableListOf(), s.toCharArray(), 0, 0, 0) }.let { it[it.keys.maxOrNull()]?.toList() ?: listOf("") }}