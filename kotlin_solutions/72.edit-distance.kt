/*
 * @lc app=leetcode id=72 lang=kotlin
 *
 * [72] Edit Distance
 */

class Solution {fun minDistance(word1: String, word2: String, i1: Int = 0, i2: Int = 0, memo: Array<IntArray> = Array(word1.length) { IntArray(word2.length) { -1 } }): Int = when {i1 == word1.length -> {word2.length - i2}i2 == word2.length -> {word1.length - i1}memo[i1][i2] != -1 -> {memo[i1][i2]}else -> (if (word1[i1] == word2[i2]) minDistance(word1, word2, i1 + 1, i2 + 1, memo) else 1 + minOf(minDistance(word1, word2, i1 + 1, i2, memo), minDistance(word1, word2, i1, i2 + 1, memo), minDistance(word1, word2, i1 + 1, i2 + 1, memo))).also { memo[i1][i2] = it }}}

