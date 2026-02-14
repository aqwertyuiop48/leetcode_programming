/*
 * @lc app=leetcode id=440 lang=kotlin
 *
 * [440] K-th Smallest in Lexicographical Order
 */

class Solution { fun findKthNumber(n: Int, k: Int): Int = generateSequence(1 to k - 1) { (current, remaining) -> (current to remaining).takeIf { it.second > 0 }?.let { (curr, rem) -> generateSequence(curr.toLong() to (curr + 1L)) { (p1, p2) -> (p1 * 10 to p2 * 10).takeIf { it.first <= n } }.sumOf { (p1, p2) -> (minOf(n + 1L, p2) - p1).toInt() }.let { steps -> if (steps <= rem) curr + 1 to rem - steps else curr * 10 to rem - 1 } } }.last().first }

