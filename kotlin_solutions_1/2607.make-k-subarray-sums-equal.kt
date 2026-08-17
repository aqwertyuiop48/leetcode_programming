/* @lc app=leetcode id=2607 lang=kotlin */
class Solution {
    fun makeSubKSumEqual(arr: IntArray, k: Int): Long = arr.size.let { n -> generateSequence(n to k) { (a, b) -> if (b == 0) null else b to a % b }.last().first.let { g -> (0 until g).sumOf { s -> (s until n step g).map { arr[it] }.sorted().let { o -> o.sumOf { kotlin.math.abs(it.toLong() - o[o.size / 2].toLong()) } } } } }
}