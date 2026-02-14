/*
 * @lc app=leetcode id=668 lang=kotlin
 *
 * [668] Kth Smallest Number in Multiplication Table
 */

class Solution { fun findKthNumber(m: Int, n: Int, k: Int): Int = (1 to m * n).let { initial -> generateSequence(initial) { (low, high) -> (low < high).let { hasMore -> hasMore.takeIf { it }?.run { (low + (high - low) / 2).let { mid -> (1..m).sumOf { minOf(n, mid / it) }.run { (if (this >= k) low to mid else (mid + 1) to high) } } } } }.last().first } }
