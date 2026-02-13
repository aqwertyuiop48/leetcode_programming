/*
 * @lc app=leetcode id=216 lang=kotlin
 *
 * [216] Combination Sum III
 */

class Solution { fun combinationSum3(k: Int, n: Int): List<List<Int>> = mutableListOf<List<Int>>().also { result -> DeepRecursiveFunction<Triple<Int, Int, MutableList<Int>>, Unit> { (start, target, path) -> when { path.size == k && target == 0 -> {result.add(path.toList())} path.size < k -> (start..9).forEach { i -> if (i <= target) { path.add(i) .also{callRecursive(Triple(i + 1, target - i, path))} .also{path.removeLast()} } } } }.invoke(Triple(1, n, mutableListOf())) } }
