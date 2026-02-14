/*
 * @lc app=leetcode id=753 lang=kotlin
 *
 * [753] Cracking the Safe
 */

class Solution { fun crackSafe(n: Int, k: Int): String = (0 until k).toList().map { it.toString() }.let { variants -> mutableSetOf<String>().apply { DeepRecursiveFunction<Pair<StringBuilder, Int>, Unit> { (current, goalLen) -> if (current.length == goalLen) add(current.toString()) else variants.forEach { v -> current.append(v).also { callRecursive(current to goalLen) }.run { current.deleteCharAt(current.lastIndex) } } }(StringBuilder() to n) }.let { allCombs -> if (allCombs.size == 1) allCombs.first() else mutableMapOf<String, MutableList<String>>().apply { allCombs.forEach { comb -> (0 until k).forEach { digit -> "${comb.substring(1)}$digit".let { newComb -> if (newComb in allCombs && newComb != comb) getOrPut(comb) { mutableListOf() }.add(newComb) } } } }.let { adjMap -> mutableListOf<String>().let { path -> DeepRecursiveFunction<String, Boolean> { at -> path.add(at).let { path.size == adjMap.keys.size || (adjMap[at] ?: emptyList()).any { dir -> (dir !in path) && (callRecursive(dir) || path.remove(dir).let { false }) }} }(adjMap.keys.first()) .run{ StringBuilder().apply { path.forEach { item -> if (isEmpty()) append(item) else generateSequence(n - 1) { it - 1 }.first { cnt -> takeLast(cnt) == item.take(cnt) }.let { skip -> append(item.takeLast(n - skip)) } } }.toString() } } } } } }
