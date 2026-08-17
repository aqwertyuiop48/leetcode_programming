/*
 * @lc app=leetcode id=1223 lang=kotlin
 *
 * [1223] Dice Roll Simulation
 */

class Solution {
    fun dieSimulator(n: Int, rollMax: IntArray): Int = (2..n).fold(Array(6) { j -> LongArray(rollMax[j] + 1).apply { this[1] = 1L } }) { prev, _ -> Array(6) { j -> LongArray(rollMax[j] + 1).apply { (2..rollMax[j]).forEach { k -> this[k] = prev[j][k - 1] } }.apply { this[1] = (0..5).filter { it != j }.sumOf { oj -> prev[oj].sum() } % 1000000007 } } }.sumOf { it.sum() }.rem(1000000007).toInt()
}