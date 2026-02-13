/*
 * @lc app=leetcode id=131 lang=kotlin
 *
 * [131] Palindrome Partitioning
 */

class Solution { fun partition(s: String): List<List<String>> = mutableListOf<List<String>>().also { result -> DeepRecursiveFunction<Pair<Int, MutableList<String>>, Unit> { (start, path) -> if (start == s.length) result.add(path.toList()) else (start until s.length).forEach { end -> s.substring(start, end + 1).takeIf { it == it.reversed() }?.let { path.add(it) .also{callRecursive(end + 1 to path)} .also{path.removeLast()} } } }.invoke(0 to mutableListOf()) } }

