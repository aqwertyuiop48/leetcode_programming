/*
 * @lc app=leetcode id=887 lang=kotlin
 *
 * [887] Super Egg Drop
 */

class Solution { fun superEggDrop(k: Int, n: Int) = generateSequence(IntArray(k + 1)) { dp -> IntArray(k + 1) { i -> if (i == 0) 0 else dp[i - 1] + dp[i] + 1 }.takeIf { it[k] < n } }.count() }
