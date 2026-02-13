/*
 * @lc app=leetcode id=335 lang=kotlin
 *
 * [335] Self Crossing
 */

class Solution {fun isSelfCrossing(distance: IntArray): Boolean = distance.indices.drop(3).any { i -> (i >= 3 && distance[i] >= distance[i - 2] && distance[i - 1] <= distance[i - 3]) || (i >= 4 && distance[i - 1] == distance[i - 3] && distance[i] + distance[i - 4] >= distance[i - 2]) || (i >= 5 && distance[i - 2] >= distance[i - 4] && distance[i] + distance[i - 4] >= distance[i - 2] && distance[i - 1] + distance[i - 5] >= distance[i - 3] && distance[i - 1] <= distance[i - 3]) }}