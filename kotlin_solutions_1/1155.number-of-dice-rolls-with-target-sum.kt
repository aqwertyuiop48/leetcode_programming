/*
 * @lc app=leetcode id=1155 lang=kotlin
 *
 * [1155] Number of Dice Rolls With Target Sum
 */

class Solution { fun numRollsToTarget(n: Int, k: Int, target: Int): Int = (1..n).fold(IntArray(target + 1).apply { this[0] = 1 }) { dp, _ -> IntArray(target + 1) { j -> if (j == 0) 0 else (1..minOf(j, k)).fold(0L) { acc, x -> (acc + dp[j - x]) % 1000000007 }.toInt() } }[target] }