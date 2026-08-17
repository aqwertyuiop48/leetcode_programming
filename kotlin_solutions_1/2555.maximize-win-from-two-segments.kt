/*
 * @lc app=leetcode id=2555 lang=kotlin
 *
 * [2555] Maximize Win From Two Segments
 */

class Solution { fun maximizeWin(p: IntArray, k: Int): Int = IntArray(p.size).let { dp -> p.indices.fold(0 to 0) { (left, maxW), i -> (left..i).fold(left) { l, _ -> if (p[i] - p[l] > k) l + 1 else l }.let { newL -> (i - newL + 1).let { cur -> maxOf(maxW, cur + if (newL > 0) dp[newL - 1] else 0).also { dp[i] = maxOf(if (i > 0) dp[i - 1] else 0, cur) }.let { newM -> newL to newM } } } }.second } }