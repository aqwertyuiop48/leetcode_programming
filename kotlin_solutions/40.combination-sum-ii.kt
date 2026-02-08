/*
 * @lc app=leetcode id=40 lang=kotlin
 *
 * [40] Combination Sum II
 */

class Solution {fun combinationSum2(candidates: IntArray, target: Int, acc: List<Int> = listOf(), idx: Int = 0): List<List<Int>> = candidates.sorted().let { sorted -> sorted.drop(idx).filterIndexed { i, c -> i == 0 || c != sorted.drop(idx)[i - 1] }.filter { acc.isEmpty() || it >= acc.last() }.flatMap { c -> (target - c).run { when { this == 0 -> listOf(acc + c) this < 0 -> listOf() else -> combinationSum2(candidates, this, acc + c, (idx until sorted.size).firstOrNull { sorted[it] == c } ?.plus(1) ?: (idx + 1)) } } } }}

