/*
 * @lc app=leetcode id=400 lang=kotlin
 *
 * [400] Nth Digit
 */

class Solution {fun findNthDigit(n: Int): Int = if (n < 10) n else (1..9).map { i -> 9L * Math.pow(10.0, (i - 1).toDouble()).toLong() * i }.let { arr -> arr.runningFold(0L) { sum, v -> sum + v }.let { psum -> psum.indexOfFirst { it >= n }.let { idx -> (idx).let { digitLen -> (n - if (idx > 0) psum[idx - 1] else 0L).let { offset -> ((offset - 1) / digitLen).let { skip -> ((offset - 1) % digitLen).toInt().let { rem -> (Math.pow(10.0, (digitLen - 1).toDouble()).toLong() + skip).toString()[rem] - '0' } } } } } } }}

