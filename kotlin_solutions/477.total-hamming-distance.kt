/*
 * @lc app=leetcode id=477 lang=kotlin
 *
 * [477] Total Hamming Distance
 */

class Solution { fun totalHammingDistance(nums: IntArray): Int = (0..31).sumOf { bit -> nums.count { it and (1 shl bit) != 0 }.let { ones -> ones * (nums.size - ones) } } }
