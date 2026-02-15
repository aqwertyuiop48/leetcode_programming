/*
 * @lc app=leetcode id=2609 lang=kotlin
 *
 * [2609] Find the Longest Balanced Substring of a Binary String
 */

class Solution {fun findTheLongestBalancedSubstring(s: String) = s.split("0").filter { it.isNotEmpty() }.sortedByDescending { it.length }.let { ones -> s.split("1").filter { it.isNotEmpty() }.sortedByDescending { it.length }.flatMap { zero -> ones.map { one -> if (s.contains(zero + one)) minOf(zero.length, one.length) * 2 else 0 } } }.maxOrNull() ?: 0}

