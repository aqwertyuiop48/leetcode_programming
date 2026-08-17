/*
 * @lc app=leetcode id=2930 lang=kotlin
 *
 * [2930] Number of Strings Which Can Be Rearranged to Contain Substring
 */

class Solution {
    fun stringCount(n: Int): Int = 1_000_000_007L.let { mod -> { b: Long, e: Long -> java.math.BigInteger.valueOf(b).modPow(java.math.BigInteger.valueOf(e), java.math.BigInteger.valueOf(mod)).longValue() }.let { pow -> pow(26, n.toLong()).let { p26 -> pow(25, n.toLong()).let { p25 -> pow(25, (n - 1).toLong()).let { p25_1 -> pow(24, n.toLong()).let { p24 -> pow(24, (n - 1).toLong()).let { p24_1 -> pow(23, n.toLong()).let { p23 -> pow(23, (n - 1).toLong()).let { p23_1 -> ((3 * p25 + n.toLong() * p25_1) % mod).let { term1 -> ((3 * p24 + 2 * n.toLong() * p24_1) % mod).let { term2 -> ((p23 + n.toLong() * p23_1) % mod).let { term3 -> ((p26 - term1 + term2 - term3) % mod + mod) % mod } } } } } } } } } } }.toInt() }
}