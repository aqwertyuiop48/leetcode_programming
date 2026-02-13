/*
 * @lc app=leetcode id=371 lang=kotlin
 *
 * [371] Sum of Two Integers
 */

import java.math.BigInteger class Solution { fun getSum(a: Int, b: Int): Int { return BigInteger.valueOf(a.toLong()) .add(BigInteger.valueOf(b.toLong())) .toInt() } }
