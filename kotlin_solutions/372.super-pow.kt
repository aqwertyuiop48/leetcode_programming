/*
 * @lc app=leetcode id=372 lang=kotlin
 *
 * [372] Super Pow
 */

import java.math.* class Solution { fun superPow(a: Int, b: IntArray): Int { return BigInteger.valueOf(a.toLong()) .modPow(BigInteger(b.joinToString("") { it.toString() }), BigInteger.valueOf(1337)) .toInt() } }

