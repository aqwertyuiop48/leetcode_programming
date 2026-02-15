/*
 * @lc app=leetcode id=885 lang=kotlin
 *
 * [885] Spiral Matrix III
 */

class Solution { fun spiralMatrixIII(rows: Int, cols: Int, rStart: Int, cStart: Int) = mutableListOf(intArrayOf(rStart, cStart)).let { result -> generateSequence(Triple(rStart to cStart, 0, 1)) { (pos, dirIdx, steps) -> (0 until steps).fold(Triple(pos, dirIdx, result)) { (p, d, res), _ -> listOf(0 to 1, 1 to 0, 0 to -1, -1 to 0)[d].let { (dr, dc) -> (p.first + dr to p.second + dc).let { newPos -> Triple(newPos, d, res.apply { if (newPos.first in 0 until rows && newPos.second in 0 until cols) add(intArrayOf(newPos.first, newPos.second)) }) } } }.let { (newPos, _, _) -> Triple(newPos, (dirIdx + 1) % 4, if (dirIdx % 2 == 1) steps + 1 else steps) }.takeIf { result.size < rows * cols } }.last() .run{result.toTypedArray()} } }
