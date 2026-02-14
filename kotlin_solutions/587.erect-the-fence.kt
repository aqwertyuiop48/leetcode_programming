/*
 * @lc app=leetcode id=587 lang=kotlin
 *
 * [587] Erect the Fence
 */

class Solution { fun outerTrees(trees: Array<IntArray>): Array<IntArray> = trees.takeIf { it.size <= 3 }?.let { it } ?: trees.sortedWith(compareBy<IntArray> { it[0] }.thenBy { it[1] }) .let { sorted -> sorted.fold(mutableListOf<IntArray>() to mutableListOf<IntArray>()) { (up, lo), curr -> up.apply { while (size >= 2 && ((this[size - 1][0] - this[size - 2][0]) * (curr[1] - this[size - 1][1]) - (this[size - 1][1] - this[size - 2][1]) * (curr[0] - this[size - 1][0])) < 0) removeAt(lastIndex) }.add(curr).let { lo.apply { while (size >= 2 && ((this[size - 1][0] - this[size - 2][0]) * (curr[1] - this[size - 1][1]) - (this[size - 1][1] - this[size - 2][1]) * (curr[0] - this[size - 1][0])) > 0) removeAt(lastIndex) }.add(curr) } .run{up to lo} } }.let { (up, lo) -> (up + lo).distinct().toTypedArray() } }
