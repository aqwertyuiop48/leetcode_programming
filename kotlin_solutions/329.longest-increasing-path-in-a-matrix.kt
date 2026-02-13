/*
 * @lc app=leetcode id=329 lang=kotlin
 *
 * [329] Longest Increasing Path in a Matrix
 */

class Solution {fun longestIncreasingPath(matrix: Array<IntArray>): Int = Array(matrix.size) { IntArray(matrix[it].size) { -1 } }.let { longestPath -> DeepRecursiveFunction<Pair<Int, Int>, Int> { (x, y) -> longestPath[x][y].takeIf { it != -1 } ?: matrix[x][y].let { curr -> listOf(x - 1 to y to (if (x > 0) matrix[x - 1][y] else -1), x + 1 to y to (if (x < matrix.lastIndex) matrix[x + 1][y] else -1), x to y - 1 to (if (y > 0) matrix[x][y - 1] else -1), x to y + 1 to (if (y < matrix[x].lastIndex) matrix[x][y + 1] else -1)).map { (pos, neighbor) -> if (curr < neighbor) 1 + callRecursive(pos) else 1 }.maxOrNull()!!.also { longestPath[x][y] = it } } }.let { dfs -> matrix.indices.flatMap { i -> matrix[i].indices.map { j -> i to j } }.maxOf { dfs(it) } } }}
