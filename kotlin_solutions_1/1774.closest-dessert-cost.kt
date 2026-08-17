/*
 * @lc app=leetcode id=1774 lang=kotlin
 *
 * [1774] Closest Dessert Cost
 */
class Solution { fun closestCost(baseCosts: IntArray, toppingCosts: IntArray, target: Int): Int = baseCosts.flatMap { base -> toppingCosts.fold(setOf(base)) { acc, top -> acc.flatMap { listOf(it, it + top, it + 2 * top) }.filter { it <= target + (target - baseCosts.minOrNull()!!).coerceAtLeast(0) }.toSet() } }.minWithOrNull(compareBy<Int> { kotlin.math.abs(it - target) }.thenBy { it }) ?: 0 }