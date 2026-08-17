/*
 * @lc app=leetcode id=1774 lang=kotlin
 *
 * [1774] Closest Dessert Cost
 */
class Solution { fun closestCost(baseCosts: IntArray, toppingCosts: IntArray, target: Int): Int = baseCosts.flatMap { base -> toppingCosts.fold(setOf(base)) { totals, topping -> totals.flatMap { total -> listOf(total, total + topping, total + 2 * topping) }.toSet() } }.minWithOrNull(compareBy<Int> { kotlin.math.abs(it - target) }.thenBy { it }) ?: 0 }