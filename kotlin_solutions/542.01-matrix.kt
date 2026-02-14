/*
 * @lc app=leetcode id=542 lang=kotlin
 *
 * [542] 01 Matrix
 */

class Solution { fun updateMatrix(mat: Array<IntArray>) = Array(mat.size) { IntArray(mat[0].size) { Int.MAX_VALUE / 2 } }.apply { mat.indices.flatMap { i -> mat[0].indices.map { i to it } }.onEach { (i, j) -> if (mat[i][j] == 0) this[i][j] = 0 }.forEach { (i, j) -> listOfNotNull(i.takeIf { it > 0 }?.let { i-1 to j }, j.takeIf { it > 0 }?.let { i to j-1 }).forEach { (ni, nj) -> this[i][j] = minOf(this[i][j], this[ni][nj] + 1) } } .also{(mat.lastIndex downTo 0).flatMap { i -> (mat[0].lastIndex downTo 0).map { i to it } }.forEach { (i, j) -> listOfNotNull(i.takeIf { it < mat.lastIndex }?.let { i+1 to j }, j.takeIf { it < mat[0].lastIndex }?.let { i to j+1 }).forEach { (ni, nj) -> this[i][j] = minOf(this[i][j], this[ni][nj] + 1) } }} } }

