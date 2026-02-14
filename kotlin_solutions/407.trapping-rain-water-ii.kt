/*
 * @lc app=leetcode id=407 lang=kotlin
 *
 * [407] Trapping Rain Water II
 */

class Solution { fun trapRainWater(heightMap: Array<IntArray>): Int = heightMap.size.let { m -> heightMap[0].size.let { n -> Array(m) { IntArray(n) { Int.MAX_VALUE } }.apply { (0 until m).forEach { i -> this[i][0] = heightMap[i][0] .also{this[i][n - 1] = heightMap[i][n - 1]} }.also{(0 until n).forEach { j -> this[0][j] = heightMap[0][j] .also{this[m - 1][j] = heightMap[m - 1][j]} }} }.let { waterLevel -> generateSequence(true) { hasChanged -> (1..m - 2).fold(false) { changed, i -> (1..n - 2).fold(changed) { ch, j -> waterLevel[i][j].let { oldValue -> minOf( waterLevel[i][j], waterLevel[i - 1][j], waterLevel[i][j - 1] ).coerceAtLeast(heightMap[i][j]).also { waterLevel[i][j] = it }.let { ch || (it != oldValue) } } } }.let { forwardChanged -> if (!forwardChanged) null else (m - 2 downTo 1).fold(false) { changed, i -> (n - 2 downTo 1).fold(changed) { ch, j -> waterLevel[i][j].let { oldValue -> minOf( waterLevel[i][j], waterLevel[i + 1][j], waterLevel[i][j + 1] ).coerceAtLeast(heightMap[i][j]).also { waterLevel[i][j] = it }.let { ch || (it != oldValue) } } } }.let { backwardChanged -> if (backwardChanged) true else null } } }.takeWhile { it != null }.count().let { (1..m - 2).sumOf { i -> (1..n - 2).sumOf { j -> waterLevel[i][j] - heightMap[i][j] } } } } } } }
