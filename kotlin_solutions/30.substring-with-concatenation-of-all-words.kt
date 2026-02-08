/*
 * @lc app=leetcode id=30 lang=kotlin
 *
 * [30] Substring with Concatenation of All Words
 */

// @lc code=start
class Solution {fun findSubstring(s: String, words: Array<String>): List<Int> =if (s.isEmpty() || words.isEmpty()) emptyList() else (0..s.length - words.size * words[0].length).mapNotNull { i ->words.groupingBy { it }.eachCount().let { map ->(0 until words.size).map { j ->s.substring(i + j * words[0].length, i + (j + 1) * words[0].length)}.groupingBy { it }.eachCount().takeIf { counts -> counts.all { (w, c) -> c <= map.getOrDefault(w, 0) } }?.let { i }}}}
// @lc code=end

