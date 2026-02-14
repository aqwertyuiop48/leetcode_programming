/*
 * @lc app=leetcode id=583 lang=kotlin
 *
 * [583] Delete Operation for Two Strings
 */

class Solution { fun minDistance(word1: String, word2: String): Int = Array(word1.length + 1) { IntArray(word2.length + 1) } .apply { (1..word1.length).forEach { i -> (1..word2.length).forEach { j -> this[i][j] = if (word1[i - 1] == word2[j - 1]) this[i - 1][j - 1] + 1 else maxOf(this[i - 1][j], this[i][j - 1]) } } }.let { dp -> word1.length + word2.length - 2 * dp[word1.length][word2.length] } }

