/*
 * @lc app=leetcode id=3453 lang=java
 *
 * [3453] Separate Squares I
 */
class Solution { fun separateSquares(squares: Array<IntArray>): Double = (0..60).fold(0.0 to 2e9) { (l, h), _ -> ((l + h) / 2.0).let { m -> if (squares.sumOf { (it[1] + it[2]).toDouble().let { top -> if (m >= top) it[2].toDouble() * it[2] else if (m <= it[1]) 0.0 else (m - it[1]) * it[2] } } >= squares.sumOf { it[2].toDouble() * it[2] } / 2.0) l to m else m to h } }.second }