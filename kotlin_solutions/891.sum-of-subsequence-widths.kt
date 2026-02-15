/*
 * @lc app=leetcode id=891 lang=kotlin
 *
 * [891] Sum of Subsequence Widths
 */

class Solution { fun sumSubseqWidths(nums: IntArray) = nums.sorted().let { sorted -> sorted.indices.fold(0L to 1L) { (sum, pow), i -> ((sum + (sorted[i] - sorted[sorted.lastIndex - i]) * pow) % 1000000007 to (pow * 2 % 1000000007)) }.first.let { (it + 1000000007) % 1000000007 }.toInt() } }

