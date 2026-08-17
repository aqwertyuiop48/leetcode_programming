/*
 * @lc app=leetcode id=1400 lang=kotlin
 *
 * [1400] Construct K Palindrome Strings
 */

class Solution { fun canConstruct(s: String, k: Int): Boolean = s.length >= k && s.groupingBy { it }.eachCount().values.count { it % 2 != 0 } <= k }