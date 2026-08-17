/*
 * @lc app=leetcode id=3287 lang=java
 *
 * [3287] Find the Maximum Sequence Value of Array
 */

class Solution {
    fun maxValue(nums: IntArray, k: Int): Int = nums.size.let { n -> { arr: IntArray -> Array(n + 1) { Array(k + 1) { java.util.BitSet(128) } }.apply { this[0][0].set(0).let { arr.forEachIndexed { i, x -> (0..k).forEach { j -> this[i + 1][j].or(this[i][j]).let { if (j > 0) generateSequence(this[i][j - 1].nextSetBit(0).takeIf { it != -1 }) { idx -> this[i][j - 1].nextSetBit(idx + 1).takeIf { it != -1 } }.forEach { v -> this[i + 1][j].set(v or x) } } } } } } }.let { getOrs -> getOrs(nums).let { L -> getOrs(nums.reversedArray()).let { R -> (k..n - k).maxOf { i -> generateSequence(L[i][k].nextSetBit(0).takeIf { it != -1 }) { L[i][k].nextSetBit(it + 1).takeIf { it != -1 } }.maxOfOrNull { v1 -> generateSequence(R[n - i][k].nextSetBit(0).takeIf { it != -1 }) { R[n - i][k].nextSetBit(it + 1).takeIf { it != -1 } }.maxOfOrNull { v2 -> v1 xor v2 } ?: 0 } ?: 0 } } } } }
}