/*
 * @lc app=leetcode id=1048 lang=kotlin
 *
 * [1048] Longest String Chain
 */

class Solution { fun longestStrChain(words: Array<String>): Int = HashMap<String, Int>().let { dp -> words.sortedBy { it.length }.fold(0) { maxChain, word -> (0 until word.length).maxOf { i -> (dp[word.substring(0, i) + word.substring(i + 1)] ?: 0) + 1 }.also { len -> dp[word] = len }.let { len -> maxOf(maxChain, len) } } } }