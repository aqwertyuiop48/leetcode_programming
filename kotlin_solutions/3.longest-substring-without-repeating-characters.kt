/*
 * @lc app=leetcode id=3 lang=kotlin
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {fun lengthOfLongestSubstring(s: String): Int =s.foldIndexed(Triple(0, 0, mutableMapOf<Char, Int>())) { i, (maxLen, start, map), c ->(map[c]?.let { maxOf(start, it + 1) } ?: start).let { newStart ->Triple(maxOf(maxLen, i - newStart + 1), newStart, map.apply { put(c, i) })}}.first}
// @lc code=end

