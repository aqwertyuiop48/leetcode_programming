/*
 * @lc app=leetcode id=3145 lang=kotlin
 *
 * [3145] Find Products of Elements of Big Array
 */

class Solution { fun findProductsOfElements(queries: Array<LongArray>): IntArray = { n: Long -> (0..50).map { i -> (1L shl i) to (((n + 1) / (2L shl i)) * (1L shl i) + maxOf(0L, (n + 1) % (2L shl i) - (1L shl i))) } }.let { bitCnts -> { k: Long -> generateSequence(0L to 1000000000000000L) { (l, r) -> if (l < r) ((l + r + 1) / 2).let { m -> if (bitCnts(m).sumOf { it.second } <= k) m to r else l to (m - 1) } else null }.last().first.let { n -> bitCnts(n).mapIndexed { i, p -> i * p.second }.sum() + (0..50).filter { i -> ((n + 1) and (1L shl i)) != 0L }.take((k - bitCnts(n).sumOf { it.second }).toInt()).sum() } } }.let { sumBits -> queries.map { q -> generateSequence(Triple(2L % q[2], sumBits(q[1] + 1) - sumBits(q[0]), 1L % q[2])) { (b, e, r) -> if (e > 0) Triple((b * b) % q[2], e shr 1, if (e and 1L != 0L) (r * b) % q[2] else r) else null }.last().third.toInt() }.toIntArray() } }