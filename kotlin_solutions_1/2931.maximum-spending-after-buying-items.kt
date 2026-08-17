/*
 * @lc app=leetcode id=2931 lang=kotlin
 *
 * [2931] Maximum Spending After Buying Items
 */

class Solution { fun maxSpending(values: Array<IntArray>): Long = values.flatMap { it.toList() }.map { it.toLong() }.sorted().mapIndexed { i, v -> v * (i + 1) }.sum() }