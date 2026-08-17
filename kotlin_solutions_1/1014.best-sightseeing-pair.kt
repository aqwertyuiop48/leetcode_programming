/*
 * @lc app=leetcode id=1014 lang=kotlin
 *
 * [1014] Best Sightseeing Pair
 */

class Solution {
    fun maxScoreSightseeingPair(values: IntArray): Int = values.foldIndexed(0 to values[0]) { j, (maxScore, maxI), v -> if (j == 0) maxScore to maxI else maxOf(maxScore, maxI + v - j) to maxOf(maxI, v + j) }.first
}