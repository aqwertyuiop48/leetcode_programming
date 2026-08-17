/*
 * @lc app=leetcode id=1588 lang=kotlin
 *
 * [1588] Sum of All Odd Length Subarrays
 */

class Solution { fun sumOddLengthSubarrays(arr: IntArray): Int = arr.indices.sumOf { i -> arr[i] * (((i + 1) * (arr.size - i) + 1) / 2) } }