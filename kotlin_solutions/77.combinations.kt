/*
 * @lc app=leetcode id=77 lang=kotlin
 *
 * [77] Combinations
 */

class Solution { fun combine(n: Int, k: Int): List<List<Int>> = (1..n).fold(listOf(listOf<Int>())) { acc, i -> acc.flatMap { list -> if (list.size < k && (list.isEmpty() || list.last() < i)) listOf(list, list + i) else listOf(list) } }.filter { it.size == k } }

