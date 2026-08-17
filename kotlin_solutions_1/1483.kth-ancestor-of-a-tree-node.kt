/*
 * @lc app=leetcode id=1483 lang=kotlin
 *
 * [1483] Kth Ancestor of a Tree Node
 */

class TreeAncestor(n: Int, parent: IntArray, val up: Array<IntArray> = Array(n) { i -> IntArray(17).apply { this[0] = parent[i] } }.apply { (1..16).forEach { j -> (0 until n).forEach { i -> this[i][j] = if (this[i][j - 1] != -1) this[this[i][j - 1]][j - 1] else -1 } } }, val getKthAncestor: (Int, Int) -> Int = { node, k -> (0..16).fold(node) { curr, j -> if (curr == -1 || (k and (1 shl j)) == 0) curr else up[curr][j] } })