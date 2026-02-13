/*
 * @lc app=leetcode id=140 lang=kotlin
 *
 * [140] Word Break II
 */

class Solution { fun wordBreak(s: String, wordDict: List<String>): List<String> = wordDict.toSet().let { dict -> mutableListOf<String>().also { result -> DeepRecursiveFunction<Pair<Int, MutableList<String>>, Unit> { (start, path) -> if (start == s.length) result.add(path.joinToString(" ")) else (start + 1..s.length).forEach { end -> s.substring(start, end).takeIf { it in dict }?.let { path.add(it).let { callRecursive(end to path) }.also { path.removeLast() } } } }.invoke(0 to mutableListOf()) } } }
