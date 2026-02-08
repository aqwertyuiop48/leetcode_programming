/*
 * @lc app=leetcode id=39 lang=kotlin
 *
 * [39] Combination Sum
 */
class Solution {fun combinationSum(candidates: IntArray, target: Int, acc: List<Int> = listOf()): List<List<Int>> = candidates.filter { acc.isEmpty() || it >= acc.last() }.flatMap { c -> (target - c).run { when { this == 0 -> listOf(acc + c) this < 0 -> listOf() else -> combinationSum(candidates, this, acc + c) } } }}

