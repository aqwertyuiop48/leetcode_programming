/*
 * @lc app=leetcode id=3303 lang=java
 *
 * [3303] Find the Occurrence of First Almost Equal Substring
 */

class Solution {
    fun minStartingIndex(s: String, pattern: String): Int = (pattern + s).let { s1 -> (pattern.reversed() + s.reversed()).let { s2 -> { str: String -> IntArray(str.length).apply { intArrayOf(0, 0).let { lr -> (1 until str.length).forEach { i -> run { if (i <= lr[1]) this[i] = minOf(lr[1] - i + 1, this[i - lr[0]]) }.run { while (i + this[i] < str.length && str[this[i]] == str[i + this[i]]) this[i]++ }.run { if (i + this[i] - 1 > lr[1]) run { lr[0] = i }.run { lr[1] = i + this[i] - 1 } } } } } }.let { zFunc -> zFunc(s1).let { z1 -> zFunc(s2).let { z2 -> (0..s.length - pattern.length).find { i -> z1[pattern.length + i] + 1 + z2[s.length - i] >= pattern.length } ?: -1 } } } } }
}