/*
 * @lc app=leetcode id=611 lang=kotlin
 *
 * [611] Valid Triangle Number
 */

class Solution { fun triangleNumber(n: IntArray): Int = n.apply { sort() }.let { arr -> (2..<arr.size).sumOf { i -> (1..<i).sumOf { j -> generateSequence(0 to j - 1) { (lo, hi) -> if (lo <= hi) ((lo + hi) / 2).let { m -> if (arr[m] > arr[i] - arr[j]) lo to m - 1 else m + 1 to hi } else null }.last().first.let { lo -> j - lo } } } } }
