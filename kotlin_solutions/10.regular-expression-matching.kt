/*
 * @lc app=leetcode id=10 lang=kotlin
 *
 * [10] Regular Expression Matching
 */

// @lc code=start
class Solution {fun isMatch(s: String, p: String): Boolean {return Regex("^" + p + "$").matches(s)}}
// @lc code=end

