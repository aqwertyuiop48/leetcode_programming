/*
 * @lc app=leetcode id=1156 lang=kotlin
 *
 * [1156] Swap For Longest Repeated Character Substring
 */

class Solution { fun maxRepOpt1(text: String): Int = text.groupingBy { it }.eachCount().let { count -> text.fold(mutableListOf<Pair<Char, Int>>()) { acc, c -> acc.also { if (it.isNotEmpty() && it.last().first == c) it[it.lastIndex] = c to (it.last().second + 1) else it.add(c to 1) } }.let { runs -> runs.indices.maxOf { i -> maxOf(minOf(runs[i].second + 1, count.getValue(runs[i].first)), if (i + 2 < runs.size && runs[i + 1].second == 1 && runs[i].first == runs[i + 2].first) minOf(runs[i].second + runs[i + 2].second + 1, count.getValue(runs[i].first)) else 0) } } } }