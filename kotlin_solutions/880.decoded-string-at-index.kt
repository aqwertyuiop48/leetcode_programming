/*
 * @lc app=leetcode id=880 lang=kotlin
 *
 * [880] Decoded String at Index
 */

class Solution { fun decodeAtIndex(s: String, k: Int) = s.fold(0L) { size, c -> if (c.isDigit()) size * (c - '0') else size + 1 }.let { totalSize -> s.reversed().fold(k.toLong() to totalSize) { (index, size), c -> (index % size).let { newIndex -> if (c.isDigit()) newIndex to (size / (c - '0')) else if (newIndex == 0L || newIndex == size) return c.toString() else newIndex to (size - 1) } } }.let { "" } }

