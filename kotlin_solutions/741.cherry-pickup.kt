/*
 * @lc app=leetcode id=741 lang=kotlin
 *
 * [741] Cherry Pickup
 */

class Solution(val memo: MutableMap<String, Int> = mutableMapOf()) { fun cherryPickup(grid: Array<IntArray>): Int = maxOf(0, grid.dfs(0, 0, 0, 0)) fun Array<IntArray>.dfs(y1: Int, x1: Int, y2: Int, x2: Int): Int = when { y1 == size - 1 && x1 == this[0].size - 1 -> {if (this[y1][x1] == 1) 1 else 0} y1 !in 0 until size || y2 !in 0 until size || x1 !in 0 until this[0].size || x2 !in 0 until this[0].size -> {Int.MIN_VALUE} this[y1][x1] == -1 || this[y2][x2] == -1 -> {Int.MIN_VALUE} memo["$y1.$x1.$y2.$x2"] != null -> {memo["$y1.$x1.$y2.$x2"]!!} else -> (if (y1 == y2 && x1 == x2) this[y1][x1] else this[y1][x1] + this[y2][x2]).let { collected -> maxOf( dfs(y1, x1 + 1, y2, x2 + 1), dfs(y1, x1 + 1, y2 + 1, x2), dfs(y1 + 1, x1, y2, x2 + 1), dfs(y1 + 1, x1, y2 + 1, x2) ).let { memo["$y1.$x1.$y2.$x2"] = it + collected }.let { memo["$y1.$x1.$y2.$x2"]!! } } } }

