/*
 * @lc app=leetcode id=473 lang=kotlin
 *
 * [473] Matchsticks to Square
 */

class Solution { fun makesquare(matchsticks: IntArray): Boolean = matchsticks.sum().takeIf { it % 4 == 0 }?.let { sum -> matchsticks.sortedDescending().let { sticks -> DeepRecursiveFunction<Pair<Int, IntArray>, Boolean> { (idx, sides) -> idx == sticks.size || sticks[idx].let { stick -> sides.indices.any { i -> sides[i] + stick <= sum / 4 && callRecursive((idx + 1) to sides.apply { this[i] += stick }).also { sides[i] -= stick } } } }.invoke(0 to IntArray(4)) } } ?: false }

