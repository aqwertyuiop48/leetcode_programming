/*
 * @lc app=leetcode id=3044 lang=kotlin
 *
 * [3044] Most Frequent Prime
 */

class Solution { fun mostFrequentPrime(mat: Array<IntArray>): Int = mat.indices.flatMap { r -> mat[0].indices.flatMap { c -> listOf(-1 to -1, -1 to 0, -1 to 1, 0 to -1, 0 to 1, 1 to -1, 1 to 0, 1 to 1).flatMap { (dr, dc) -> generateSequence(r to c) { (cr, cc) -> (cr + dr to cc + dc).takeIf { it.first in mat.indices && it.second in mat[0].indices } }.drop(1).runningFold(mat[r][c]) { num, (cr, cc) -> num * 10 + mat[cr][cc] }.filter { it > 10 && (2..Math.sqrt(it.toDouble()).toInt()).all { d -> it % d != 0 } } } } }.groupingBy { it }.eachCount().entries.maxWithOrNull(compareBy({ it.value }, { it.key }))?.key ?: -1 }