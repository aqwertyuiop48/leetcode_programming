/*
 * @lc app=leetcode id=1846 lang=kotlin
 *
 * [1846] Maximum Element After Decreasing and Rearranging
 */
class Solution { fun maximumElementAfterDecrementingAndRearranging(arr: IntArray): Int = arr.sorted().fold(0) { max, a -> minOf(max + 1, a) } }