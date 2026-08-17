/*
 * @lc app=leetcode id=3258 lang=java
 *
 * [3258] Count Substrings That Satisfy K-Constraint I
 */
class Solution { fun countKConstraintSubstrings(s: String, k: Int): Int = s.indices.sumOf { i -> (i until s.length).count { j -> s.substring(i, j + 1).let { sub -> sub.count { it == '0' } <= k || sub.count { it == '1' } <= k } } } }