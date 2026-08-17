/*
 * @lc app=leetcode id=1449 lang=kotlin
 *
 * [1449] Form Largest Integer With Digits That Add up to Target
 */

class Solution { fun largestNumber(cost: IntArray, target: Int): String = IntArray(target + 1) { -1 }.apply { this[0] = 0 }.apply { (1..target).forEach { i -> this[i] = (0..8).mapNotNull { d -> if (i >= cost[d] && this[i - cost[d]] != -1) this[i - cost[d]] + 1 else null }.maxOrNull() ?: -1 } }.let { dp -> if (dp[target] == -1) "0" else DeepRecursiveFunction<Int, String> { rem -> if (rem == 0) "" else (8 downTo 0).first { d -> rem >= cost[d] && dp[rem] == dp[rem - cost[d]] + 1 }.let { d -> "${d + 1}" + callRecursive(rem - cost[d]) } }.callRecursive(target) } }