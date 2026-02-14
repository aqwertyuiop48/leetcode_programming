/*
 * @lc app=leetcode id=844 lang=kotlin
 *
 * [844] Backspace String Compare
 */

class Solution { fun backspaceCompare(s: String, t: String): Boolean = s.fold(mutableListOf<Char>()) { acc, c -> acc.apply { if (c == '#') { if (isNotEmpty()) removeAt(lastIndex) } else add(c) } }.let { sProcessed -> t.fold(mutableListOf<Char>()) { acc, c -> acc.apply { if (c == '#') { if (isNotEmpty()) removeAt(lastIndex) } else add(c) } }.let { tProcessed -> sProcessed == tProcessed } } }

