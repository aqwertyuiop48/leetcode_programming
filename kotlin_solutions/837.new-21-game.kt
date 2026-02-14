/*
 * @lc app=leetcode id=837 lang=kotlin
 *
 * [837] New 21 Game
 */

class Solution { fun new21Game(n: Int, k: Int, maxPts: Int): Double = (k == 0 || n > k - 1 + maxPts).let { earlyReturn -> if (earlyReturn) 1.0 else DoubleArray(n + 1).apply { this[0] = 1.0 }.let { p -> (1.0 / maxPts).let { pW -> (1 until n + 1).fold(Triple(1.0, 0.0, p)) { (runningPSum, res, arr), i -> (runningPSum * pW).let { pi -> arr.also { it[i] = pi }.let { _ -> (i < k).let { addToSum -> (if (addToSum) runningPSum + pi else runningPSum).let { newSum -> (if (!addToSum) res + pi else res).let { newRes -> (i - maxPts >= 0).let { shouldSubtract -> (if (shouldSubtract) newSum - arr[i - maxPts] else newSum).let { finalSum -> Triple(finalSum, newRes, arr) } } } } } } } }.let { (_, finalRes, _) -> finalRes } } } } }
