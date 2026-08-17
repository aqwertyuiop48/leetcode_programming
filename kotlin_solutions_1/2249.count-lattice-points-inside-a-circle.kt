/*
 * @lc app=leetcode id=2249 lang=kotlin
 *
 * [2249] Count Lattice Points Inside a Circle
 */

class Solution { fun countLatticePoints(circles: Array<IntArray>): Int = (0..200).sumOf { x -> (0..200).count { y -> circles.any { (it[0] - x) * (it[0] - x) + (it[1] - y) * (it[1] - y) <= it[2] * it[2] } } } }