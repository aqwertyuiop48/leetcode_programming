/*
 * @lc app=leetcode id=1994 lang=kotlin
 *
 * [1994] The Number of Good Subsets
 */

class Solution { fun numberOfGoodSubsets(nums: IntArray): Int = intArrayOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29).let { primes -> IntArray(31).apply { nums.forEach { this[it]++ } }.let { count -> LongArray(1024).apply { this[0] = 1L }.let { dp -> (2..30).fold(dp) { curDp, x -> if (count[x] == 0) curDp else (0..9).fold(0) { m, i -> if (m == -1 || x % (primes[i] * primes[i]) == 0) -1 else if (x % primes[i] == 0) m or (1 shl i) else m }.let { mask -> if (mask == -1) curDp else curDp.clone().apply { (0..1023).forEach { m -> if ((m and mask) == 0) this[m or mask] = (this[m or mask] + curDp[m] * count[x]) % 1000000007 } } } }.let { finalDp -> ((1..1023).sumOf { finalDp[it] } % 1000000007).let { sum -> (0 until count[1]).fold(sum) { acc, _ -> (acc * 2) % 1000000007 }.toInt() } } } } } }