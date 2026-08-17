/*
 * @lc app=leetcode id=2551 lang=kotlin
 *
 * [2551] Put Marbles in Bags
 */

class Solution { fun putMarbles(weights: IntArray, k: Int): Long = (0 until weights.size - 1).map { weights[it].toLong() + weights[it + 1] }.sorted().let { s -> (0 until k - 1).fold(0L) { acc, i -> acc + s[s.size - 1 - i] - s[i] } } }