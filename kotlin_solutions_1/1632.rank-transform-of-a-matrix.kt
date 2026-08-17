/*
 * @lc app=leetcode id=1632 lang=kotlin
 *
 * [1632] Rank Transform of a Matrix
 */

class Solution { fun matrixRankTransform(matrix: Array<IntArray>): Array<IntArray> = matrix.size.let { R -> matrix[0].size.let { C -> IntArray(R).let { maxRow -> IntArray(C).let { maxCol -> Array(R) { IntArray(C) }.also { res -> (0 until R).flatMap { r -> (0 until C).map { c -> Triple(matrix[r][c], r, c) } }.groupBy { it.first }.toSortedMap().values.forEach { cells -> IntArray(R + C) { it }.let { p -> DeepRecursiveFunction<Int, Int> { i -> if (p[i] == i) i else call(p[i]).also { p[i] = it } }.let { find -> cells.forEach { (_, r, c) -> find(r).let { rootR -> find(c + R).let { rootC -> p[rootR] = rootC } } }.let { cells.groupBy { (_, r, _) -> find(r) }.values.forEach { group -> (1 + group.maxOf { (_, r, c) -> maxOf(maxRow[r], maxCol[c]) }).let { rank -> group.forEach { (_, r, c) -> res[r][c] = rank.also { maxRow[r] = rank }.also { maxCol[c] = rank } } } } } } } } } } } } }