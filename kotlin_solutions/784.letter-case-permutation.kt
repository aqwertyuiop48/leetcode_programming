/*
 * @lc app=leetcode id=784 lang=kotlin
 *
 * [784] Letter Case Permutation
 */

class Solution { fun letterCasePermutation(s: String): List<String> = DeepRecursiveFunction<Pair<Int, String>, List<String>> { (i, cur) -> if (i == s.length) listOf(cur) else if (s[i].isLetter()) callRecursive(i + 1 to cur + s[i].lowercaseChar()) + callRecursive(i + 1 to cur + s[i].uppercaseChar()) else callRecursive(i + 1 to cur + s[i]) }.invoke(0 to "") }