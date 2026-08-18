/*
 * @lc app=leetcode id=3424 lang=kotlin
 *
 * [3424] Minimum Cost to Make Arrays Identical
 */

class Solution {
    fun minCost(arr: IntArray, brr: IntArray, k: Long): Long = arr.indices.sumOf { kotlin.math.abs(arr[it].toLong() - brr[it]) }.let { c1 -> minOf(c1, k + arr.sorted().let { s1 -> brr.sorted().let { s2 -> s1.indices.sumOf { kotlin.math.abs(s1[it].toLong() - s2[it]) } } }) }
}