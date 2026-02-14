/*
 * @lc app=leetcode id=754 lang=kotlin
 *
 * [754] Reach a Number
 */

class Solution { fun reachNumber(target: Int): Int = kotlin.math.abs(target).let { t -> generateSequence(0 to 0) { (step, sum) -> (step + 1) to (sum + step + 1) } .first { (_, sum) -> sum >= t && (sum - t) % 2 == 0 }.first } }