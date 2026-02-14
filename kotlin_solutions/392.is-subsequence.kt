/*
 * @lc app=leetcode id=392 lang=kotlin
 *
 * [392] Is Subsequence
 */

class Solution {fun isSubsequence(s: String, t: String): Boolean = s.fold(0) { idx, c -> t.indexOf(c, idx).takeIf { it >= 0 }?.plus(1) ?: return false }.let { true }}

