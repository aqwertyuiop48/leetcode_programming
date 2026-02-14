/*
 * @lc app=leetcode id=427 lang=kotlin
 *
 * [427] Construct Quad Tree
 */

class Solution { fun construct(grid: Array<IntArray>): Node? = object { fun dfs(r1: Int, c1: Int, width: Int): Node = if (width == 1) Node(grid[r1][c1] == 1, true) else (width shr 1).let { newWidth -> listOf( dfs(r1, c1, newWidth), dfs(r1, c1 + newWidth, newWidth), dfs(r1 + newWidth, c1, newWidth), dfs(r1 + newWidth, c1 + newWidth, newWidth) ).let { (a, b, c, d) -> if (a.isLeaf && b.isLeaf && c.isLeaf && d.isLeaf && a.`val` == b.`val` && b.`val` == c.`val` && c.`val` == d.`val`) Node(a.`val`, true) else Node(true, false).apply { topLeft = a .also{topRight = b} .also{bottomLeft = c} .also{bottomRight = d} } } } }.dfs(0, 0, grid.size) }

