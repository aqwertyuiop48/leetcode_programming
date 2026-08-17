/*
 * @lc app=leetcode id=1329 lang=kotlin
 *
 * [1329] Sort the Matrix Diagonally
 */

class Solution { fun diagonalSort(mat: Array<IntArray>): Array<IntArray> = mat.also { m -> m.indices.flatMap { r -> m[0].indices.map { c -> r to c } }.groupBy { (r, c) -> r - c }.values.forEach { diag -> diag.map { (r, c) -> m[r][c] }.sorted().zip(diag).forEach { (v, (r, c)) -> m[r][c] = v } } } }