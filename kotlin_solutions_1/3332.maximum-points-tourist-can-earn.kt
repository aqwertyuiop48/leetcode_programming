/*
 * @lc app=leetcode id=3332 lang=java
 *
 * [3332] Maximum Points Tourist Can Earn
 */
fun maxScore(n: Int, k: Int, stayScore: Array<IntArray>, travelScore: Array<IntArray>): Int = IntArray(n).let { dp -> (0 until k).fold(dp) { curr, d -> IntArray(n).also { next -> (0 until n).forEach { j -> (0 until n).forEach { i -> next[j] = maxOf(next[j], curr[i] + if (i == j) stayScore[d][j] else travelScore[i][j]) } } } } }.maxOrNull() ?: 0