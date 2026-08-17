/*
 * @lc app=leetcode id=2767 lang=kotlin
 *
 * [2767] Partition String Into Minimum Beautiful Substrings
 */

class Solution { fun minimumBeautifulSubstrings(s: String): Int = DeepRecursiveFunction<Int, Int> { i -> if (i == s.length) 0 else (i until s.length).filter { j -> s[i] != '0' && s.substring(i, j + 1).toInt(2) in setOf(1, 5, 25, 125, 625, 3125, 15625) }.map { j -> callRecursive(j + 1) }.filter { it != -1 }.minOrNull()?.plus(1) ?: -1 }.invoke(0) }