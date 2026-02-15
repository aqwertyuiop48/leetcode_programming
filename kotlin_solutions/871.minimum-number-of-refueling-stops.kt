/*
 * @lc app=leetcode id=871 lang=kotlin
 *
 * [871] Minimum Number of Refueling Stops
 */

class Solution { fun minRefuelStops(target: Int, startFuel: Int, stations: Array<IntArray>) = stations.indices.fold(IntArray(stations.size + 1).apply { this[0] = startFuel }) { dp, idx -> (idx downTo 0).forEach { t -> if (dp[t] >= stations[idx][0]) { dp[t + 1] = maxOf(dp[t + 1], dp[t] + stations[idx][1]) } }.run { dp } }.indexOfFirst { it >= target } }

