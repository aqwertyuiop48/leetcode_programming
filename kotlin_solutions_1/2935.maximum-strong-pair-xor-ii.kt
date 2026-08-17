/*
 * @lc app=leetcode id=2935 lang=kotlin
 *
 * [2935] Maximum Strong Pair XOR II
 */

class Solution { fun maximumStrongPairXor(A: IntArray): Int = A.sorted().let { sorted -> Array(2) { IntArray(1100000) }.let { child -> IntArray(1100000).let { count -> IntArray(1) { 1 }.let { sz -> { v: Int, d: Int -> (20 downTo 0).fold(0) { u, bit -> ((v shr bit) and 1).let { b -> (if (child[b][u] == 0) sz[0]++.also { child[b][u] = it } else child[b][u]).also { count[it] += d } } } }.let { update -> { v: Int -> (20 downTo 0).fold(0 to 0) { (u, ans), bit -> ((v shr bit) and 1).let { b -> if (child[1 - b][u] != 0 && count[child[1 - b][u]] > 0) child[1 - b][u] to (ans or (1 shl bit)) else child[b][u] to ans } }.second }.let { query -> sorted.foldIndexed(0 to 0) { j, (left, maxAns), x -> update(x, 1).let { (left..j).first { sorted[it] * 2 >= x } }.let { newLeft -> (left until newLeft).forEach { update(sorted[it], -1) }.let { newLeft to Math.max(maxAns, query(x)) } } }.second } } } } } }