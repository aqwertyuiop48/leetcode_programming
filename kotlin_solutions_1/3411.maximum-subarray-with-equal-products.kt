/*
 * @lc app=leetcode id=3411 lang=java
 *
 * [3411] Maximum Subarray With Equal Products
 */

fun maxLength(nums: IntArray): Int = nums.indices.maxOf { i -> (i until nums.size).fold(0 to Triple(1L, 1L, 0L)) { (mL, s), j -> s.let { (p, l, g) -> Triple(minOf(p * nums[j], 2000000001L), if (l == 1L) nums[j].toLong() else (l * nums[j]) / java.math.BigInteger.valueOf(l).gcd(java.math.BigInteger.valueOf(nums[j].toLong())).toLong(), if (g == 0L) nums[j].toLong() else java.math.BigInteger.valueOf(g).gcd(java.math.BigInteger.valueOf(nums[j].toLong())).toLong()) }.let { (np, nl, ng) -> (if (np == nl * ng) maxOf(mL, j - i + 1) else mL) to Triple(np, nl, ng) } }.first }