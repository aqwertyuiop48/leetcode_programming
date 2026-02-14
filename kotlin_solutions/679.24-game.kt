/*
 * @lc app=leetcode id=679 lang=kotlin
 *
 * [679] 24 Game
 */

class Solution { fun judgePoint24(cards: IntArray): Boolean = DeepRecursiveFunction<List<Double>, Boolean> { nums -> when { nums.size == 1 -> kotlin.math.abs(nums[0] - 24.0) < 1e-6 else -> nums.indices.any { i -> nums.indices.filter { it != i }.any { j -> listOf(nums[i] + nums[j], nums[i] - nums[j], nums[i] * nums[j]).let { if (kotlin.math.abs(nums[j]) > 1e-6) it + (nums[i] / nums[j]) else it }.any { callRecursive(nums.filterIndexed { k, _ -> k != i && k != j } + it) } } } } }(cards.map { it.toDouble() }) }
