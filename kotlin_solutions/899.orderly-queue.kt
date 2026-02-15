/*
 * @lc app=leetcode id=899 lang=kotlin
 *
 * [899] Orderly Queue
 */

class Solution { fun orderlyQueue(s: String, k: Int) = if (k > 1) s.toList().sorted().joinToString("") else (0 until s.length).minOf { s.substring(it) + s.substring(0, it) } }