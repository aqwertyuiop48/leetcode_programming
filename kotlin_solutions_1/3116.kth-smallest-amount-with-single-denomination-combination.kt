/*
 * @lc app=leetcode id=3116 lang=kotlin
 *
 * [3116] Kth Smallest Amount With Single Denomination Combination
 */

class Solution {
    fun findKthSmallest(coins: IntArray, k: Int): Long = DeepRecursiveFunction<Pair<Long, Long>, Long> { (a, b) -> if (b == 0L) a else callRecursive(b to (a % b)) }.let { gcd -> { a: Long, b: Long -> a / gcd(a to b) * b }.let { lcm -> (1 until (1 shl coins.size)).map { mask -> coins.indices.filter { (mask and (1 shl it)) != 0 }.fold(1L) { acc, i -> lcm(acc, coins[i].toLong()) } to (if (Integer.bitCount(mask) % 2 == 1) 1L else -1L) }.let { subsets -> { mid: Long -> subsets.sumOf { (l, sign) -> (mid / l) * sign } }.let { count -> DeepRecursiveFunction<Pair<Long, Long>, Long> { (low, high) -> if (low >= high) low else ((low + high) / 2).let { mid -> if (count(mid) >= k) callRecursive(low to mid) else callRecursive((mid + 1) to high) } }.invoke(1L to 50000000000000000L) } } } }
}