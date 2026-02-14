/*
 * @lc app=leetcode id=849 lang=kotlin
 *
 * [849] Maximize Distance to Closest Person
 */

class Solution { fun maxDistToClosest(seats: IntArray): Int = seats.indices.fold(Triple(0, 0, 0)) { (right, left, maxSum), _ -> (right < seats.size).let { inBounds -> if (!inBounds) Triple(right, left, maxSum) else (seats[right] == 0).let { isEmpty -> if (isEmpty) { (left == 0 || right == seats.size - 1).let { atEdge -> (if (atEdge) right - left + 1 else ((right - left) / 2) + 1).let { bestCurrentDistance -> Triple(right + 1, left, max(maxSum, bestCurrentDistance)) } } } else { Triple(right + 1, right + 1, maxSum) } } } }.let { (_, _, maxSum) -> maxSum } }