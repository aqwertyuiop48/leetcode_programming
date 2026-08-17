/*
 * @lc app=leetcode id=3365 lang=java
 *
 * [3365] Rearrange K Substrings to Form Target String
 */

fun isPossibleToRearrange(s: String, t: String, k: Int): Boolean = s.length.let { n -> s.chunked(n / k).groupingBy { it }.eachCount() == t.chunked(n / k).groupingBy { it }.eachCount() }