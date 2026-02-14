/*
 * @lc app=leetcode id=395 lang=kotlin
 *
 * [395] Longest Substring with At Least K Repeating Characters
 */

class Solution {fun longestSubstring(s: String, k: Int): Int = if (s.length < k) 0 else s.groupingBy { it }.eachCount().filter { it.value < k }.keys.takeIf { it.isNotEmpty() }?.let { invalid -> s.split(*invalid.map { it.toString() }.toTypedArray()).maxOf { longestSubstring(it, k) } } ?: s.length}

