/*
 * @lc app=leetcode id=1525 lang=kotlin
 *
 * [1525] Number of Good Ways to Split a String
 */

class Solution {
    fun numSplits(s: String): Int = IntArray(26).apply { s.forEach { this[it - 'a']++ } }.let { right -> IntArray(26).let { left -> s.substring(0, s.length - 1).fold(Triple(0, right.count { it > 0 }, 0)) { (leftU, rightU, ans), char -> (char - 'a').let { c -> (leftU + if (left[c]++ == 0) 1 else 0).let { nLeftU -> (rightU - if (--right[c] == 0) 1 else 0).let { nRightU -> Triple(nLeftU, nRightU, ans + if (nLeftU == nRightU) 1 else 0) } } } }.third } }
}