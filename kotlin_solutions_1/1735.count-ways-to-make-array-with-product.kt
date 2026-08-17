/*
 * @lc app=leetcode id=1735 lang=kotlin
 *
 * [1735] Count Ways to Make Array With Product
 */
class Solution { fun waysToFillArray(queries: Array<IntArray>): IntArray = queries.map { q -> (2..q[1]).fold(q[1] to 1L) { (rem, acc), d -> if (rem < d) rem to acc else generateSequence(rem) { if (it % d == 0) it / d else null }.toList().let { list -> list.last() to (acc * ((0 until list.size - 1).fold(java.math.BigInteger.ONE) { a, i -> a * (q[0] + i).toBigInteger() } / (1 until list.size).fold(java.math.BigInteger.ONE) { a, i -> a * i.toBigInteger() } % 1000000007.toBigInteger()).toLong() % 1000000007) } }.second.toInt() }.toIntArray() }