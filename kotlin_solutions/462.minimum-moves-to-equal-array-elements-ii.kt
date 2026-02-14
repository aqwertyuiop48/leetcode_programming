/*
 * @lc app=leetcode id=462 lang=kotlin
 *
 * [462] Minimum Moves to Equal Array Elements II
 */

class Solution { fun minMoves2(nums: IntArray): Int = nums.sorted().let { sorted -> sorted[sorted.size / 2].let { median -> nums.sumOf { kotlin.math.abs(it - median) } } } }
