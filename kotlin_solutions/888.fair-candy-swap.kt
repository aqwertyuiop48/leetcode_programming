/*
 * @lc app=leetcode id=888 lang=kotlin
 *
 * [888] Fair Candy Swap
 */

class Solution { fun fairCandySwap(aliceSizes: IntArray, bobSizes: IntArray) = ((aliceSizes.sum() - bobSizes.sum()) / 2).let { diff -> bobSizes.toSet().let { bobSet -> aliceSizes.first { it - diff in bobSet }.let { intArrayOf(it, it - diff) } } } }