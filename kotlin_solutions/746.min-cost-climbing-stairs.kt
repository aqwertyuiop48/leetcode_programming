/*
 * @lc app=leetcode id=746 lang=kotlin
 *
 * [746] Min Cost Climbing Stairs
 */

class Solution { fun minCostClimbingStairs(cost: IntArray): Int = cost.indices.drop(2).fold(cost[0] to cost[1]) { (prev2, prev1), i -> prev1 to minOf(prev1, prev2) + cost[i] }.let { (a, b) -> minOf(a, b) } }