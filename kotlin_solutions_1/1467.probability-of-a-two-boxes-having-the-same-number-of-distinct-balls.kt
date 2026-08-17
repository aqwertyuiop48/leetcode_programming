/*
 * @lc app=leetcode id=1467 lang=kotlin
 *
 * [1467] Probability of a Two Boxes Having The Same Number of Distinct Balls
 */

class Solution {
    fun getProbability(balls: IntArray): Double = Array(balls.size + 1) { Array(balls.sum() + 1) { arrayOfNulls<Pair<Double, Double>>(17) } }.let { dp -> DeepRecursiveFunction<Triple<Int, Int, Int>, Pair<Double, Double>> { (idx, b1, diff) -> if (idx == balls.size) (if (b1 == balls.sum() / 2) (if (diff == 0) 1.0 else 0.0) to 1.0 else 0.0 to 0.0) else dp[idx][b1][diff + 8] ?: (0..balls[idx]).map { x -> ((1..x).fold(1.0) { a, i -> a * (balls[idx] - i + 1) / i }).let { c -> callRecursive(Triple(idx + 1, b1 + x, diff + (if (x > 0) 1 else 0) - (if (x < balls[idx]) 1 else 0))).let { (f, t) -> (c * f) to (c * t) } } }.reduce { a, b -> (a.first + b.first) to (a.second + b.second) }.also { dp[idx][b1][diff + 8] = it } }.invoke(Triple(0, 0, 0)).let { (f, t) -> f / t } }
}