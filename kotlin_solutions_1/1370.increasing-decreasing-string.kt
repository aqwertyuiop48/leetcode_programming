/*
 * @lc app=leetcode id=1370 lang=kotlin
 *
 * [1370] Increasing Decreasing String
 */

class Solution { fun sortString(s: String): String = IntArray(26).also { count -> s.forEach { count[it - 'a']++ } }.let { count -> StringBuilder().apply { while (length < s.length) listOf(0..25, 25 downTo 0).forEach { range -> range.forEach { if (count[it] > 0) count[it]--.also { _ -> append('a' + it) } } } }.toString() } }