/*
 * @lc app=leetcode id=1743 lang=kotlin
 *
 * [1743] Restore the Array From Adjacent Pairs
 */
class Solution { fun restoreArray(adjacentPairs: Array<IntArray>): IntArray = mutableMapOf<Int, MutableList<Int>>().also { m -> adjacentPairs.forEach { (u, v) -> m.getOrPut(u) { mutableListOf() }.add(v).run { m.getOrPut(v) { mutableListOf() }.add(u) } } }.let { m -> IntArray(adjacentPairs.size + 1).also { it[0] = m.entries.first { e -> e.value.size == 1 }.key }.also { it[1] = m[it[0]]!![0] }.also { res -> (2..adjacentPairs.size).forEach { i -> res[i] = m[res[i - 1]]!!.first { it != res[i - 2] } } } } }