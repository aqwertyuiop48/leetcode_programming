/*
 * @lc app=leetcode id=2901 lang=kotlin
 *
 * [2901] Longest Unequal Adjacent Groups Subsequence II
 */

class Solution {
    fun getWordsInLongestSubsequence(words: Array<String>, groups: IntArray): List<String> = IntArray(words.size) { 1 }.let { dp -> IntArray(words.size) { -1 }.let { prev -> words.indices.forEach { i -> (0 until i).forEach { j -> if (groups[i] != groups[j] && words[i].length == words[j].length && words[i].indices.count { k -> words[i][k] != words[j][k] } == 1 && dp[j] + 1 > dp[i]) dp[i] = (dp[j] + 1).also { prev[i] = j } } }.let { dp.indices.maxByOrNull { dp[it] }!! }.let { maxIdx -> generateSequence(maxIdx) { prev[it].takeIf { p -> p != -1 } }.map { words[it] }.toList().reversed() } } }
}