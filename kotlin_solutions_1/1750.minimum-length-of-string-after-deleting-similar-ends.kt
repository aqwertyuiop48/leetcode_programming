/*
 * @lc app=leetcode id=1750 lang=kotlin
 *
 * [1750] Minimum Length of String After Deleting Similar Ends
 */

class Solution { fun minimumLength(s: String): Int = object { tailrec fun solve(l: Int, r: Int): Int = if (l < r && s[l] == s[r]) solve((l..r).firstOrNull { s[it] != s[l] } ?: (r + 1), (l..r).lastOrNull { s[it] != s[r] } ?: (l - 1)) else maxOf(0, r - l + 1) }.solve(0, s.length - 1) }