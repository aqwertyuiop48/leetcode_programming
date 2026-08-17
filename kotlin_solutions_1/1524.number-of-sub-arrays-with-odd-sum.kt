/*
 * @lc app=leetcode id=1524 lang=kotlin
 *
 * [1524] Number of Sub-arrays With Odd Sum
 */

class Solution {
    fun numOfSubarrays(arr: IntArray): Int = arr.fold(Triple(1, 0, 0) to 0) { (counts, total), x -> (counts.third + x).let { sum -> (sum % 2).let { nextParity -> if (nextParity == 1) Triple(counts.first, counts.second + 1, 1) to (total + counts.first) % 1000000007 else Triple(counts.first + 1, counts.second, 0) to (total + counts.second) % 1000000007 } } }.second
}