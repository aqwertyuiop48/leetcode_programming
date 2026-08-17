/*
 * @lc app=leetcode id=3405 lang=java
 *
 * [3405] Count the Number of Arrays with K Matching Adjacent Elements
 */

fun countGoodArrays(n: Int, m: Int, k: Int): Int = (1000000007L).let { mod -> java.math.BigInteger.valueOf(m.toLong()).multiply(java.math.BigInteger.valueOf(m - 1L).modPow(java.math.BigInteger.valueOf(n - k - 1L), java.math.BigInteger.valueOf(mod))).multiply((0 until k).fold(java.math.BigInteger.ONE) { acc, i -> acc.multiply(java.math.BigInteger.valueOf(n - 1L - i)) }.multiply((1..k).fold(java.math.BigInteger.ONE) { acc, i -> acc.multiply(java.math.BigInteger.valueOf(i.toLong())) }.modInverse(java.math.BigInteger.valueOf(mod)))).mod(java.math.BigInteger.valueOf(mod)).toInt() }