/*
 * @lc app=leetcode id=763 lang=kotlin
 *
 * [763] Partition Labels
 */

class Solution {fun partitionLabels(s: String) = IntArray(26).apply { s.forEachIndexed { i, c -> this[c - 'a'] = i } }.let { last -> s.foldIndexed(Triple(mutableListOf<Int>(), -1, 0)) { i, (res, prev, end), c -> maxOf(end, last[c - 'a']).let { newEnd -> Triple(res.apply { if (i == newEnd) add(newEnd - prev) }, if (i == newEnd) newEnd else prev, newEnd) } }.first }}
