/*
 * @lc app=leetcode id=218 lang=kotlin
 *
 * [218] The Skyline Problem
 */

class Solution { fun getSkyline(buildings: Array<IntArray>): List<List<Int>> = buildings.flatMap { (l, r, h) -> listOf(l to -h, r to h) } .sortedWith(compareBy({ it.first }, { it.second })) .fold(mutableListOf<Int>() to mutableListOf<List<Int>>()) { (heights, result), (x, h) -> if (h < 0) heights.add(-h) else {heights.remove(h)} .run{heights.sorted().let { sorted ->(sorted.lastOrNull() ?: 0).let { maxHeight ->if (result.isEmpty() || result.last()[1] != maxHeight)result.add(listOf(x, maxHeight))}}.run{heights to result}} }.second }