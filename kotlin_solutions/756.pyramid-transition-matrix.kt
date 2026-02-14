/*
 * @lc app=leetcode id=756 lang=kotlin
 *
 * [756] Pyramid Transition Matrix
 */

class Solution { fun pyramidTransition(bottom: String, allowed: List<String>): Boolean = allowed.groupBy { it.take(2) }.mapValues { it.value.map { s -> s[2] } }.let { map -> DeepRecursiveFunction<String, Boolean> { curr -> when { curr.length == 1 -> {true} else -> (0 until curr.length - 1).fold(listOf("")) { acc, i -> acc.flatMap { prefix -> (map[curr.substring(i, i + 2)] ?: emptyList()).map { prefix + it } } }.any { callRecursive(it) } } }(bottom) } }
