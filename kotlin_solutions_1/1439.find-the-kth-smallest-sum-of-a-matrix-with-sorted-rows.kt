/*
 * @lc app=leetcode id=1439 lang=kotlin
 *
 * [1439] Find the Kth Smallest Sum of a Matrix With Sorted Rows
 */

class Solution { fun kthSmallest(mat: Array<IntArray>, k: Int): Int = mat.fold(listOf(0)) { acc, row -> acc.flatMap { s -> row.map { s + it } }.sorted().take(k) }.last() }