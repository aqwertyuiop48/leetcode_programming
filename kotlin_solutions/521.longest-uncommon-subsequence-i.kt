/*
 * @lc app=leetcode id=521 lang=kotlin
 *
 * [521] Longest Uncommon Subsequence I
 */

class Solution {fun findLUSlength(a: String, b: String) = if (a == b) -1 else maxOf(a.length, b.length)}

