/*
 * @lc app=leetcode id=699 lang=kotlin
 *
 * [699] Falling Squares
 */

class Solution { fun fallingSquares(positions: Array<IntArray>): List<Int> = positions.fold(mutableListOf<Triple<Int, Int, Int>>() to mutableListOf<Int>()) { (squares, result), (left, side) -> (left until left + side).let { range -> squares.filter { (l, r, _) -> maxOf(l, left) < minOf(r, left + side) }.maxOfOrNull { it.third } ?: 0 }.let { h -> squares.add(Triple(left, left + side, h + side)) .run{ result.add(maxOf(result.lastOrNull() ?: 0, h + side))} .run{  squares to result} } }.second }