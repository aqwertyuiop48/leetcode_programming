/*
 * @lc app=leetcode id=2975 lang=kotlin
 *
 * [2975] Maximum Square Area by Removing Fences From a Field
 */

class Solution { fun maximizeSquareArea(m: Int, n: Int, hFences: IntArray, vFences: IntArray): Int = (hFences + intArrayOf(1, m)).sorted().let { h -> (vFences + intArrayOf(1, n)).sorted().let { v -> h.indices.flatMap { i -> (i + 1 until h.size).map { j -> h[j] - h[i] } }.toSet().let { hSet -> v.indices.flatMap { i -> (i + 1 until v.size).map { j -> v[j] - v[i] } }.filter { it in hSet }.maxOrNull()?.let { d -> ((d.toLong() * d) % 1000000007).toInt() } ?: -1 } } } }