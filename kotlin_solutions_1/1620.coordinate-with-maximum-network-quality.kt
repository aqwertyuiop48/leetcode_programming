/*
 * @lc app=leetcode id=1620 lang=kotlin
 *
 * [1620] Coordinate With Maximum Network Quality
 */

class Solution {
    fun bestCoordinate(towers: Array<IntArray>, radius: Int): IntArray = (0..50).flatMap { x -> (0..50).map { y -> x to y } }.maxByOrNull { (x, y) -> towers.sumOf { t -> ((t[0] - x) * (t[0] - x) + (t[1] - y) * (t[1] - y)).let { d2 -> if (d2 <= radius * radius) Math.floor(t[2] / (1 + Math.sqrt(d2.toDouble()))).toInt() else 0 } } }!!.let { (x, y) -> intArrayOf(x, y) }
}