/*
 * @lc app=leetcode id=28 lang=kotlin
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {fun strStr(haystack: String, needle: String): Int =(0..haystack.length - needle.length).firstOrNull { haystack.substring(it, it + needle.length) == needle } ?: -1}
// @lc code=end

