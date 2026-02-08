/*
 * @lc app=leetcode id=17 lang=kotlin
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution { fun letterCombinations(digits: String): List<String> = if (digits.isEmpty()) emptyList() else digits.fold(listOf("")) { acc, d -> acc.flatMap { s -> mapOf('2' to "abc", '3' to "def", '4' to "ghi", '5' to "jkl", '6' to "mno", '7' to "pqrs", '8' to "tuv", '9' to "wxyz")[d]!! .map { s + it } } } }
// @lc code=end

