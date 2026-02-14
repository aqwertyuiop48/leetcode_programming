/*
 * @lc app=leetcode id=786 lang=kotlin
 *
 * [786] K-th Smallest Prime Fraction
 */

class Solution { fun kthSmallestPrimeFraction(arr: IntArray, k: Int): IntArray = arr.indices.flatMap { i -> ((i + 1) until arr.size).map { j -> i to j } } .sortedBy { (i, j) -> arr[i].toDouble() / arr[j] }[k - 1] .let { intArrayOf(arr[it.first], arr[it.second]) } }
