/*
 * @lc app=leetcode id=835 lang=kotlin
 *
 * [835] Image Overlap
 */

class Solution { fun largestOverlap(a: Array<IntArray>, b: Array<IntArray>): Int = a.size.let { n -> IntArray(n).let { am -> IntArray(n).let { bm -> (0 until n).forEach { i -> (0 until n).forEach { j -> (am[i].shl(1) or a[i][j]).let { am[i] = it }.also { bm[i] = bm[i].shl(1) or b[i][j] } } }.run { ((n + 1) / 2).let { msize -> IntArray(1.shl(msize)).apply { (1 until this.size).forEach { i -> this[i] = 1 + this[i and (i - 1)] } }.let { mb -> (1.shl(msize) - 1).let { mask -> DeepRecursiveFunction<Int, Int> { num -> mb[num and mask] + mb[num shr msize] }.let { bitCount -> (0 until n).flatMap { i -> (0 until n).map { j -> (i until n).fold(intArrayOf(0, 0, 0, 0)) { acc, q -> acc.also { it[0] += bitCount.invoke(am[q].shl(j) and bm[q - i]) }.also { it[1] += bitCount.invoke(bm[q].shl(j) and am[q - i]) }.also { it[2] += bitCount.invoke(am[q].ushr(j) and bm[q - i]) }.also { it[3] += bitCount.invoke(bm[q].ushr(j) and am[q - i]) } }.let { r -> maxOf(maxOf(r[0], r[1]), maxOf(r[2], r[3])) } } }.maxOrNull() ?: 0 } } } } } } } } }
