/*
 * @lc app=leetcode id=1191 lang=kotlin
 *
 * [1191] K-Concatenation Maximum Sum
 */

class Solution { fun kConcatenationMaxSum(arr: IntArray, k: Int): Int = arr.fold(0L) { a, b -> a + b }.let { sum -> (if (k == 1) arr else arr + arr).fold(0L to 0L) { (c, m), x -> maxOf(0L, c + x).let { it to maxOf(m, it) } }.second.let { m2 -> ((m2 + if (k > 2 && sum > 0) (k - 2) * sum else 0) % 1000000007).toInt() } } }