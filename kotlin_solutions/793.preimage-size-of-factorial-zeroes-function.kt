/*
 * @lc app=leetcode id=793 lang=kotlin
 *
 * [793] Preimage Size of Factorial Zeroes Function
 */

class Solution { fun preimageSizeFZF(k: Int): Int = DeepRecursiveFunction<Triple<Long, Long, Int>, Int> { (low, high, target) -> (low <= high).let { inRange -> if (!inRange) 0 else (low + (high - low) / 2).let { mid -> generateSequence(mid to 0L) { (v, a) -> (v / 5).takeIf { it != 0L }?.let { it to a + it } } .last().second.let { ans -> when { ans == target.toLong() -> {5} ans > target -> {callRecursive(Triple(low, mid - 1, target))} else -> {callRecursive(Triple(mid + 1, high, target))} } } } } }(Triple(0L, 10000000000L, k)) }