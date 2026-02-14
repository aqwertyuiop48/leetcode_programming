/*
 * @lc app=leetcode id=823 lang=kotlin
 *
 * [823] Binary Trees With Factors
 */

class Solution { fun numFactoredBinaryTrees(arr: IntArray): Int = arr.sortedArray().let { sorted -> sorted.toSet().let { set -> mutableMapOf<Int, Long>().let { dp -> DeepRecursiveFunction<Int, Long> { a -> dp.getOrPut(a) { 1L + sorted.sumOf { if (a % it == 0 && set.contains(a / it)) callRecursive(it) * callRecursive(a / it) else 0L } } }.let { dfs -> (sorted.sumOf { dfs(it) } % 1_000_000_007L).toInt() } } } } }

