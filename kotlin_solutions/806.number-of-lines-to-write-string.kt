/*
 * @lc app=leetcode id=806 lang=kotlin
 *
 * [806] Number of Lines To Write String
 */

class Solution { fun numberOfLines(widths: IntArray, s: String): IntArray = s.fold(1 to 0) { (lines, width), c -> (widths[c - 'a'] + width).let { if (it > 100) lines + 1 to widths[c - 'a'] else lines to it } }.let { intArrayOf(it.first, it.second) } }