/*
 * @lc app=leetcode id=3538 lang=kotlin
 *
 * [3538] Merge Operations for Minimum Travel Time
 */

class Solution { fun minTravelTime(l: Int, n: Int, k: Int, positions: IntArray, times: IntArray): Int = IntArray(n).also { pref -> pref[0] = times[0] }.also { pref -> (1 until n - 1).forEach { i -> pref[i] = pref[i - 1] + times[i] } }.let { pref -> Array(k + 1) { Array(n) { IntArray(n + 1) { -1 } } }.let { memo -> DeepRecursiveFunction<Triple<Int, Int, Int>, Int> { (remK, idx, lastPos) -> if (idx == n - 1) if (remK == 0) 0 else 10000000 else if (memo[remK][idx][lastPos] != -1) memo[remK][idx][lastPos] else ((idx + 1)..minOf(n - 1, idx + remK + 1)).minOf { j -> (positions[j] - positions[idx]) * (pref[idx] - (if (lastPos > 0) pref[lastPos - 1] else 0)) + callRecursive(Triple(remK - (j - idx - 1), j, idx + 1)) }.also { memo[remK][idx][lastPos] = it } }.invoke(Triple(k, 0, 0)) } } }