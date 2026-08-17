/*
 * @lc app=leetcode id=1010 lang=kotlin
 *
 * [1010] Pairs of Songs With Total Durations Divisible by 60
 */

class Solution {
    fun numPairsDivisibleBy60(time: IntArray): Int = IntArray(60).let { m -> time.fold(0) { acc, t -> (t % 60).let { rem -> acc + m[(60 - rem) % 60].also { m[rem]++ } } } }
}