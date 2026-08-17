/*
 * @lc app=leetcode id=2768 lang=kotlin
 *
 * [2768] Number of Black Blocks
 */

class Solution { fun countBlackBlocks(m: Int, n: Int, coordinates: Array<IntArray>): LongArray = coordinates.flatMap { (r, c) -> listOf(r - 1 to c - 1, r - 1 to c, r to c - 1, r to c).filter { (x, y) -> x in 0 until m - 1 && y in 0 until n - 1 } }.groupingBy { it }.eachCount().values.groupingBy { it }.eachCount().let { counts -> LongArray(5) { i -> if (i == 0) (m - 1).toLong() * (n - 1) - counts.values.sum() else counts.getOrDefault(i, 0).toLong() } } }