/*
 * @lc app=leetcode id=1329 lang=kotlin
 *
 * [1329] Sort the Matrix Diagonally
 */

class Solution { fun diagonalSort(mat: Array<IntArray>): Array<IntArray> = mat.also { matrix -> matrix.indices.flatMap { row -> matrix[0].indices.map { column -> row to column } }.groupBy { it.first - it.second }.values.forEach { diagonal -> diagonal.map { matrix[it.first][it.second] }.sorted().zip(diagonal).forEach { pair -> matrix[pair.second.first][pair.second.second] = pair.first } } } }